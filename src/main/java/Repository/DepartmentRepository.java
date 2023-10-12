package Repository;

import Model.DepartmentsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface DepartmentRepository extends CrudRepository<DepartmentsEntity, Integer> {
}
