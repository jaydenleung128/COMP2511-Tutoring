import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return getName() + "|" + getSalary();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() != Employee.class) return false;
        // if (obj.getClass() != this.getClass()) return false;
        
        Employee emp = (Employee)obj;
        // if (emp.getName().equals(getName()) && emp.getSalary() == getSalary()) {
        //     return true;
        // } else {
        //     return false;
        // }
        
        // if (emp.getName() == getName() && emp.getSalary() == getSalary()) {
        //     return true;
        // } else {
        //     return false;
        // }
        
        if (Objects.equals(emp.getName(), getName()) && emp.getSalary() == getSalary()) {
            return true;
        } else {
            return false;
        }
    }
}
