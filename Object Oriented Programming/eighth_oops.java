// Inheritance

// Borrow the properties class methods from existing class


// 1). Single Inheritance
// 2). Multiple Inheritance  (Special Type Access)
// 3). Multilevel Inheritance
// 4). Hybrid Inheritance
// 5). Hierarchical Inheritance

// 1). Single Inheritance  - 1 Parents Class 1 Child


class A{   // Parents

    void parents(){

        System.out.println("Mummy - Papa");
    }
}




public class eighth_oops extends A {    // Me - Child

    //  void parents(){  this method is not visible in your naked eye.

    //     System.out.println("Mummy - Papa");
    // }

    void child(){

        System.out.println("Me - Child");
    }


    public static void main(String[] args) {

        eighth_oops obj = new eighth_oops();

        obj.parents();
        obj.child();



        
    }
    
}
