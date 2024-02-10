//https://www.baeldung.com/java-toggle-boolean
public class FlipTheBoolean {
    public static boolean reverse(boolean b) {
        b = !b;
        return b;
    }
    public static void main(String[] args) {
        System.out.println(reverse(false));
    }
}
