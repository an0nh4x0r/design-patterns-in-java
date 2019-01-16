package in.swapnilsingh.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        EmployeeCSV employeeCSV = new EmployeeCSV("567, Sherlock, Holmes, sherlock@holmes.com");

        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
