public class search2dmatrix
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        
            int ul = matrix.length-1;
            int ll= 0;
            while(ul>ll)//this is the condition where loop breaks ,we are not searching the element we want the 
           // row
            {
                int mid = (ll+(ul-ll)/2);
                if(matrix[mid][0]<target&&ul!=ll+1)
                ll = mid;
                else if(matrix[mid][0]>target)
                ul = mid-1;
                else if(ul==ll+1 && matrix[ul][0]>target)
                ul-=1;
                else if(ul==ll+1 && matrix[ul][0] < target)
                ll+=1;
                else
                return true;
            }
            int row = ll;
            ul = matrix[0].length-1;
            ll= 0;
            while(ul>=ll)
            {
                int mid = (ll+(ul-ll)/2);
                if(matrix[row][mid]<target)
                ll = mid+1;
                else if(matrix[row][mid]>target)
                ul = mid-1;
                else
                return true;
            }
            return false;
    }
    public static void main(String args[])
    {
        search2dmatrix obj = new search2dmatrix();
        int matrix[][] = new int[][]{{1},{3}};
        int target = 3;
        boolean result = obj.searchMatrix(matrix,target);
        System.out.println(result);

    }
}

    