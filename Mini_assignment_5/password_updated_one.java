package Mini_assignment_5;

import java.util.Locale;
import java.util.Scanner;
class Password12 extends Exception
{
    @Override
    public String getMessage() {
        return "your password should have Lowercase";
    }

    @Override
    public String toString() {
        return "your password should have first letter as uppercase";
    }

    @Override
    public String getLocalizedMessage() {
        return "your password should have more than 5 characters";
    }
    public String chara()
    {
        return "your password should have special symbols";
    }



    public String checker(String check)
    {
        int count=0;
        String check1;
        String check2;
        String check3;
        String check4;
        String check5;
        check1=check.toLowerCase(Locale.ROOT);
        check2=check.toUpperCase(Locale.ROOT);
        check3=check;
        check5=check;
        if(check==check1)
        {
            return toString();
        }
        if(check==check2)
        {
            return getMessage();
        }
        if(check3.length()<=5)
        {
            return getLocalizedMessage();
        }

        if (!(check.contains("@") || check.contains("#")
                || check.contains("!") || check.contains("~")
                || check.contains("$") || check.contains("%")
                || check.contains("^") || check.contains("&")
                || check.contains("*") || check.contains("(")
                || check.contains(")") || check.contains("-")
                || check.contains("+") || check.contains("/")
                || check.contains(":") || check.contains(".")
                || check.contains(", ") || check.contains("<")
                || check.contains(">") || check.contains("?")
                || check.contains("|")))
        {
            return chara();
        }



        return check1+ "your password is in correct format";
    }
}
public class password_updated_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String pass = sc.next();
            Password12 n1 = new Password12();

            String wrong=n1.checker(pass);
            System.out.println(wrong);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
