package features.java17.patternmatching;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class Employee {

    public Employee(){

    }

    private String name;
    private String designation;
    private BigDecimal salary;

    public Employee(String name, String designation, BigDecimal salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("designation='" + designation + "'")
            .add("salary=" + salary)
            .toString();
    }
}
