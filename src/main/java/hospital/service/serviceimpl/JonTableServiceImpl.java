package hospital.service.serviceimpl;

import hospital.dao.IJobTableMapper;
import hospital.domain.JobTable;
import hospital.service.IJonTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class JonTableServiceImpl extends BaseServiceImpl<JobTable> implements IJonTableService {
    @Autowired
    private IJobTableMapper jobTableMapper;
    @Override
    public JobTable selectByPrimaryKey(Serializable id) {
        return jobTableMapper.selectByPrimaryKey(id);
    }
}
