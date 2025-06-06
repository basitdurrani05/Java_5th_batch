// Topic : Getter and Setter.

// Setter - Set the value.
// Getter - Update the value.


// Encapsulation : Wrapping the data into a single unit.

class A{


    private int roll_no;
    private String name;


    public void SetA(int a){  // Setter   

        roll_no=a;   // Private sae public ho raha hai
    }


    public int getA(){   // getter

        return roll_no;   // Print kerney kae liye use hota hai
    }


    public void SetB(String b){

        name=b;  // Private sae public ho raha hai


    }


    public String getB(){

        return name;  // Print kerney kae liye use hota hai
    }

    



}



public class third_oops {


    public static void main(String[] args) {


        A obj = new A();

        obj.SetA(12);

        System.out.println("Roll Number : "+obj.getA());

        obj.SetB("Amisha");

        System.out.println("Name : "+obj.getB());


        
        
    }
    
}
