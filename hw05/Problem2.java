import java.util.*;
public class Problem2 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=in.nextLine();
    }
    public static void title (String str){
        char ch;
        char prevCh='.';
        for (int i = 0;  i < str.length();  i++ ) {
            ch = str.charAt(i);
            if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) )
                System.out.print( Character.toUpperCase(ch) );
            else
                System.out.print( ch );
            prevCh = ch;  // prevCh for next iteration is ch.
         }
         System.out.println();
    }
}
