package cafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    public String name;
    public int capacity;
    public List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employees.size() < this.capacity) {
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        if (employees.contains(this.name)) {
            employees.remove(name);
            return true;
        } else {
            return false;
        }
    }

    public Employee getOldestEmployee() {
        for (Employee emp : employees) {
            int max = Integer.MIN_VALUE;
            if (emp.getAge() > max) {

            }
        }
        return null;
    }

    public Employee getEmployee(String name) {
        Employee searchEmp = null;
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                searchEmp = emp;
            }
        }

        return searchEmp;
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        return String.format("Employees working at Cafe %s:" + "%n"
                + employees.get(0) + "%n" + employees.get(1), this.name);
    }
}
