//https://www.softwaretestinghelp.com/pass-return-array-in-java
public class FirstElementofAnArray {
    public static int getFirstValue(int[] array) {
       int firstElement = array[0];
        return firstElement;
    }
    public static void main(String[] args) {
        int[] array = {9, 15, 18, 23};
        System.out.println("The first element: " + getFirstValue(array));
    }
}
