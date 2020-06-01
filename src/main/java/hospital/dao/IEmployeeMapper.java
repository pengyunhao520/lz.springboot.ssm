package hospital.dao;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IEmployeeMapper extends BaseMapper<Employee> {
    //@Select("select e.EmployeeCode,d.Doctor_Code,e.EmployeeName,e.Specialty,e.Remark,d.Week_Time from Employee e left outer join Dia_Scheduling d on e.EmployeeCode=d.Doctor_Code")
    @Override
    @Select("select * from Employee")
    List<Employee> selectAll();
}
