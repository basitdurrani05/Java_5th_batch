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




        // 2). One Dimensional Searching 



        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Array Elements : ");

        // int []a = new int[5];

        // int chunnu=0;


        // for(int i=0; i<a.length; i++){

        //     a[i] = sc.nextInt();

        // }

        // System.out.println("Array : ");


        // for(int i=0; i<a.length; i++){

        //     System.out.print(a[i]+"  ");

        // }

        // System.out.println("\nEnter Search Elements : ");
        // int search  = sc.nextInt();

        // for(int i=0; i<a.length; i++){


        //     if(a[i]==search){

        //         chunnu++;  
        //     }

        // }

        // if(chunnu>0){

        //     System.out.println("Elements Found / Mil gaya Bhai Chunnu " +chunnu+" Times");
        // }

        // else{

        //     System.out.println("Does Not Found / chunnu kho gaya mil nhi raha mele mai galti sae haath chuth gaya");
        // }




        // 3). Multi Dimensional Searching  / Matrix Element Searching


        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Matrix : ");

        // int [][]a = new int[4][4];


        // Input

        // for(int i=0; i<a.length; i++){


        //     for(int j=0; j<a.length; j++){

        //         a[i][j] = sc.nextInt();


        //     }
        // }


        // Output

        // System.out.println("Matrix : ");

        //  for(int i=0; i<a.length; i++){


        //     for(int j=0; j<a.length; j++){

        //         System.out.print(a[i][j]+" ");


        //     }

        //     System.out.println();
        // }


        // Logic For Searching a Element


        // System.out.println("Enter Searching Elements :  ");
        // int search = sc.nextInt();

        // int count=0;


        // for(int i=0; i<a.length; i++){ // Row


        //     for(int j=0; j<a.length; j++){   // Column


        //         if(a[i][j]==search){

        //             count++;
        //         }



        //     }
        // }


        // if(count>0){

        //     System.out.println("Elements Found...... "+count+" Times");
        // }

        // else{

        //     System.out.println("Does Not Present....");
        // }




        // 4). Addition Of Matrix 




        Scanner sc = new Scanner(System.in);


        System.out.println("Enter 1st Matrix :  ");

        int [][]a = new int[2][2];

        int[][]b = new int[2][2];

        int [][]result = new int[2][2];


        // Input

        for(int i=0; i<a.length; i++){


            for(int j=0; j<a.length; j++){

                a[i][j] = sc.nextInt();
            }
        }


        // Output


        System.out.println("\n1st Matrix :  ");
        for(int i=0; i<a.length; i++){


            for(int j=0; j<a.length; j++){

                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }



        // 2nd Matrix : 


        System.out.println("Enter 2nd Matrix :  ");


         for(int i=0; i<b.length; i++){


            for(int j=0; j<b.length; j++){

                b[i][j] = sc.nextInt();
            }
        }




        System.out.println("\n2nd Matrix :  ");
         for(int i=0; i<b.length; i++){


            for(int j=0; j<b.length; j++){

                System.out.print(b[i][j]+" ");
            }

            System.out.println();
        }



        // Result


        System.out.println("\nAddition Of Matrix : ");


        for(int i=0; i<result.length; i++){


            for(int j=0; j<result.length; j++){


                result[i][j] = a[i][j]+b[i][j];

                System.out.print(result[i][j]+" ");


            }

            System.out.println();  // Create a Line / Break a Line
        }
        





      














        
        


    }
    
}
