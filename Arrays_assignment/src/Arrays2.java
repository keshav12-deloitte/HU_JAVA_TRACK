import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        int count=0;
        int i,j,k,l;
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] a = new int[n];
        System.out.println("enter the elements of array");
        for( i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]+a[j]<0)
                {
                    count++;
                }
                for(k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k]<0)
                    {
                        count++;
                    }
                }
                for(l=k+1;l<n;l++)
                {
                    if(a[i]+a[j]+a[k]+a[l]<0)
                    {
                        count++;
                    }
                }
            }



        }
        System.out.println(count);
    }
}
