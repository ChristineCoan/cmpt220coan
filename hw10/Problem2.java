public class Problem2 {
    //had an error with vs code and running the programs didnt say an error but couldnt run to check
    //class Animal which implements Comparable and Cloneable
public class Animal implements Comparable<Animal>, Cloneable{
    private double weight;// weight variable to store the weight
    //getter method to get the weight
    public double getWeight() {
        return weight;
    }
    //getter method to set the weight
    public void setWeight(double weight) {
        this.weight = weight;
    }
    // overriding the compareTo method of the Comparable class
    @Override
    public int compareTo(Animal animal) {
        double animalWeight= animal.getWeight();// getting the weight of the animal obhect
        return (int) (this.getWeight()-animalWeight);// sorting in ascending order
    }
    // overriding the clone method of the Cloneable class
    //throws CloneNotSupportedException exception
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    } 
 }
    // dummy Chicken class which extends Animal
    class Chicken extends Animal{
    }
    // dummy Tiger class which extends Animal
    class Tiger extends Animal{
    }
    // driver class to test the above example
    public class AnimalTest {
        public  void main(String[] args) throws CloneNotSupportedException {
            Animal [] list= new Animal[5];
            list[0]= new Chicken(); // creating a new Chicken object
            list[0].setWeight(4.5); // setting the weight to 4.5
            list[1]= new Tiger(); // creating a new Tiger object
            list[1].setWeight(46.6); // setting the weight to 46.6
            list[2]= new Chicken(); // creating a new Chicken object
            list[2].setWeight(1.5); // setting the weight to 1.5
            list[3]= (Animal) (list[0].clone());// creating a clone of the first element and assigning to the 4th element
            list[3].setWeight(7.5);// setting the weight to 7.5
            list[4]= (Animal) (list[1].clone()); // creating a clone of the 2nd element and assigning to the 5th element
        
            java.util.Arrays.sort(list);
            for(int i=0;i<list.length;i++){
                System.out.println("weight: "+list[i].getWeight());
            }
        }
    }
}
 