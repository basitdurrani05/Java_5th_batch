// 2). Multilevel Inheritace


class dadaji{

    public void show(){

        System.out.println("Dada Jii");


    }
}

class papaji extends dadaji{


    // Not Visible

    //  public void show(){

    //     System.out.println("Dada Jii");


    // }
    

    public void show2(){

        System.out.println("Papa Jii");


    }
}

public class ninth_oops extends papaji {   // Me


     //  public void show(){

    //     System.out.println("Dada Jii");


    // }
    

    // Not Visible

    // public void show2(){

    //     System.out.println("Papa Jii");


    // }


    public void show3(){


        System.out.println("Me");
    }



    public static void main(String[] args) {

        ninth_oops obj = new ninth_oops();


        obj.show();
        obj.show2();
        obj.show3();






        
    }
    
}
