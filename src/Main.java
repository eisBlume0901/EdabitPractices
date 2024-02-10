public class Main {
    public static int addUpTo(int n) {
        return n < 1 ? 0 : n + addUpTo(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(addUpTo(6));
    }
}