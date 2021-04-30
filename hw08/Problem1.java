import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
            //make a scanner
            Scanner in = new Scanner(System.in);
            //prompt user to enter a string
            System.out.println("Enter a string: ");
            String s = in.nextLine();
            //prompt user to enter delimiters
            System.out.println("Enter delimeters: ");
            String delimiters = in.nextLine();
     
           split(s, delimiters);
     
        }
        //split method
        public static ArrayList<String> split(String s, String delimiters){
            String[] array = s.split(delimiters);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
            System.out.println(list);    
            return list;
        }    
     }
