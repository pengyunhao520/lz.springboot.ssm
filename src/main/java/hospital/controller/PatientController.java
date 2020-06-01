package hospital.controller;

import hospital.domain.Patient;
import hospital.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/patient")
//@Controller
//@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private IPatientService patientService;

    @RequestMapping("/all")
    @ResponseBody
    public List<Patient> getAll(){
       return patientService.getAll();
    }

}
