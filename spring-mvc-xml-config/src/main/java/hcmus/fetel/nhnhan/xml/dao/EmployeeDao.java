package hcmus.fetel.nhnhan.xml.dao;

import java.util.List;

import hcmus.fetel.nhnhan.xml.model.Employee;

public interface EmployeeDao {
    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Employee findBySsn(String ssn);

    void updateEmployee(Employee employee);
}
