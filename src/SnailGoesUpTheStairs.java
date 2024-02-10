//https://stairs4u.com/help/pythagorean_stair_theorem.htm
//https://www.hackmath.net/en/math-problem/2424
public class SnailGoesUpTheStairs
{
    public static double TotalDistance(double height, double length, double tower)
    {
        double steps = tower/height;
        double totalDistance = (height*steps)+(length*steps);
        return totalDistance;
    }
    public static void main(String[] args)
    {
        System.out.println(TotalDistance(0.2,0.4,100));
        System.out.println(TotalDistance(0.12,0.1,10.0));
        System.out.println(TotalDistance(0.5,0.5,25));
        System.out.println(TotalDistance(0.3,0.2,25.0));
        System.out.println(TotalDistance(0.1,0.1,6.0));
    }
}
