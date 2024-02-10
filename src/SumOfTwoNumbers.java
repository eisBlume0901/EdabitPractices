//https://www2.southeastern.edu/Academics/Faculty/kyang/2015/Fall/CMPS161/ClassNotes/CMPS161ClassNotesChap06.pdf
public class SumOfTwoNumbers {
     public static int sum(int a, int b) {
         /*Declare a return value:
         If you do not want a method to return something, then simply replace
         the word void with a primitive or reference data type of the object (
         or primitive type) that you wish to return.

         Primitive data types (int, float, more) then add return plus an object
         of that type somewhere toward the end of the method's code

         public static int sum(int a, int b) is a built-in method in which
         Java returns the sum of its arguments
          */
         int result = a + b;
         return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3));
    }
}