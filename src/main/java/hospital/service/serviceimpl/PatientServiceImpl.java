package hospital.service.serviceimpl;

import hospital.dao.IPatientMapper;
import hospital.domain.Patient;
import hospital.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl extends BaseServiceImpl<Patient> implements IPatientService {

    @Autowired
    private IPatientMapper patientMapper;

    @Override
    public List<Patient> selectAllOrder() {
        return patientMapper.selectAllOrder();
    }

    @Override
    public Patient getDiaRoomByRoomName(String name) {
        return patientMapper.getDiaRoomByRoomName(name);
    }
}
