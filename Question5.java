package Task8;
public class Question5
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i=2; i<n;i++)
        {
            if (n % i == 0)
            {
                System.out.println("Not a prime");
                return;
            }
        }
        System.out.println("A prime number");
    }
}
