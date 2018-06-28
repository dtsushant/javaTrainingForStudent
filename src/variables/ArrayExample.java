package variables;

public class ArrayExample {

    public static void main(String args[]){
        int[] i = new int[47];

        i[0] = 3;
        i[1]=5;
        i[2]= 6;
        i[3]=9;

        i[30] = 88;
        System.out.println(i[46]);
        System.out.println(i.length);

        printArray(i);

        ArrayExample ar = new ArrayExample();
        ar.nonStaticPrintArray(i);


        String s[] = {" a","b d    dfdc","de","f","ghi"};

        printArrayString(s);


        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        matrix1[0][0] = 88;
        matrix1[0][1] = 99;
        matrix1[1][0] = 77;
        matrix1[1][1] = 66;


        matrix2[0][0] = 55;
        matrix2[0][1] = 44;
        matrix2[1][0] = 33;
        matrix2[1][1] = 22;

        int[][] matrix3 = addArray(matrix1,matrix2);

        printMatrix(matrix3);




    }

    public static void printArray(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.printf("the value of i[%d] = %d \n",i,arr[i]);
        }


    }

    public  void nonStaticPrintArray(int[] arr){
        for(int i: arr){
            System.out.printf("the value of %d \n",i);
        }
    }

    public static void printArrayString(String[] arr){
        for(String i: arr){
            System.out.printf("the value of %s \n",i);
        }
    }

    public static int[][] addArray(int[][] arr1, int[][] arr2){
        int[][] arr = new int[2][2];
        for(int i = 0; i<arr1.length;i++){
            for(int j = 0; j<arr1[0].length;j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr;
    }

    public static void printMatrix(int[][] arr1){
        for(int i = 0; i<arr1.length;i++){
            for(int j = 0; j<arr1[0].length;j++){
                System.out.printf("the value of matrix[%d][%d] = %d \n",i,j,arr1[i][j]);
            }
        }
    }

    public static int[][] transposeMatrix(int[][] matrix){
        int[][] a = new int[2][2];

        return a;
    }


}
