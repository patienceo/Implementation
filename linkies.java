/*
Program that implements both a Linked List and an Array.
*/
  import java.util.LinkedList;

  public class linkies {
  public static void main(String[] args){
       // linked list example start
       LinkedList linkies = new LinkedList();
        
       linkies.add("apple");
       linkies.add("pineapple");
       linkies.add("mango");
       
       System.out.println("Linked List of fruiits: " + linkies); // print statement
       // linked list example end
       
       // array example start
        String fruits [] = {"apple", "pineapple", "mango"};
        System.out.println("\nArray of fruits: " + fruits [0] + " " +  fruits [1] + " " + fruits [2]); // print statement
        // array example end
        
    }
}