package user;

import userValidationTest.UserValidationFailedException;

import java.util.Arrays;
import java.util.List;

import static java.lang.Character.isDigit;

public class UserValidator {

    //private User user = new User("1981018223777");
    public List<String> cityCodes = Arrays.asList("123","223","478");

    public boolean  ValidateGender(String ssn) throws UserValidationFailedException{
        char c = ssn.charAt(0);
        if( isDigit(c) ){
            if( c == '1' || c == '2'){
                return true;
            }else{
                throw new UserValidationFailedException("!! Not a valid Gender Number");
            }
        }else {
            throw new UserValidationFailedException("!! Gender must be a DIGIT");
        }
    }

     public boolean ValidateBirthDate(String date) throws UserValidationFailedException{
            //YYMMDD
         int valid = 0;
         try{
             Integer year  = Integer.parseInt(date.substring(0,2));
             Integer month = Integer.parseInt(date.substring(2,4));
             Integer day = Integer.parseInt(date.substring(4));
             if(year != 0 && (month > 0 &&  month < 13) && (day > 0 && day < 32))
             { return true ;}
             else {     return false;    }
         } catch (NumberFormatException e){
             throw new NumberFormatException("!! Wrong birth Date Format");
         }

    }

    public boolean ValidateCityCode(String cityCode) throws UserValidationFailedException{
        Integer code;
            try {
                 code = Integer.parseInt(cityCode);
            } catch( NumberFormatException e){
                throw new NumberFormatException("!! Please check that the city code is a NUMBER.");
            }

           System.out.println(code);

            for(int i = 0; i < cityCodes.size(); i++){
                Integer listCode = Integer.parseInt(cityCodes.get(i));
                System.out.println(listCode);
                if( code == listCode){
                    return true;
                }
            }
            throw new UserValidationFailedException("!! The city code does not match any current known code.");
    }

    public boolean ValidateLast3( String str) {

        Integer xyz ;
       try {
           xyz = Integer.parseInt(str);
       }catch (NumberFormatException e){
           throw new NumberFormatException("!! Last 3 should be a NUMBER");
       }

       System.out.println("Last 3 => " + xyz);
       return true;

    }

    //userValidation fail Exceoption
    public void validate(User user){
        //SSN
        String ssn = user.getSsn();
        if( ssn != null ){
            if (ssn.length() != 13){
                throw new UserValidationFailedException("Wrong length for the SSN");
            }
        }
        if( ValidateGender(ssn) && ValidateBirthDate(ssn.substring(1,7)) && ValidateCityCode(ssn.substring(7,10))
                && ValidateLast3(ssn.substring(10))){
            System.out.println("All good, mate!");
        }
       //GYYMMDDCCCXYZ = 13 chars
        //G - 1/2
        //CCC - city code
        //XYZ any chars
    }
}
