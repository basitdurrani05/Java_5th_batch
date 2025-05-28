// 2). Two Dimensional Array  / Matrix

// Row and Column

import java.util.Scanner;

public class twelfth {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix : ");
        int [][]a = new int[2][2];   // 2 Row 2  Column



        // Input
        for(int i=0; i<a.length; i++){   // Row 

            for(int j=0; j<a.length; j++){   // Column


                a[i][j] = sc.nextInt();


            }


        }


        // Output
        System.out.println("Matrix : ");


        for(int i=0; i<a.length; i++){   // Row

            for(int j=0; j<a.length; j++){   // Column


                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }








        
    }
    
}
