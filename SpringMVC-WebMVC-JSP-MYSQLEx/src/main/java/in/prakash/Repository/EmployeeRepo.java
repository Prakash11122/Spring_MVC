package in.prakash.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prakash.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
