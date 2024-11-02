import java.util.*;
public class lemonade {
    /*Lets make  this question a little tougher
        Assume that you have a array of dominions and array of quantity of each dominion
        (initially empty it populates
        as the customer pays) .You have been given an array of customers who
        pay you something among the given dominions ,you have a deduct the 5 dollar  and then return the
        rest money to the customer in such a way that minimum coins are used

        You have to return whether you will be able to pay all of them or not
        */
    public static void main(String args[])
    {
        int []bills = new int[]{5,5,10,5,20,20,20,10,5,10};

        int[]  quan = new int[3];
        int [] dom = new int[]{5,10,20};
        for(int i : bills)
        {

            if (i == 5) {
                quan[0] += 1;
            }
            else
            {
                int change = i - 5;
                int oul = dom.length-1;
                int oll = 0;
                oul = dom.length - 1;
                while (oll <= oul)
                {
                    int ll = 0;
                    int ul = oul;
                    int ans = 0;
                    if (change == 0)
                    {
                        //update the bill quantity i got
                        int x = 0;
                        int y = dom.length - 1;
                        int mid = 0;
                        while (x <= y)
                        {
                            mid = (x + y) / 2;
                            if (dom[mid] < i)
                                x = mid + 1;
                            else if (dom[mid] > i)
                                y = mid - 1;
                            else
                                break;
                        }
                        ++quan[mid];
                        break;
                    }
                    while (ll <= ul) {
                        int mid = ll + (ul - ll) / 2;
                        if (dom[mid] <= change) {
                            ans = mid;
                            ll = mid + 1;
                        } else {
                            ul = mid - 1;
                        }
                    }

                    if (quan[ans] * dom[ans] >= change) {
                    /*if we have the total money of that dominion greater than
                    change then lets calculate the left over quantity for that dominion*/
                        quan[ans] = quan[ans] - change / dom[ans];

                        change = change - dom[ans] * (change / dom[ans]);

                        //left out change;
                    } else {
                        change = change - quan[ans] * dom[ans];//even if quantity of dominion is 0 this gets executed
                        quan[ans] = 0;
                        oul = ans - 1;
                        //as the change is still left, there are chances that we get stagnation hereso we did ans-1 = oul
                        //now we need to provide only the left ones
                        //to form the change
                    }

                }
                if (oul < oll)
                {
                    System.out.println(false);
                    return;
                }

            }

        }
        System.out.println(true);
    }

}

