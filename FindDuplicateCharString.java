public class FindDuplicateCharString {
    public static void main(String[] args) {
        String str="thisisprogprog";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
 
                }
            }
        }
        System.out.println(count);
    }
}
