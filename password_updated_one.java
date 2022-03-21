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
    public String checker(String check)
    {
        String check1;
        String check2;
        String check3;
        String check4;
        String check5;
        check1=check.toLowerCase(Locale.ROOT);
        check2=check.toUpperCase(Locale.ROOT);
        check3=check;
        check4=check;
        check5=check;
        if(check==check1)
        {
            return toString();
        }
        if(check==check2)
        {
            return getMessage();
        }
        return check1;
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
