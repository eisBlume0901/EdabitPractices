public class ReturnTheLastElementInAnArray
{
    public static int getLastItem(int[] nums)
    {
        return nums[nums.length-1];
    }
    public static void main(String[] args)
    {
        System.out.println(getLastItem(new int [] {1,4,9}));
    }
}
