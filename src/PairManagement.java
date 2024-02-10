import java.util.Arrays;

public class PairManagement
{
    public static int[] makePair(int a, int b)
    {
        int[] makePair = new int[2];
        makePair[0] = a;
        makePair[1] = b;
        System.out.println(Arrays.toString(makePair));
        return makePair;
    }

    public static void main(String[] args)
    {
        makePair(1,2);
    }
}
