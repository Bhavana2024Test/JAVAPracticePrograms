import java.util.Scanner;

public class TakeArrayElementBYUser {
    public static void main(String[] args) {
    
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter");
        int n=s.nextInt();
        int[] a= new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("----------------------------");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
