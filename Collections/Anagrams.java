package Collections;
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        int i,j;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        System.out.println("Enter the  second String");
        String s2 = sc.nextLine();
        if(s1.length()==s2.length()){
            char [] s3 = new char[s1.length()];
            char [] s4 = new char[s2.length()];
            for(i=0;i<s1.length();i++)
            {
                s3[i]=s1.charAt(i);
            }
            for(i=0;i<s2.length();i++)
            {
                s4[i]=s2.charAt(i);
            }
            for(i=0;i<s1.length();i++){
                for(j=0;j<s2.length();j++)
                {
                    if(s3[i]==s4[j])
                    {
                        count++;
                    }
                }
            }
            if(count==s1.length())
            {
                System.out.println("thats a anagram");
            }
            else
                System.out.println("not an anagram");


        }
        else
            System.out.println("both the strings should be at same size");




    }
}
