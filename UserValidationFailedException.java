package userValidationTest;

public class UserValidationFailedException extends RuntimeException {
    public UserValidationFailedException(){

    }
    public UserValidationFailedException(String mes){
        System.out.println(mes);
    }
}
