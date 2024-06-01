//this dont work look for leetcode submitted code
public class peak2dmatrix
{
    public static int row(int[][]arr,int col)
    {
            int ll = 0;
            int ul = arr.length-1;
            while(ul>=ll)
            {
                int mid = ll+(ul-ll)/2;
                int right =mid<arr.length-1? arr[mid+1][col]:-1 ;
                int left = mid>0? arr[mid-1][col]:-1 ;
                if(arr[mid][col]>right && left<arr[mid][col])
                {
                    return mid;
                }
                else if(arr[mid][col]>right)
                {
                    ul = mid-1;
                }
                else 
                    ll=mid+1;
            }
            return Integer.MIN_VALUE;
    }
        public static int[] findPeakGrid(int[][] mat) 
        {
            int ll =0;
            int ul = mat[0].length-1;
            while(ll<=ul)
            {
                int mid = ll+(ul-ll)/2;
                int row = row(mat,mid);
                int element = mat[row][mid];
                int left = mid>0?mat[row][mid-1]:-1;
                int right= mid<(mat[0].length-1)?mat[row][mid+1]:-1;
                if(element>left && element>right)
                return new int[]{row,mid};
                else if( element < right )
                {   
                    ll= mid+1;
                }
                else
                {
                    ul= mid-1;
                }
            }
            return new int[]{-1,-1};
        }
    public static void main(String args[])
    {
        int[][] matrix = new int[][]
        {
            {7, 6},
            {2, 5},
            {3, 4},
            {1, 2},
            {2, 1}
        };
        int[] answer = new int[2];
        answer = findPeakGrid(matrix);
        for(int i : answer)
        {
            System.out.println(i);
        }
    }
}