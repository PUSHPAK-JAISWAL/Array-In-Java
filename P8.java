// this program is for inhanced for loop in 2d array
// this progran is for inhanced for loop on jagged array
public class P8
{
    public static void main(String args[])
    {
        int nums[][] ={
            {5,3,2},
            {4},
            {6,6,7,5},
        };
        for (int n[]: nums)
        {
            for (int b : n)
            { 
                 System.out.print(b);
            }
            System.out.println("    ");
        }
    }
}