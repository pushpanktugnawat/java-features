package features.java21.recordpattern;

public class MainClassToDemonstrate {

    public static void main(String[] args) {
        var account = new Account("pushpank", "xyz-kbc-test-10101");

        // With JAVA 21 a Concrete matching is possible event with parameters
        if(account instanceof Account(String name, String accountNumber)){
            System.out.println("with String :" + name + ": " + accountNumber);
        }
        // this if statement won't work
        if(account instanceof Account(Long name, Long accountNumber)){
            System.out.println(name + ": " + accountNumber);
        }
        account = new Account(1L, 123566L);

        if(account instanceof Account(Long name, Long accountNumber)){
            System.out.println("now this will work " + name + ": " + accountNumber);
        }

        if(account instanceof Account(Long name, String accountNumber)){
            System.out.println("now this will never work " + name + ": " + accountNumber);
        }
    }
}
