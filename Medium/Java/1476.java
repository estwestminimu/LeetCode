//1476. Subrectangle Queries

class SubrectangleQueries {

    int[][] matrix;

    public SubrectangleQueries(int[][] rectangle) {
        matrix=rectangle;
   
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        
        
        for(short i=(short)row1; i<=row2; i++)
        {

            for(short j=(short)col1; j<=col2;j++)
            {
                matrix[i][j]=newValue;
            }


        }
    }
    
    public int getValue(int row, int col) {
        return matrix[row][col];
    }
}
