package Repository;

import Model.EmployeesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("HRService")
public class HRManagerService {
    @Autowired
    private EmployeeRepository emprepository;

    @Autowired
    private DepartmentRepository deptrepository;

    public void test(){
        Iterable<EmployeesEntity> employees = emprepository.findAll();
        employees.forEach(emp -> System.out.println(emp));

        // Find an Employee by id
        Optional<EmployeesEntity> result = emprepository.findById(1);
        result.ifPresent(emp -> System.out.println(emp));

        // Find an Employee by Last Name

        // Count Number of Employees
        Long count = emprepository.count();
        System.out.println("Number of Employees are: " + count);



        // List All Employees
        Iterable<EmployeesEntity> employees1 = emprepository.findAll();
        employees1.forEach(emp -> System.out.println(emp));
    }
}
