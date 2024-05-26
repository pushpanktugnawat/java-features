package features.java21.sequencecollection;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

public class Employee {

    private String name;
    private BigDecimal salary;
    private String address;

    public Employee(String name, BigDecimal salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee employee)) {
            return false;
        }
        return Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(address,
            employee.address);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, address);
    }
}
