import java.util.Arrays;
import java.util.List;

public class UserValidator {

    public List<String> cityCodes = Arrays.asList("125", "223", "478");

    // UserValidationFailedException

    public void validate(User user) throws UserValidationFailedException {
        // SSN
        // GYYMMDDCCCXYZ - 13 characters long
        // G - gender (1/2)
        // YY - year
        // MM - month
        // DD - day
        // CCC - city code
        // XYZ - any characters
        if ( user.getSsn().substring(0,1).equals("1")  || user.getSsn().substring(0,0).equals("2")) {
            System.out.println("User has a valid gender");
        } else throw new UserValidationFailedException("Invalid gender");

        int month = Integer.parseInt(user.getSsn().substring(3,5));
        if (month < 12) {
            System.out.println("User has a valid month in the SSN");
        }else throw new UserValidationFailedException("Invalid month");

        int day = Integer.parseInt(user.getSsn().substring(5,7));
        if ((month % 2 == 1 && day <= 31) || (month % 2 == 0 && day <= 30 && month != 2) || (month == 2 && day <= 29)){
            System.out.println("User has a valid day");
        } else throw new UserValidationFailedException("Invalid day");
        int ok = 0;
        for( String city : cityCodes){
            if (user.getSsn().substring(7, 10).equals(city)){
                ok = 1;
                //System.out.println("User has a valid city");
            }
        }
        if (ok == 1){
            //cityCodes.forEach(System.out::println);
            System.out.println("User has a valid city");
        }else throw new UserValidationFailedException("Invalid city");
        //cityCodes.forEach(System.out::println);
    }
}
