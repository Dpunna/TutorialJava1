import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dilipp on 11/12/17.
 */
public class Main {
    public static final int ACCOUNTNUMBER_LENGTH = 6;
    public static void main(String args[]) {
        M250Account m25Account = new M250Account();
        System.out.println("Given account number is " + m25Account.getAccountNum());

        System.out.println("1. Account number should have 6 character length. \n" +
                "2. Account number should should begin with capital letter. \n" +
                "3. All the Characters after the first letter must be digit. \n");

        isValidLength("C1234-");
        isValidStart("C1234-");
        isSpecialChar("C1234-");
    }


    public static boolean isValidLength(String s) {
        if (s.length()==ACCOUNTNUMBER_LENGTH) {
            System.out.println("Entered account number is validLength" +s);
        }
       else {
            System.out.println("Entered account number is invalidLength" +s);
        }
        return false;
    }

    public static boolean isValidStart(String s) {
        if(Character.isLetter(s.charAt(0)) && Character.isUpperCase(s.charAt(0))){
            System.out.println("Valid first character and uppercase");
            return true;
        }
        System.out.println("Not valid because first letter is not uppercase or character or might be entered some special characters");
        return false;
    }

    public static boolean isSpecialChar(String s) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(s);
        if (!matcher.matches()) {
            System.out.println("string '" + s + "' contains special character");
        } else {
            System.out.println("string '" + s + "' doesn't contains special character");
        }
        return false;
    }
}
