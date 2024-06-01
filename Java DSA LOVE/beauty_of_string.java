import java.util.Comparator;
public class beauty_of_string {
        public static void main(String[] args) {
            String s = "aabcb";
            int sum=0;
            s=s.toLowerCase();
            for(int i =0;i<=s.length()-1;i++)
            {
                int[] cf = new int[26];
                int maxfreq=1;
                for(int j=i;j<=s.length()-1;j++)
                {
                    int minfreq=Integer.MAX_VALUE;
                    ++cf[s.charAt(j)-97];
                    if(cf[s.charAt(j)-97]>maxfreq)
                        maxfreq = cf[s.charAt(j)-97];
                    for(int k : cf)
                    {
                        if(k < minfreq && k!=0)
                        {
                            minfreq=k;
                        }
                    }
                    sum+=maxfreq-minfreq;

                }
            }
            System.out.println(sum);
        }
    }

