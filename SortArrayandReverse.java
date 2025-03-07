public class SortArrayandReverse {
    public static void main(String[] args) {
        int[] a={2,4,6,3,1};
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
           
        }
        for(int k=a.length-1;k>=0;k--)
        {
            System.out.println(a[k]);
        }
    }
}
