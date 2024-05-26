package features.java17.patternmatching;

public class MainClassToDemonstrate {

    public static void main(String[] args) {
        var employee = new Employee();
        // Old approach CASTING requires as employee1
        if(employee instanceof Employee){
            var employee1 = (Employee) employee;
            System.out.println("employee1 is " + employee1);
        }
        // With JAVA 17
        if(employee instanceof Employee e){
            System.out.println("employee is " + e);
        }
        if(!(employee instanceof Employee e1)){
            throw new IllegalArgumentException("e1 must be an employee");
        }
        System.out.println("employee is " + e1);
    }
}
