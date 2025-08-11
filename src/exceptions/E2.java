package exceptions;
public class E2 { // throw keyword is used for User Defined Exceptions
    public static void checkAge(int age){
        if(age >= 18){
            System.out.println("Access Granted - Eligible to vote.");
        }else {
            throw new RuntimeException("Access Denied - Not Eligible.");
        }
    }
    public static void main(String[] args) {
        checkAge(22);
        checkAge(17);
    }
}
