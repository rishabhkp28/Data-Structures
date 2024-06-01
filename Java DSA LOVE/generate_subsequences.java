import java.util.*;
public class generate_subsequences {
    public static void generator(List <List<Integer>> list,int[] arr,int index,List <Integer> inner)
    {

        if(index>arr.length-1) {
            list.add(new ArrayList<Integer>(inner));
            return;
        }
        inner.add(  arr[index] );
        generator(list,arr,index+1,inner);
        //backtrack
        inner.remove(inner.size()-1);
        //above step as we dont want last last element in above
        //recursion call ,this was due to fact that the same
        //reference is being shared everywhere
        generator(list,arr,index+1,inner);

    }
    public static void main(String args[])
    {
        List <List<Integer>> list = new ArrayList<>();
        int[] arr = new int[]{1,3,2};
        List<Integer> inner = new ArrayList<>();
        generator(list,arr,0, inner);
        System.out.println(list);
    }
}
