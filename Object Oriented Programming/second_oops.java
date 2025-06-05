// Topic : Class and Object

// Class : Class is template or blue print for creating a object.

// Object : Instance Of Class


class A{  // class

    public void mohan(){

        System.out.println("Hello Mohan");
    }
}


public class second_oops {  // class

    public void amisha(){

        System.out.println("Amisha");
    }


    public static void main(String[] args) {

        second_oops obj = new second_oops();  // object


        A obj2 = new A();

        obj.amisha();

         obj2.mohan();
        
    }
    
}
