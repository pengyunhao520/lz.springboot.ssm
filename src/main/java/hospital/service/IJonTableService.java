package hospital.service;

import hospital.domain.JobTable;

import java.io.Serializable;

public interface IJonTableService extends IBaseService<JobTable> {
    JobTable selectByPrimaryKey(Serializable id);
}
