// Conditionals Statements

import java.util.Scanner;

public class ninth {

    public static void main(String[] args) {

        // Program : Check Age you are a adult or child

        
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Age : ");
        // int a = sc.nextInt();

        // if(a>=18){   // 21

        //     System.out.println("Your Are Adult");
        // }

        // else if(a<18){  // 12

        //     System.out.println("You are a Child");
        // }

        // else{  // Sam
        //     System.out.println("Error");
        // }


        // Comments : 

        // 1). Sinlge Line    - // 
        // 2). Multi Line  - /* */

        // Single Line

        /*
         * Multi Line
         */


        //  System.out.println("Enter Number : ");
        //  int a = sc.nextInt();


        //  if(a>=20){

        //     System.out.println("Intelligent");
        //  }

        //  else{

        //     System.out.println("Morans / Bewakoof");
        //  }


        // Switch Case


        System.out.println("Enter First Number : ");
        int a = sc.nextInt();


        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();


        System.out.println("Opeartions :\n1).Addition\n2)Subtraction\n3).Multiplication");
        int result = sc.nextInt();


        switch (result) {

            case 1:
            result = a+b;
            System.out.println("Addition : "+result);
            break;

            case 2:
            result = a-b;
            System.out.println("Subtraction : "+result);
            break;

            case 3:
            result = a*b;
            System.out.println("Multiplication : "+result);
            break;
           
        }





        

    }
    
}
