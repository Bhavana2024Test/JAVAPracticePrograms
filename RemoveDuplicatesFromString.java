public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String s="programing";
        String rem="";
        int i,j;
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    break;
                }
            }
            if(i==j)
            {
                rem=rem+s.charAt(i);
            }
        }
        System.out.println(rem);
    }
}
