package hrms.try1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.try1.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
