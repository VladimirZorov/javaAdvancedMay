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

        return null;
    }

    public Employee getEmployee(String name) {

        return null;
    }

    public int getCount() {
        return employees.size();
    }

    public String report(){
        return String.format("Employees working at Cafe %s: %n");
    }
}
