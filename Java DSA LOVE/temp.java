 import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String s1 = sc.next();
        System.out.println("Enter");
        String s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("String------: " + s1);
        int q= sc.nextInt();   
        while(q<=500)
        {
          int a= sc.nextInt();
          int b= sc.nextInt();
          int c= sc.nextInt();
          int term;
            for(int i=1;i<=c;i++)
            {
                term = a+b*(int)(Math.pow(2,i)-1);
                System.out.print(term+" ");
                if(i==c)
                System.out.println("");
            }
            ++q;
        }         
    }
}
    