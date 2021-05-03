import java.util.*;
// JA: The objects had to be inserted in order of weight
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int numberOfObjects = input.nextInt();
        ArrayList<Integer> objects = new ArrayList<>();
        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < numberOfObjects; i++) {
         objects.add(input.nextInt());
        }
        int container = 1;
        while(!objects.isEmpty()) {
         System.out.println("Container " + container++ + " contains objects with weight " + getContainer(objects, 10));
        }
       }
       
       static String getContainer(ArrayList<Integer> objects, int max) {
        String result = "";
        for (int i = 0; i < objects.size(); i++) {
         if(objects.get(i) <= max) {
          int tmp = objects.get(i);
          result += tmp + " ";
          objects.remove(i);
          return result + getContainer(objects, max - tmp);
         }
        }
        return result;
       }
      
      }
