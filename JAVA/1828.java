//1828. Queries on Number of Points Inside a Circle

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        short len = (short)queries.length;

        int[] answer;
        answer = new int[len];

        //okrag
        for(short i=0; i<len; i++)
        {

            int r=queries[i][2]*queries[i][2], 
            a=queries[i][0],
            b=queries[i][1];

            //punkt
            for(short k=0; k<points.length; k++ )
            {

                int x= points[k][0], y=points[k][1];
                int xa= x-a; int yb=y-b;
                int xaq=xa*xa, ybq=yb*yb;


                    if(r>=xaq+ybq)
                    {
                        answer[i]+=1;
                    }


            }

        }
        return answer;
    }
}