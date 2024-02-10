public class ToThePowerOf {
    public static int calculateExponent(int num, int exp) {
        int result = (int) Math.pow(num, exp);
        //Math.pow uses double that is why (int) is manually type casted
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        calculateExponent(2,2);
    }
}
