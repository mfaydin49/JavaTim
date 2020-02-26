package Section_6_OOP_Part_1_Classes_Constructors_Inheritance._2;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();//("123", 0.00, "Bob Marley", "Bob@gmail", "0176 123 1212");
        /*bobsAccount.setNumber("123");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Marley");
        bobsAccount.setCustomerEmailAddress("bobMarley@gmail");
        bobsAccount.setCustomerPhoneNumber("0176 345 5456");*/

        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(101.0);
        bobsAccount.withdrawal(100.0);

        Account fatihAccount = new Account("Fatih", "mfaydin@gmail", "12345");
        System.out.println(fatihAccount.getNumber() + " name " + fatihAccount.getCustomerName());
    }
}
