import java.util.Arrays;

public class SecondLargestElementAndSecondSmallestElem {
    public static void main(String[] args) {
        int[] a={1,3,5,6,7,2,4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == a[1])
            {
                System.out.println("second smallest element is: "+a[i]);
            }
            else if(a[i]==a[a.length-2])
            {
                System.out.println("second Largest element is: "+a[i]);
            }
        }
    }
}
