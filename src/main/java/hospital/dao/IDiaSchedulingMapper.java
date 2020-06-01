package hospital.dao;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.DiaScheduling;
import hospital.domain.Employee;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IDiaSchedulingMapper extends BaseMapper<DiaScheduling> {

    @Override
    @Select("select * from Dia_Scheduling")
    List<DiaScheduling> selectAll();
}
