public class FindNonRepeatingChar {
    public static void main(String[] args) {
        String str = "gibblegabbler";
 
        int frequency[] = new int[256];
 
        for (int i = 0; i < str.length (); i++)
        {
            frequency[str.charAt(i)]++;
     
        }
        for (int i = 0; i < 256; i++)
        {
            if (frequency[i] == 1)
 
            System.out.print ((char) i + " ");
        }
    }
}
