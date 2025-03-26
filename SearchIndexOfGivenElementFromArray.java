import java.util.Scanner;

public class SearchIndexOfGivenElementFromArray {
    public static void main(String[] args) {
        int [] a={1,4,3,4,5,6,4};
        System.out.println("enter elment to search the index");
        Scanner s= new Scanner(System.in);
        int e= s.nextInt();
        boolean res= false;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==e)
            {
                System.out.println("Element " + e +" found at index no. : "+i);
                res= true;
            
            }
        }
        if(!res)
        {
        System.out.println("element not found");
        }
    }
}
