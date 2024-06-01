public class matrixmedian
{
        public static int lesserelements(int[][] matrix,int limit)
        {
            int count=0;
            for(int i = 0 ; i< matrix.length;i++)
            {
                int high = matrix[0].length-1;
                int low = 0;
                int answer=-1;// this is in case the all row elements are bigger or equal to
                while(low<=high)//this program is new
                {
                    int mid = low+(high-low)/2;
                    if(matrix[i][mid]<limit)
                    {
                        answer = mid;
                        low = mid+1;
                    }
                    else 
                    {
                       high = mid-1;
                    }
                }
                count += answer+1; 
            }
            return count;
        }
        public static int findMedian(int matrix[][], int m, int n) 
        {
            int max = Integer.MIN_VALUE;
            int min =Integer.MAX_VALUE;
            for(int[] i : matrix)
            {
                if(i[0]<min)
                    min = i[0];
                if(i[n-1]>max)
                    max = i[n-1];
            }
            int left = (m*n-1)/2;
            int answer = -1;
            while(min<=max)
            {
                int assumed = min + (max-min)/2;
                int count = lesserelements(matrix,assumed);
                if(count<= left)
                {
                    answer = assumed;
                    min = assumed+1;
                }
                else 
                max = assumed-1;
            }
            return answer;
    }
    public static void main(String args[])
    {
        int[][] matrix = new int[][]
        {
            {1, 5, 7, 9, 11},
            {2, 3, 4, 8, 9},
            {4, 11, 14, 19, 20},
            {6, 10, 22, 99, 100},
            {7, 15, 17, 24, 28}
        };
        System.out.println(findMedian(matrix, 5,5));


    }
}