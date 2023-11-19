// this program is made to avoid and test the exception of ArrayIndexOutofBoundsException
public class P13
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5};
        System.out.println(a[a.length-1]);// this is method 1
        System.out.println("bye");
        
        for(int i =0;i<a.length;i++)// this is method 2
        {
            System.out.println(a[i]);
        }
        
        for(int n : a) // this is method 3
        {
            System.out.println(n);
        }
    }
}