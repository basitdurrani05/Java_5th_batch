// 3). Hybrid Inheritance  - 1 parents 2 child

// Base - Parents
// Derived - Child


class parents{

    public void print(){


        System.out.println("Parents - Mummy Papa");


    }
}


class daughter extends parents{

    public void print2(){

        System.out.println("1st Daughter");
    }
}


public class tenth_oops extends daughter {    // Son


    public void print3(){

        System.out.println("2nd Son");
    }


    public static void main(String[] args) {

        tenth_oops obj = new tenth_oops();

        obj.print();
        obj.print2();
        obj.print3();
        
    }
    
}
