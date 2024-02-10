import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuggyCode_Part5 {
    public static List PrintArray(int number) {
        List array = new ArrayList<>();
        /* List - interface. It maintains the ordered collection. It contains the index-based methods
        to insert, update, delete, and search elements. It can have duplicate elements. It can also
        store the null elements in the list.
        ArrayList - implementation class of list

         */

        for(int count = 1; count <= number; count++) {
            System.out.println(array.add(count));
            /* add() method is used to add specific element into a Set collection. The function
            adds the element only if the specified element is not already present in the set
            else the function return False if the element is already present in the set.

            https://www.geeksforgeeks.org/set-add-method-in-java-with-examples
             */
        }
        return array;
    }

    public static void main(String[] args) {
        PrintArray(4); //Output would be 4 true(s) per new line.

        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Strawberry");
        list.add("Peach");
        list.add("Grapes");

        for(String fruit:list) {
            System.out.println(fruit);
            //Output would be Mango, Strawberry, Peach, Grapes per new line
        }
    }
}
