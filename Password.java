import java.util.Locale;
import java.util.Scanner;
class Password1 extends Exception{
    @Override
    public String getMessage() {
        return "your password should have uppercase";
    }

    @Override
    public String toString() {
        return "your password should have lowercase";
    }
    static void checker (String check)
    {
        String check1;
        String check2;
        String check3;
        String check4;
        String check5;
    }
}
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String pass=sc.next();
            String pass1=pass.toLowerCase(Locale.ROOT);
            String pass2=pass.toUpperCase(Locale.ROOT);
            if(pass1==pass)
            {
                throw new Password1();

            }
            else if(pass1==pass)
            {
                throw new Password1();
            }
            else
            {
                System.out.println("correct");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
