public class EvenOddNoInArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<a.length;i++)
        {
            if(a[i] %2==0)
            {
                System.out.println("Even number:"+a[i]);
           
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i] %2!=0)
            {
                System.out.println("odd number:"+a[i]);
           
            }
        }
    }
    
}
