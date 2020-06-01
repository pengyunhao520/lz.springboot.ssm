package hospital.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Blob;
import java.util.Date;

public class DiaScheduling {
    private int ID;

    @JsonProperty("Dia_Room")
    private String DiaRoom;

    @JsonProperty("Reg_Type")
    private String RegType;

    @JsonProperty("Doctor_Code")
    private String DoctorCode;

    private String name;

    @JsonProperty("Out_Call_Time")
    private Date OutCallTime;

    @JsonProperty("Week_Time")
    private String WeekTime;

    @JsonProperty("Job_Name")
    private String JobName;

    private String Specialty;
    private String Remark;

    @JsonProperty("Guide_Id")
    private String GuideId;

    @JsonProperty("Doctor_Image")
    private Blob DoctorImage;

    private String doctorImg;

    private String video;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDiaRoom() {
        return DiaRoom;
    }

    public void setDiaRoom(String diaRoom) {
        DiaRoom = diaRoom;
    }

    public String getRegType() {
        return RegType;
    }

    public void setRegType(String regType) {
        RegType = regType;
    }

    public String getDoctorCode() {
        return DoctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        DoctorCode = doctorCode;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getOutCallTime() {
        return OutCallTime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setOutCallTime(Date outCallTime) {
        OutCallTime = outCallTime;
    }

    public String getWeekTime() {
        return WeekTime;
    }

    public void setWeekTime(String weekTime) {
        WeekTime = weekTime;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getGuideId() {
        return GuideId;
    }

    public void setGuideId(String guideId) {
        GuideId = guideId;
    }

    public Blob getDoctorImage() {
        return DoctorImage;
    }

    public void setDoctorImage(Blob doctorImage) {
        DoctorImage = doctorImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorImg() {
        return doctorImg;
    }

    public void setDoctorImg(String doctorImg) {
        this.doctorImg = doctorImg;
    }
    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    @Override
    public String toString() {
        return "DiaScheduling{" +
                "ID=" + ID +
                ", DiaRoom='" + DiaRoom + '\'' +
                ", RegType='" + RegType + '\'' +
                ", DoctorCode='" + DoctorCode + '\'' +
                ", name='" + name + '\'' +
                ", OutCallTime=" + OutCallTime +
                ", WeekTime='" + WeekTime + '\'' +
                ", JobName='" + JobName + '\'' +
                ", Specialty='" + Specialty + '\'' +
                ", Remark='" + Remark + '\'' +
                ", GuideId='" + GuideId + '\'' +
                ", DoctorImage='" + DoctorImage + '\'' +
                ", doctorImg='" + doctorImg + '\'' +
                ", video='" + doctorImg + '\'' +
                '}';
    }
}
