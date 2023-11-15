// program for two dimentional array
public class P3
{
    public static void main(String args[])
    {
        int nums[][]= new int [3][3];
        nums[0][0]=30;
        nums[0][1]=31;
        nums[0][2]=32;
        nums[1][0]=10;
        nums[1][1]=11;
        nums[1][2]=12;
        nums[2][0]=20;
        nums[2][1]=21;
        nums[2][2]=22;
        for(int i=0;i<=2;i++)
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