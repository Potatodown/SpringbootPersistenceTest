package Repository;

import Model.EmployeesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EmployeeRepository extends CrudRepository<EmployeesEntity, Integer> {

    List<EmployeesEntity> findbyLastame(String oacrj);
}
