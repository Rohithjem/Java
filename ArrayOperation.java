import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After adding elements: " + list);
        
        list.add(1, 15); 
        System.out.println("After adding 15 at index 1: " + list);
        
        list.set(1, 25); 
        System.out.println("After setting index 1 to 25: " + list);

        list.remove(0); 
        System.out.println("After removing element at index 0: " + list);

        list.remove(Integer.valueOf(30)); 
        System.out.println("After removing value 30: " + list);
    }
}
