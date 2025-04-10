import java.util.Arrays;

public class twoStringAnagramOrNot {
    public static void main(String[] args) {
        String s1="listen", s2="silent";
        boolean isana=false;
        char[] a1= s1.toCharArray();
        char[] a2= s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(a1.length != a2.length)
        {
            isana=false;
        }
        else{
            for(int i=0; i<a1.length;i++)
            {
                if(a1[i]==a2[i])
                {
                    isana=true;
                }
                else{
                    isana=false;
                    break;
                }
            }
        }
        if (isana) {
            System.out.println("anagram");
            
        }
        else{
            System.out.println("not a anagram");
        }

        //System.out.println(Arrays.equals(a1,a2));
    }
}
