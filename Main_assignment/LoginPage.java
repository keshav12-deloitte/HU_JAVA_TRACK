package Main_assignment;

import java.io.Serializable;
import java.security.ProtectionDomain;
import java.util.ArrayList;

public class LoginPage implements Serializable {
    protected String user_Name;
    protected String password;
    LoginPage(String user_Name,String password)
    {
        this.user_Name=user_Name;
        this.password=password;
    }
    LoginPage()
    {
        System.out.println("Welcome to Employee data details");
    }
    static void display1(ArrayList<LoginPage> al1)
    {
        System.out.println("\n Employee UserList");
        System.out.println(String.format("%-5s%-30s","username","Password"));
        for(LoginPage e1 : al1)
        {
            System.out.println(String.format("%-5s%-30s",e1.user_Name,e1.password));
        }
    }
}