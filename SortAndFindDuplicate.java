public class SortAndFindDuplicate {
    public static void main(String[] args) {
        int[] a={2,3,4,2,3,4,5,6,56,1};
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
            for(int k=i+1;k<a.length;k++)
            {
                if(a[k]==a[i])
                {
                    System.out.println(a[k]);
                }
            }
        }
        
    }
}
