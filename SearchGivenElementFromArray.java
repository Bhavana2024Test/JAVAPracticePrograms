import java.util.Scanner;

public class SearchGivenElementFromArray {
    public static void main(String[] args) {
        int[] a={1,2,4,3,5};
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number to search");
        int n= s.nextInt();
        boolean result=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println("number found");
                result=true;
                break;
            }
            
        }
      if(!result)
      {
        System.out.println("number not found");
      }
    }
}
