import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee {
    
    private LocalDate hireDate;
    
    public Manager(String name, int salary) {
        super(name, salary);
        hireDate = LocalDate.now();
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    
    @Override
    public String toString() {
        return super.toString() + "|" + getHireDate();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj.getClass() != Manager.class) return false;
        
        Manager m = (Manager)obj;
        
        // if (Objects.equals(m.getHireDate(), getHireDate())) {
        //     return true;
        // } else {
        //     return false;
        // }
        
        return Objects.equals(m.getHireDate(), getHireDate());
    }
    
    public static void main(String[] args) {
        Employee jayden = new Manager("Jayden", 1);
        Employee sophia = new Employee("Sophia", 1);
        
        
        if (jayden.equals(sophia)) {
        
        }
    }
}
