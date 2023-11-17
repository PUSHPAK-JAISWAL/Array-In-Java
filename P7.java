// this program is for inhanced for loop in 2d array
public class P7
{
    public static void main(String args[])
    {
        int nums[][] ={
            {5,3,2,1},
            {4,4,3,2},
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