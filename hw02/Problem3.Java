import java.util.*; // JA
public class Problem3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the friction force in Newtons: ");
        double friction=in.nextDouble();
        System.out.print("Enter the object's mass in kg: ");
        double mass=in.nextDouble();
        System.out.print("Enter the object's acceleration in m/s^2: ");
        double acc=in.nextDouble();
        double grav=9.8;
        double coef= friction*mass*grav*mass*acc;
        System.out.println("The coefficient for friction is: "+ coef);
    } // JA
    
}