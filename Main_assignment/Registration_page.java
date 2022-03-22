package Main_assignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;

class Employee  extends LoginPage implements Serializable
{
    protected int emp_id;
    protected int age;
    protected int salary;
    protected long contact_No;
    protected String position;


    public Employee(String user_Name,String password)
    {
        super(user_Name,password);
    }
    public Employee(int emp_id,String user_Name,int salary,long contact_No,String position,int age)
    {
        this.emp_id=emp_id;
        this.user_Name=user_Name;
        this.salary=salary;
        this.contact_No=contact_No;
        this.position=position;
        this.age=age;
    }
    public String tostring()
    {
        return "\n Employee details: " +this.emp_id + "\n employee name" +this.user_Name + "\n salary of employee "
                + this.salary + "\n contact number is " + this.contact_No + "age is " + this.age;
    }

}
public class Registration_page extends Employee{

    protected String password1;

    Registration_page(String user_Name,String password)
    {
        super(user_Name,password);
    }

    protected String  checking(String p1,String p2)
    {
        int count=0;

        String old=p1;
        String check=p2;
        char [] old1 = new char[old.length()];
        char [] new1 = new char[check.length()];
        for(int i=0;i<old.length();i++)
        {
            old1[i]=p1.charAt(i);
        }
        for(int i=0;i<check.length();i++)
        {
            new1[i]=check.charAt(i);
        }
        for(int i=0;i<old.length();i++)
        {
            if(old1[i]==new1[i])
            {
                count++;

            }
        }
        if(count!=old.length())
        {

            return "password mismatch in above case please check"+"\n!!Registration Failed!!";
        }
        String check1;
        String check2;
        check1=p1.toLowerCase(Locale.ROOT);
        check2=p1.toUpperCase(Locale.ROOT);
        if(p1.length()<=5)
        {
            return "your password should be more than 5 characters";
        }
        if (!(p1.contains("@") || p1.contains("#")
                || p1.contains("!") || p1.contains("~")
                || p1.contains("$") || p1.contains("%")
                || p1.contains("^") || p1.contains("&")
                || p1.contains("*") || p1.contains("(")
                || p1.contains(")") || p1.contains("-")
                || p1.contains("+") || p1.contains("/")
                || p1.contains(":") || p1.contains(".")
                || p1.contains(", ") || p1.contains("<")
                || p1.contains(">") || p1.contains("?")
                || p1.contains("|")))
        {
            return "your password should have atleast one special character"+"\n!!Registration Failed!!";
        }
        if(check1==p1)
        {
            return "your password should have atleast one uppercase"+"\n!!Registration Failed!!";
        }
        if(check2==p1)
        {
            return "your password should have atleast one lowercase"+"\n!!Registration Failed!!";
        }
        else
            return "password is correct"+"\n!!Registration Successfull!!";

    }
    protected String password_check(String password)
    {
        String check1;
        String check2;
        check1=password.toLowerCase(Locale.ROOT);
        check2=password.toUpperCase(Locale.ROOT);
        if(password.length()<=5)
        {
            return "your password should be more than 5 characters";
        }
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|")))
        {
            return "your password should have atleast one special character"+"\n!!Registration Failed!!";
        }
        if(check1==password)
        {
            return "your password should have atleast one uppercase"+"\n!!Registration Failed!!";
        }
        if(check2==password)
        {
            return "your password should have atleast one lowercase"+"\n!!Registration Failed!!";
        }
        return "your password met our requirements"+"\n!!Registration Successfull!!";
    }
    static void display(ArrayList<Employee> al)
    {
        System.out.println("\n Employee List");
        System.out.println(String.format("%-10s%-15s%-10s%-15s%-10s%-30s", "Emp_Id","Emp_name","Emp_Salary","Emp_contact_no",
                "Emp_position","Emp_Age"));
        for(Employee e : al)
        {
            System.out.println(String.format("%-5s%-20s%-10s%-15s%-20s%-30s",e.emp_id,e.user_Name,e.salary,e.contact_No,e.position,e.age));
        }
    }






}

