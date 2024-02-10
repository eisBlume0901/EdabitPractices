public class MaximumEdgeOfATriangle
{
    public static int nextEdge(int side1, int side2)
    {
        int maximum_side = (side1+side2) - 1;
        return maximum_side;
    }
    public static void main(String[] args)
    {
        System.out.println(nextEdge(8,10));
    }
}
