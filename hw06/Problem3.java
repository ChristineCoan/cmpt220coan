import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        System.out.print("Enter the first String: ");
        Scanner in =new Scanner (System.in);
        String x=in.next();System.out.print("Enter the second String: ");
        String y=in.next();
        if (isAnagram(x,y)){
            System.out.println(x+" and "+y+" are anagram");
        }
        else{
            System.out.println(x+" and "+y+" are not anagram");
        }
    }
    public static boolean isAnagram(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        s1=s1.replace(" "," ");
        s2=s2.replace(" "," ");
        s1=s1.replace("-"," ");
        s2=s2.replace("-"," ");
        char[] chrArray1=s1.toCharArray();
        char[] chrArray2=s2.toCharArray();
        if(chrArray1.length != chrArray2.length){
            return false;
        }
        Arrays.sort(chrArray1);
        Arrays.sort(chrArray2);
        for (int index=0;index<chrArray1.length;index ++){
            if (chrArray1[index]!=chrArray2[index]){
                return false;
            }
        }
        return true;
    }
}
