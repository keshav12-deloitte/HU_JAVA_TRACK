package Main_assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class First_page extends Registration_page {
    First_page(String password1,String password,String user_Name)
    {
        super(user_Name,password);
        this.password1=password1;
        this.password=password;
    }
    static  String verify_Age(int age)
    {
        if(age>=100 || age<=18)
        {
            System.out.println("You should enter age between 18 and 100");
            System.exit(0);
        }

            return " ";
    }
    static String verify_salary(int salary)
    {

        if(salary<=0)
        {
            System.out.println("enter the correct salary thats is"+"\nNot less than zero");
            System.exit(0);
        }
        return " ";
    }


    public static void main(String[] args) {

        int n;
        int emp_id;
        String user_Name = null;
        String password = null;

        int salary;
        long contact_no;
        String position;
        int age;
        String company_Name;
        ArrayList<LoginPage> al1;
        al1 = new ArrayList<LoginPage>();
        System.out.println("*********--welcome to employee database--********");
        System.out.println("Enter your choice :");
        System.out.println("1.Login");
        System.out.println("2.Register");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n) {
            case (1):
                System.out.println("-------Welcome------");
                System.out.println("Now you are in login Form");
                System.out.println("Please enter the username");
                String user_Name_Check = sc.next();
                System.out.println("Please enter your Password");
                String password_Check = sc.next();
                LoginPage obj1 = new LoginPage();
                try {
                    File f1 = new File("C:\\Users\\vuchander\\Desktop\\Assignments\\EmployeeDataUsers.txt");
                    if (f1.exists()) {
                        try {
                            FileInputStream fos1 = new FileInputStream(f1);
                            for(LoginPage lo : al1){

                                fos1.read((lo.user_Name+ ","+lo.password+"\n").getBytes());
                                if(lo.user_Name==user_Name_Check && lo.password==password_Check)
                                {
                                    System.out.println("login successfull");
                                }
                                else{
                                    System.out.println("Please check your login credentials correctly");
                                }
                            }
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
//                            try {
//                                ois1 = new ObjectInputStream(fis1);
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                            try {
//                                for(LoginPage lo : al1){
//                                    fos.write();
//                                    System.out.println("Test"+lo.user_Name);
//                                }
//                                al1 = (ArrayList<LoginPage>) ois1.readObject();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            } catch (ClassNotFoundException e) {
//                                e.printStackTrace();
//                            }
                    }
                } catch (Exception exp) {
                    System.out.println(exp);
                    exp.printStackTrace();
                }

                    /*ArrayList<LoginPage> al1;
                    al1.add(user_Name="keshav",password_Check="chandu");
                    for (LoginPage e1 : al1) {
                        if (user_Name_Check == e1.user_Name && password_Check == e1.password) {
                            System.out.println("you have logged in successfully");
                        } else {
                            System.out.println("please enter valid details");
                        }
                    }

                     */
                ArrayList<Employee> al = new ArrayList<Employee>();
                File f = null;
                FileInputStream fis = null;
                ObjectInputStream ois = null;
                FileOutputStream fos = null;
                ObjectOutputStream oos = null;
                try {
                    f = new File("C:\\Users\\vuchander\\Desktop\\Assignments\\EmployeeDataList.txt");
                    if (f.exists()) {
                        try {

                            fos = new FileOutputStream(f, true);
                            for(Employee lo1 : al){

                                fos.write((lo1.emp_id+ ","+lo1.user_Name+ ","+lo1.salary+ ","+lo1.contact_No+ ","+lo1.position
                                        + ","+lo1.age+"\n").getBytes());

                            }

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        try {
                            ois = new ObjectInputStream(fis);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            al = (ArrayList<Employee>) ois.readObject();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception exp) {
                    System.out.println(exp);
                }
                int n1;
                do {
                    System.out.println("*********--welcome to employee database--********");
                    System.out.println("1. Add User Data ");
                    System.out.println("2. Update User Data");
                    System.out.println("3. Delete User Data");
                    System.out.println("4. List User Data ");
                    System.out.println("5. Exit   ");
                    System.out.println("enter the choice");
                    n1 = sc.nextInt();
                    switch (n1) {
                        case (1):

                            System.out.println("enter the UserID: ");
                            emp_id = sc.nextInt();
                            System.out.println("enter Name: ");
                            user_Name = sc.next();
                            System.out.println("enter Age: ");
                            age = sc.nextInt();
                            String verify=verify_Age(age);
                            System.out.print(verify);
                            System.out.println("enter Company-Name:");
                            company_Name = sc.next();
                            System.out.println("enter Designation: ");
                            position = sc.next();
                            System.out.println("enter Salary: ");
                            salary = sc.nextInt();
                            String verify1=verify_salary(salary);
                            System.out.print(verify1);
                            System.out.println("enter  Phone Number: ");
                            contact_no = sc.nextInt();
                            al.add(new Employee(emp_id, user_Name, salary, contact_no, position, age));
                            display(al);
                            break;
                        case (2):
                            System.out.println("Enter the Employee ID to Edit details");
                            emp_id = sc.nextInt();
                            int j = 0;
                            for (Employee e : al) {
                                if (emp_id == e.emp_id) {
                                    j++;
                                    do {
                                        int ch1 = 0;
                                        System.out.println("\n Edit Employee Details :\n" +
                                                "1.Name\n" +
                                                "2.salary\n" +
                                                "3.Contact-No\n" +
                                                "4.position\n" +
                                                "5.age\n" +
                                                "6.exit");
                                        System.out.println("Enter the choice");
                                        ch1 = sc.nextInt();
                                        switch (ch1) {

                                            case 1:
                                                System.out.println("\n Enter the new User Name");
                                                sc.next();
                                                e.user_Name = sc.nextLine();
                                                System.out.println(e + "\n");
                                                break;
                                            case 2:
                                                System.out.println("\n Enter the new Salary");
                                                e.salary = sc.nextInt();
                                                System.out.println(e + "\n");
                                                break;
                                            case 3:
                                                System.out.println("\n Enter the new Contact Number");
                                                e.contact_No = sc.nextInt();
                                                System.out.println(e + "\n");
                                                break;
                                            case 4:
                                                System.out.println("\n Enter the new Position");
                                                e.position = sc.nextLine();
                                                System.out.println(e + "\n");
                                                break;
                                            case 5:
                                                System.out.println("\n Enter the new age");
                                                e.age = sc.nextInt();
                                                System.out.println(e + "\n");
                                                break;
                                            case 6:
                                                j++;
                                                break;
                                            default:
                                                System.out.println("\n enter correct choice");
                                        }
                                    } while (j == 1);
                                }
                            }
                            if (j == 0) {
                                System.out.println("\n Employee details are available");
                            }
                            break;
                        case 3:
                            System.out.println("enter the employee Id to delete from data base");
                            emp_id = sc.nextInt();
                            int k = 0;
                            try {
                                for (Employee e : al) {
                                    if (emp_id == e.emp_id) {
                                        al.remove(e);
                                        display(al);
                                        k++;
                                    }
                                }
                                if (k == 0) {
                                    System.out.println("employee details are not available with that id");
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                        case 4:
                            try {
                                al = (ArrayList<Employee>) ois.readObject();

                            } catch (Exception e1) {
                                System.out.println(e1);
                            }
                            display(al);
                            break;
                        case 5:
                            System.out.println("you are closing the file");
                            try {
                                fos = new FileOutputStream(f);
                                oos = new ObjectOutputStream(fos);
                                oos.writeObject(al);
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            } finally {
                                try {
                                    fis.close();
                                    ois.close();
                                    fos.close();
                                } catch (Exception e4) {
                                    System.out.println(e4);
                                    e4.printStackTrace();

                                }
                            }
                            sc.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Please enter valid choices");
                    }
                } while (true);
            case (2):
                System.out.println("you are in registration form");
                System.out.println("enter username");
                user_Name = sc.next();
                System.out.println("enter password");
                password = sc.next();
                System.out.println("re enter password");
                String password1 = sc.next();
                First_page obj = new First_page(password1, password, user_Name);
                String correct = obj.checking(obj.password, obj.password1);
                System.out.println(correct);
                al1.add(new LoginPage(user_Name,password));
                display1(al1);
                File f1 = null;
                FileInputStream fis1 = null;
                ObjectInputStream ois1 = null;
                FileOutputStream fos1 = null;
                ObjectOutputStream oos1 = null;
                try {
                    f1 = new File("C:\\Users\\vuchander\\Desktop\\Assignments\\EmployeeDataUsers.txt");
                    if (f1.exists()) {
                        try {
                            fos1 = new FileOutputStream(f1, true);
                            for(LoginPage lo : al1){

                                fos1.write((lo.user_Name+ ","+lo.password+"\n").getBytes());
                                System.out.println("Test"+lo.user_Name);
                            }
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
//                            try {
//                                ois1 = new ObjectInputStream(fis1);
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                            try {
//                                for(LoginPage lo : al1){
//                                    fos.write();
//                                    System.out.println("Test"+lo.user_Name);
//                                }
//                                al1 = (ArrayList<LoginPage>) ois1.readObject();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            } catch (ClassNotFoundException e) {
//                                e.printStackTrace();
//                            }
                    }
                } catch (Exception exp) {
                    System.out.println(exp);
                    exp.printStackTrace();
                }
                break;
            default:
                System.out.println("enter the choice 1 or 2 ");


        }



    }
}

