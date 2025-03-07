public class FrequencyOfNumberInArray {
    public static void main(String[] args) {
        int[] a={1,2,2,3,3,3,4,4,4,4,1};
        int[] visited=new int[a.length];
        int flag=-1;
        int count;
        for(int i=0;i<a.length;i++)
        {
            if(visited[i]==flag)
            {
                continue;
            }
            count=1;// we need to set this here because we need to reset for every new element
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    visited[j]=flag;
                }
            }
            System.out.println(a[i]+"->"+count);
        }
       
    }
}
