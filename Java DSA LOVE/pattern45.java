public class pattern45
{
       public static void main(String args[])
       {
            for(int i =1; i<= 9;i++)
            {
                for(int j =1;j<=(i<=5?i:(10-i));j++)
                {
                    System.out.print("* ");
                }
                System.out.println("");
           }
           System.out.println("--------------------------------------------------------");
           for(int i =1; i<= 5;i++)
            { 
                for(int j =1; j<= i;j++)
                {
                    System.out.print("*");
                }
                for(int l =1;l<=10-2*i;++l)
                {
                    System.out.print(" ");
                }
                for(int p =1; p<= i;p++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i =4; i>= 1;i--)
            { 
                for(int j =1; j<= i;j++)
                {
                    System.out.print("*");
                }
                for(int l =1;l<=10-2*i;++l)
                {
                    System.out.print(" ");
                }
                for(int p =1; p<= i;p++)
                {
                    System.out.print("*"); 
                }
                System.out.println("");
            }
        }

}
 
 