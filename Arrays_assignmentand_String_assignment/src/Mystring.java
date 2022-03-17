package Arrays_assignmentand_String_assignment.src;

import java.util.Scanner;

public class Mystring {
    public static void main(String[] args) {
        int i,j;
        int n,prev;
        int n1,prev1;
        prev=0;
        prev1=0;n=0;
        n1=0;
        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String 1");
        String s1 = sc.nextLine();
        System.out.println("enter String 2");
        String s2 = sc.nextLine();
        System.out.println("enter String 3");
        String s3 = sc.nextLine();
        char [] s4 = new char[s1.length()];
        char [] s5 = new char[s2.length()];
        char [] s6 = new char[s3.length()];
        for(i=0;i<s1.length();i++)
        {
            s4[i]=s1.charAt(i);
        }
        for(i=0;i<s2.length();i++)
        {
            s5[i]=s2.charAt(i);
        }
        for(i=0;i<s3.length();i++)
        {
            s6[i]=s3.charAt(i);
        }

        for(i=0;i< s6.length;i++)
        {
            for(j=0;j<s4.length;j++)
            {
                if(s6[i] == s4[j])
                {
                    n=j;
                    if(prev > n)
                    {
                        System.out.println("invalid ");
                    }
                    prev=n;
                }

            }

            for(j=k;k<s5.length;k++)
            {
                if(s6[i] == s5[k])
                {
                    n1=k;
                    if(prev1 > n1)
                    {
                        System.out.println("invalid ");
                    }
                    prev1=n1;
                }

            }
        }
        System.out.println("valid");
    }
}
