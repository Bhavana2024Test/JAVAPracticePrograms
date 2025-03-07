public class StringIsPalindrome {
    public static void main(String[] args) {
        String str="madam";
        String rev="";
        for(int i=0;i<str.length();i++)
        {
            rev=str.charAt(i)+rev;
        }
        if(rev.equals(str))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
