public class ArrayIsPalindrome {
    public static void main(String[] args) {
        int[] a={1,2,3,2,1};
        
        for(int i=0;i<a.length/2;i++)
        {
            if(a[i]!=a[a.length-i-1])
            {
                System.out.println("array is not  palindrome");
                return;
            }
        }
                System.out.println("array is palindrome");
        
    }
}
