package hospital.dao;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.Patient;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPatientMapper extends BaseMapper<Patient> {

    /**
     * 查询当前正在就诊患者
     * @return
     */
   @Override
   @Select("select * from Patient_Queue_Info where Status='叫号'")
    List<Patient> selectAll();

    /**
     * 查询当前所有正在排队患者
     * @return
     */
   @Select("select * from Patient_Queue_Info where Status='排队' order by Queue_sn")
    List<Patient> selectAllOrder();
}
