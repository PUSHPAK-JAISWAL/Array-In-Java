// program for two dimenstional array
public class P4
{
    public static void main(String args[])
    {
        //int nums[][]= new int [3][3];
        int nums[][]={
            {1,1,1},
            {2,2,2},
            {3,3,3},
            {4,4,4},
            {5,5,5},
            {6,6,6},
            {7,7,7},
            {8,8,8},
            {9,9,9}
        };
        for(int i=0;i<=8;i++)
        {
            for (int j=0;j<=2;j++)
            {
                System.out.print(nums[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}