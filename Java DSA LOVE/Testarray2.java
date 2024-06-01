class Testarray2{


    public int[] returnarray(int A[])
    {
        System.out.println("We are inside the returnarray function");
        
        return new int[]{1,2,3,5,2};
    }
    public static void main(String args[]){
    
    int a[]={33,3,4,5};
    Testarray2 object = new Testarray2();

    int b[] = object.returnarray(a);   
    for(int i:b)
    System.out.println(i);
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println(a);//reference gets printed
    //now lets print the array members in order
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

    for(int i:a)
    System.out.println(i);
    System.out.println(a==b);
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    b=a;
    System.out.println(b==a);
    for(int i:b)
    System.out.println(i);
    }
}
    