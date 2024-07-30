
public class MatricesQuestion{

    public static void printNumbers(int array[][]){
        int key = 7;
        int count =0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(key == array[i][j]){
                    count++;
                }
            }
        }
        System.out.println("numbers of 7's printed is: " + count);

    }

    public static void sumofNumbers(int arr[][]){
        int sum = 0;
        
        //sum of2nd row elements
            for(int j=0; j<arr[0].length; j++){
                sum += arr[1][j];
            }
        System.out.println("sum of Second row is: "+sum);

    }

    public static void printMatrix(int matrix[][]){
        System.out.println("the matrix is: ");
        //orignal matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ "   ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        
        int row=2, column =3;
        int matrix[][] = {{2,3,7},{5,6,7}};

        //Display original matrix
        printMatrix(matrix);

        //Transpose the matrix
        int transpose[][] = new int[column][row];  //ULTA 
        //Tranpose matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];     // (j,i) <-- (i,j)
            }
        }

        //print Transpose matrix
        printMatrix(transpose);

       /*  int arr[][] ={{1,4,9},
                      {11,4,3},
                      {2,2,3,}};
        sumofNumbers(arr); */


        /* int array[][] = {{4,7,8},
                         {8,8,7}};
        
        printNumbers(array); */
    }

}