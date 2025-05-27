// Array

// - Collection of similar type of data.

// Type

// 1). 1D Array/ One Dimensional Array/ Single Dimensional
// 2). 2D Array/ Two Dimensional Array/ 3D/4D/ Multi Dimensional

import java.util.Scanner;

public class eleventh {


    public static void main(String[] args) {


        // 1). One Dimensional Array


        // int []a; Initialize

        // int []a = {11,12,13,14,1000,1120,1000,2303}; // Array Define


        // System.out.println(a);  // Address

        // for(int i=0; i<a.length; i++){

        //     System.out.println(a[i]);
        // }


        // 1). One Dimensional Take a user Input


        Scanner basit = new Scanner(System.in);   // basit is a variable


        System.out.println("Enter Array Elements : ");
        int []amisha = new int[8];


        // Input
        for(int i=0; i<amisha.length; i++){

            amisha[i] = basit.nextInt();
            
        }

        // Output

        System.out.println("Array Elements : ");
       for(int i=0; i<amisha.length; i++){

        System.out.println(amisha[i]);
       }








        





        


    }
    
}
