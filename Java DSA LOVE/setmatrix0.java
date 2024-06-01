public class setmatrix0 {
    public static void setZeroes(int[][] matrix) {
    int columnflag = 1;
    int rowflag = 1;
    for(int i = 0;i<=matrix[0].length-1;i++)
    {
            if(matrix[0][0]==0)
            {
                columnflag=0;
                rowflag=0;
                break;
            }
            else if(matrix[0][i]==0)
            {
                rowflag=0;
                break;
            }
            else
            continue;
        
    }
    for(int i = 0;i<=matrix.length-1;i++)
    {
        if(matrix[0][0]==0)
        {
            columnflag=0;
            rowflag=0;
            break;
        }
        else if(matrix[i][0]==0)
        {
            columnflag = 0;
            break;
        }
    }
    for(int i = 1;i<=matrix.length-1;i++)
    {
        for(int j = 1;j<=matrix[i].length-1;j++)
        {
            if(matrix[i][j]==0)
            {
                matrix[i][0]=0;
                matrix[0][j]=0;
            }
            else
            continue;
        }
    }
    for(int i = 1;i<=matrix.length-1;i++)
    {
        for(int j = 1;j<=matrix[i].length-1;j++)
        {
            if(matrix[i][0]==0 || matrix[0][j]==0)
            matrix[i][j]=0;
        }
    }
    if(rowflag==0 &&columnflag==0)
    {
        for(int i =0;i<=matrix[0].length-1;i++)
        matrix[0][i]=0;
        for(int i =0;i<=matrix.length-1;i++)
        matrix[i][0]=0;
    }
    else if(columnflag==0)
       { for(int i =0;i<=matrix.length-1;i++)
        matrix[i][0]=0;}
    else if(rowflag==0)
      {  for(int i =0;i<=matrix[0].length-1;i++)
        matrix[0][i]=0;
    }
    
}
    
    public static void main(String args[])
    {
        int matrix[][] = new int[][]{{0}};
        setZeroes(matrix);
        for(int i = 0;i<=matrix.length-1;i++)
        {
        for(int j = 0;j<=matrix[i].length-1;j++)
        {
            System.out.print(matrix[i][j]);
        }
        System.out.println("");
        }
    }
}




