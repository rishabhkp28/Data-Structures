public class Trapping_rainwater {

        public static void main(String args[]) {
            int[] height = new int[]{4,2,0,3,2,5};

            int lmax = 0;
            int rmax = 0;
            int ptr1 = 0;
            int ptr2 = height.length - 1;
            int total = 0;

            while (ptr1 <= ptr2)
            {
                if (height[ptr1]<=height[ptr2])
                {
                    if(lmax>=height[ptr1]) {
                        total += lmax - height[ptr1];
                        ++ptr1;
                    }
                    else{
                        lmax = height[ptr1];
                        ++ptr1;
                    }
                }
                else {
                    if(rmax>=height[ptr2]) {
                        total += rmax - height[ptr2];
                        --ptr2;
                    }
                    else{
                        rmax = height[ptr2];
                        --ptr2;
                    }
            }
        }

            System.out.println(total);
        }


    }

