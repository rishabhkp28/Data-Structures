import java.util.*;
public class Arraylist
{
    public static void main(String args[])
    {
        ArrayList <Integer> list = new ArrayList <Integer>();//no way to fo it here until its already a list
        //leads to error kuno System.out.println(list.get(0));
        list.add(5);
        list.add(65);

        list.add(75);
        list.add(85);
        System.out.println(list);
        ArrayList <Integer> list1 = new ArrayList <Integer>(10);//capacity doesnt hava any significance here
        System.out.println(list.size());//no way to know the capacity
        list1.add(5);
        list1.add(65);
        list1.add(75);
        list1.add(85);
        list1.set(3,89);
        list1.add(4,78);
        list1.add(1,45);
        list1.set(1,987);
        //list.set(6,85);leads to error
        list1.ensureCapacity(10);
        System.out.println(list1);
        System.out.println(list.size());
        //int  A[] = {1,2,3,4,5};
        Integer  A[] = {1,2,3,4,5};
        System.out.println(A.length);
        List <Integer> newlist  = Arrays.asList(A);//no other way
        System.out.println("");
       // List <Integer> ul = new ArrayList<Integer>(capacity);

        ArrayList <Integer> a1 = new ArrayList<Integer>(newlist);
        System.out.println(a1.size());

        System.out.println("-+-+-+++-+-+---+-+-+-+-+-+-+-+++-+");
        // ArrayList <Integer> a7 = new ArrayList<Integer>(10);
        // System.out.println(a7.get(0));
        //no use still shows length 0;

    }
}