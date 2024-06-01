public class SOE
{
    public static void main(String args[])
    {
        int array[] =new int[101];
        for(int i = 2 ; i<=50;i++)
        {
            for(int j = i*i;j<=100;j=j+i)
            {
                array[j]=1;
            }

        }int count = 0;
        for(int i = 2 ;i<=100;++i)
        {
            if(array[i]!=1)
            {
                ++count;
            System.out.println(i);
            }
        }            System.out.println(count);

    }
}