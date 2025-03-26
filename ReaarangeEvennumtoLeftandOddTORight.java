import java.util.Arrays;

public class ReaarangeEvennumtoLeftandOddTORight {
    public static void main(String[] args) {
        int[] a={1,3,2,4,6,7};
        int i=0;
       
        //first sort the array 
       Arrays.sort(a);
      //System.out.println(Arrays.toString(a));
       //rearange the array
        for(int j=0;j<a.length;j++)
        {
            if(a[j]%2==0)
            {
            int temp =a[i];
            a[i]=a[j];
            a[j]=temp;
           i++;
            }

        }
        System.out.println("array: "+ Arrays.toString(a));
    }
    
}
