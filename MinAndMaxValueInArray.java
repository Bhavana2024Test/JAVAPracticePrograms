public class MinAndMaxValueInArray {
    public static void main(String[] args) {
        int[] a={1,2,3,5,4};
        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            
                if(a[i]>max)
                {
                    max=a[i];
                }
                if(a[i]<min)
                {
                    min=a[i];
                }
            
        }
        System.out.println("Min: "+min+" Max: "+max);
    }
}
