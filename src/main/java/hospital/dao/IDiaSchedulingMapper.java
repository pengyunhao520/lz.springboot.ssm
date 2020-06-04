package hospital.dao;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.DiaScheduling;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IDiaSchedulingMapper extends BaseMapper<DiaScheduling> {

    /**
     * 查询所有医生排班
     * @return
     */
    @Override
    @Select("select * from Dia_Scheduling")
    List<DiaScheduling> selectAll();
}
