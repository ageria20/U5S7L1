package ageria.u5s7l1.repositories;

import ageria.u5s7l1.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    boolean existsByEmail(String email);


}


