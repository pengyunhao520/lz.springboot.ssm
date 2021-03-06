package hospital.controller;

import hospital.domain.DiaRoom;
import hospital.domain.DiaScheduling;
import hospital.domain.Employee;
import hospital.domain.Patient;
import hospital.service.*;
import hospital.util.TestImage;
import hospital.util.Week;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/hospital")
public class EmployeeController<list> {
    @RequestMapping("/main")
    public String index(){
        return "main";
    }

    @Autowired
    //@Qualifier("employeeService")
    private IEmployeeService employeeService;
    @Autowired
    private IDiaSchedulingService diaSchedulingService;
    @Autowired
    private IPatientService patientService;
    @Autowired
    private IDiaRoomService diaRoomService;
    @Autowired
    private IJonTableService jonTableService;

    /**
     * 获取客户端ip
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        System.out.println(ip);
        if (ip.contains(",")) {
            return ip.split(",")[0];
        } else {
            return ip;
        }
    }

    /**
     * 查询当前值班医生
     * @return
     */
    @RequestMapping("/doctorAll")
    @ResponseBody
    public List allDoctor(HttpServletRequest request) throws IOException {
        //查询当前日期是一周的第几天
        Date today = new Date();
        Calendar c =Calendar.getInstance();
        c.setTime(today);
        int weekday=c.get(Calendar.DAY_OF_WEEK);
        //创建util中的Week对象
        Week week = new Week();
        //新建一个list接收按照星期排班的医生
        List list = new ArrayList();
        //创建图片处理对象
        TestImage testImage = new TestImage();
        //创建获取ip对象
        String ipAddr = getIpAddr(request);
        DiaRoom diaRoom = diaRoomService.getDiaRoom(ipAddr);
        System.out.println(diaRoom);

        //查询所有医生
        List<Employee> emp = employeeService.getAll();
        //查询所有医生排班
        List<DiaScheduling> dia = diaSchedulingService.getAll();
        for (DiaScheduling diaScheduling : dia) {
            for (Employee employee : emp) {
                //判断医生编号是否相等
                //将医生编号相等的医生姓名添加到diaScheduling
                if (week.weekDay(weekday).equals(diaScheduling.getWeekTime()) && employee.getEmployeeCode().equals(diaScheduling.getDoctorCode())) {
                    if (diaRoom.getIpAddess().equals(ipAddr) && diaRoom.getRoomCode().equals(diaScheduling.getDiaRoom())) {
                        //将当前星期和数据库星期相等的添加到list中
//                        diaScheduling.setDoctorImg(testImage.blobToBase64(diaScheduling.getDoctorImage()));
                        diaScheduling.setSpecialty(diaRoom.getRoomName());
                        diaScheduling.setName(employeeService.getOne(diaScheduling.getDoctorCode()).getEmployeeName());
                        diaScheduling.setJobName(jonTableService.selectByPrimaryKey(diaScheduling.getJobName()).getJobName());
                        list.add(diaScheduling);
                        System.out.println("diaRoom:" + diaRoom);
                    }
                }
            }
        }
        System.out.println("list"+list);
        return list;
    }

    /**
     * 查询当前就诊患者
     * @return
     */
    @RequestMapping("/patientAll")
    @ResponseBody
    public List<Patient> getAll(HttpServletRequest request) throws IOException {
        List patientList=new ArrayList();
        List<DiaScheduling> dia = allDoctor(request);
        List<Patient> allPatient = patientService.getAll();
        for (Patient patient:allPatient) {
            for (DiaScheduling doctor: dia) {
                DiaRoom diaRoomByRoomName = diaRoomService.getDiaRoomByRoomName(patient.getDiaRoom());
                if (diaRoomByRoomName!=null) {
                    if (doctor.getDiaRoom().equals(diaRoomByRoomName.getRoomCode())) {
                        patientList.add(patient);
                    }
                }
            }
        }
       return patientList;
    }

    /**
     * 查询当前排队患者
     * @return
     */
    @RequestMapping("/patient")
    @ResponseBody
    public List<Patient> selectAllOrder(HttpServletRequest request) throws IOException {
        List patientList=new ArrayList();
        List patientList1=new ArrayList();
        List<DiaScheduling> dia = allDoctor(request);
        List<Patient> allPatient = patientService.selectAllOrder();
        System.out.println("::::::::::::::::::::::"+allPatient);
        System.out.println("dia"+dia);
        for (Patient patient:allPatient) {
            for (DiaScheduling doctor: dia) {
                DiaRoom diaRoomByRoomName = diaRoomService.getDiaRoomByRoomName(patient.getDiaRoom());
                if (diaRoomByRoomName!=null){
                    if(doctor.getDiaRoom().equals(diaRoomByRoomName.getRoomCode())){
                        patientList.add(patient);
                    }
                }

            }
        }
        patientList1.add(patientList.get(0));
        return patientList1;
    }

    /**
     * 加载视频文件
     * @param request
     * @param response
     * @throws IOException
     */
   /* @RequestMapping("/video")
    public void getVideoPath(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String videoPath=null;
        List<DiaScheduling> diaScheduling = diaSchedulingService.getAll();
        FileInputStream fis = null;
        OutputStream os = null;
        try {
            //查询当前日期是一周的第几天
            Date today = new Date();
            Calendar c =Calendar.getInstance();
            c.setTime(today);
            int weekday=c.get(Calendar.DAY_OF_WEEK);
            //创建util中的Week对象
            Week week = new Week();
            for (DiaScheduling dia:diaScheduling) {
                //
                if (week.weekDay(weekday).equals(dia.getWeekTime())){
                    videoPath=dia.getVideo();
                }
            }

            //创建输入流
            fis = new FileInputStream(videoPath);
            //os用于输出字符流数据或者二进制的字节流数据都可以。
            os = response.getOutputStream();
            int count = 0;
            //开始读，每次读1024*8
            byte[] buffer = new byte[1024 * 8];
            //将filepath的文件放入buffer作为内存缓冲区并获得可读的长度len
            while ((count = fis.read(buffer)) != -1) {
                //写到OutputStream中，每次都是从buffer内存处的0偏移开始写，每次写count字节
                os.write(buffer, 0, count);
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}
