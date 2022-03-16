import java.io.PrintStream;
public class Create extends Animals {

    public static void main(String[] args) {
            Animals obj2 = new Animals();
            obj2.seta(101);
            obj2.setb("Keshav");
            obj2.setc(18);
            PrintStream var10000 = System.out;
            int var10001 = obj2.geta();
            var10000.println(var10001 + " " + obj2.getb() + " " + obj2.getc());
        }
    }

