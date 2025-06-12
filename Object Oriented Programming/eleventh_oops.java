// 4). Hierarchical Inheritance


class me{

    public void show(){

        System.out.println("Me - Single");
    }
}


class papaji extends me{

    public void show2(){

        System.out.println("Me - Marriage : Husband (Papaji)");
    }
}



public class eleventh_oops extends papaji {    // dadaji 



    public void show3(){

        System.out.println("Me - Dadajii");
    }


    public static void main(String[] args) {


        eleventh_oops obj = new eleventh_oops();

        obj.show();
        obj.show2();
        obj.show3();
        
    }


    
}
