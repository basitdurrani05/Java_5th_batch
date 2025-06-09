// 2). Run Time Polymorphism. Topic Method Overriding same

// Imp : 
// Difference b/w Method Overloading and Method Overriding.

// Ans : Method Overloading : same name but different arguments.
//  Method Overriding : same name and same arguments.



class A{

    void basit(){

        System.out.println("He is a Software Engineer at Microsoft...");
    }
}

public class seventh_oops extends A {


    @Override   // Annotations - Special type of keywords
    void basit(){

        System.out.println("He is also Owner of Company Which name is bd technologies pvt.ltd");
    }








    public static void main(String[] args) {

        seventh_oops obj = new seventh_oops();

        A obj2 = new A();

        obj.basit();

        obj2.basit();





    }

}
