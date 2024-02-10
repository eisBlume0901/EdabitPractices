public class GetTheSumOfAllArrayElements
{
    public static int arraySum(int[] arr)
    {
        int total = 0;
        for (int i : arr) total += i;
        return total;
    }
    public static void main(String[] args)
    {
        System.out.println(arraySum(new int[] {1,10,9}));
    }
}
