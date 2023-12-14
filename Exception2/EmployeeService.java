package com.infy.assignment.exceptionhandling;

public class EmployeeService {
    public void checkEmployeeSalary(Employee emp) throws EmpSalaryException {
        // Write the code here to check employee salary
        if (emp.getEmpSalary() < 1000) {
            throw new EmpSalaryException("Employee salary is too low: " + emp.getEmpSalary());
        }
        // Additional conditions and business logic can be added as needed
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Joe Smith", 20, 5345);
        Employee e2 = new Employee("Lewis Jane", 21, 1345);
        Employee e3 = new Employee("Larry Page", 22, 245);
        Employee e4 = new Employee("Smith James", 23, 945);
        Employee e5 = new Employee("Elvis George", 25, 1425);
        EmployeeService empser = new EmployeeService();
        Employee[] emparray = { e1, e2, e3, e4, e5 };

        for (Employee employee : emparray) {
            try {
                // Call checkEmployeeSalary with appropriate exception handling code
                empser.checkEmployeeSalary(employee);
                System.out.println("Employee salary is acceptable for: " + employee.getEmpName());
            } catch (EmpSalaryException e) {
                System.out.println("Exception: " + e.getMessage());
                // Handle the exception or log it as needed
            }
        }
    }
}
