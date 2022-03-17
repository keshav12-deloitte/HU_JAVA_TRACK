package Arrays_assignmentand_String_assignment.src;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c;


        char [] s1 = new char[a.length()];
        for(i=0;i<a.length();i++)
        {
            s1[i]=a.charAt(i);
        }
        char [] s2 = new char[b.length()];
        for(i=0;i<b.length();i++)
        {
            s1[i]=b.charAt(i);
        }
        char [] s3 = new char[a.length()+b.length()];
        for(i=0;i<a.length();i++)
        {
            for(j=i;j<b.length();j++)
            {
                s3[j]=b.charAt(i);
            }
            for(k=j+1;k<a.length();k++)
            {
                s3[k]=b.charAt(i);
            }
            for(char elem : s3)
            {
                System.out.print(elem);
            }


        }


    }
}
