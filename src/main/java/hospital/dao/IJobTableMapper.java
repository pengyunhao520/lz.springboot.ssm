package hospital.dao;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.JobTable;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

public interface IJobTableMapper extends BaseMapper<JobTable> {
    @Override
    @Select("select * from Job_Table where serial_No=#{serialNo}")
    JobTable selectByPrimaryKey(Serializable id);
}
