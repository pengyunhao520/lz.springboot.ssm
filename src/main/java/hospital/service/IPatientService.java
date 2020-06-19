package hospital.service;

import hospital.domain.Patient;

import java.util.List;

public interface IPatientService extends IBaseService<Patient>{
    List<Patient> selectAllOrder();
    Patient getDiaRoomByRoomName(String name);
}

