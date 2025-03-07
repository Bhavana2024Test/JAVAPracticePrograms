public class FindTheLongestWordFrmSentence {
    public static void main(String[] args) {
        String s,w="",lw="";
        int i;
       s="this is the happiest day in practices program";
        for(i=0; i<s.length(); i++)
        {
            if(i<s.length() && s.charAt(i)!=' ')// Check if `i` reaches the end of the string or a space is found
            {
                //concatenates the character until we find a space
                w=w+s.charAt(i);
            }
            else
            {
                // check if current word length is greater than longest word (lw)
                if(w.length()>lw.length())
                {
                    lw=w;
                }
                w="";//reset for next word
            }
        }
       
 
        System.out.println("Longest word = "+lw);
    }
}
