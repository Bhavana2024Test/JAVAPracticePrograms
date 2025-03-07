public class FindDuplicateNumberInArray
{
    public static void main(String[] args) {
        int[] a={1,2,3,5,6,2,4,3,5};
        for(int i=0;i< a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]==a[i])
                {
                    System.out.println(a[j]);
                }
            }
        }
    }
}