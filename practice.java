// Array

import java.util.Scanner;

public class practice {


    public static void main(String[] args) {


        // 1). Revese a Array

        // Scanner sc = new Scanner(System.in);


        // System.out.println("Enter Array Elements : ");
        // int []a = new int[5];


        // Input
        // for(int i=0; i<a.length; i++){

        //     a[i] = sc.nextInt();
        // }


        // Output Logic

        // System.out.println("Reverse Array : ");
        // for(int i=a.length-1; i>=0; i-- ){


            /*

            Step : 

            length = Array 5   -  15  Formula = a.length-1
            length = Array 4   -  14  Formula = a.length-1
            length = Array 3   -  13  Formula = a.length-1
            length = Array 2   -  12  Formula = a.length-1
            length = Array 1   -  11  Formula = a.length-1
             
             */


            // i-- - Decrement
            // i>=0 - index
            // i = a.length-1 - har ek index pae -1 hotey chalna hai

        //     System.out.print(a[i]+" ");
        // }




        // 2). Searching 



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Elements : ");

        int []a = new int[5];

        int chunnu=0;


        for(int i=0; i<a.length; i++){

            a[i] = sc.nextInt();

        }

        System.out.println("Array : ");


        for(int i=0; i<a.length; i++){

            System.out.print(a[i]+"  ");

        }

        System.out.println("\nEnter Search Elements : ");
        int search  = sc.nextInt();

        for(int i=0; i<a.length; i++){


            if(a[i]==search){

                chunnu++;
            }

        }

        if(chunnu>0){

            System.out.println("Elements Found / Mil gaya Bhai Chunnu " +chunnu+" Times");
        }

        else{

            System.out.println("Does Not Found / chunnu kho gaya mil nhi raha mele mai galti sae haath chuth gaya");
        }
















        
        


    }
    
}
