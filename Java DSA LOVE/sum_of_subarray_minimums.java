import java.util.*;
public class sum_of_subarray_minimums {
        public static void main(String args[])
        {
            int arr[] = new int[]{1,5,1};

            Stack<Integer> stack = new Stack<>();
            stack.push(arr.length-1);
            int[] arr1 = new int[arr.length];
            int[] arr2 = new int[arr.length];
            arr1[arr.length-1] = -1;
            arr2[0] = -1;

            for(int i =arr.length-2;i>=0;i--)
            {
                if(arr[stack.peek()]<arr[i])
                {
                    arr1[i] = stack.peek();
                    stack.push(i);
                }
                else
                {
                    while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                        stack.pop();

                    if(stack.isEmpty())
                    {
                        arr1[i]= -1;
                        stack.push(i);
                    }
                    else
                    {
                        arr1[i] = stack.peek();
                        stack.push(i);
                    }
                }

            }

            stack.clear();

            stack.push(0);


            for(int i =1;i<=arr.length-1;i++)
            {
                if(arr[stack.peek()]<arr[i])
                {
                    arr2[i] = stack.peek();
                    stack.push(i);
                }
                else
                {
                    while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                        stack.pop();

                    if(stack.isEmpty())
                    {
                        arr2[i]= -1;
                        stack.push(i);
                    }
                    else
                    {
                        arr2[i] = stack.peek();
                        stack.push(i);
                    }
                }
            }
            int ll =0;
            int rl = 0;

            double total =0;
            for(int i =0;i<=arr.length-1;i++)
            {
                if(arr1[i]==-1)
                    rl = arr.length-1;
                else
                    rl = arr1[i]-1;

                if(arr2[i]==-1)
                    ll = 0;
                else
                    ll = arr2[i]+1;

                total = total + ((double)(rl-i+1))*(i-ll+1)  * arr[i];


            }

            System.out.println(total);
        }
    }

