package hospital.dao;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.Patient;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPatientMapper extends BaseMapper<Patient> {
   @Override
   @Select("select * from Patient_Queue_Info where Status='叫号'")
    List<Patient> selectAll();

   @Select("select * from Patient_Queue_Info where Status='排队' order by Queue_sn")
    List<Patient> selectAllOrder();
}
