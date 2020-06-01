package hospital.service.serviceimpl;

import hospital.domain.Employee;
import hospital.service.IEmployeeService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component("employeeService")
//@Primary
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements IEmployeeService {
}
