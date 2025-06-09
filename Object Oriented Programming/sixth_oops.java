// Polymorphism : Single action in different ways.

// Poly means many morphism means forms

// Two Types.

// 1).Compile Time
// 2). Run Time


// 1). Compile Time / Topic : Method Overloading Same

public class sixth_oops {


    public void amisha(){

        System.out.println("Amisha : Software Engineer...");

    }

    public void amisha(String a, String b){

        System.out.println("Amisha : College : "+a+" "+b);
    }

    public void amisha(String a, String b,String c){

        System.out.println("Amisha : Home : "+a+" "+b+" "+c);
    }



    public static void main(String[] args) {


        sixth_oops obj = new sixth_oops();

        obj.amisha();
        obj.amisha("Student.","Best Friend");
        obj.amisha("Daughter","Sister","Bua");


        

    }
    
}
