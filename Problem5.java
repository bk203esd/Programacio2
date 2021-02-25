import acm.program.CommandLineProgram;

public class Problem5 extends CommandLineProgram {

    public void run() {
        int[][] left = new int[10][10];
        int[][] right = new int[10][10];
        int[][] result = new int[10][10];
        left = generarRandoms(left);
        right = generarRandoms(right);
        result = matrixMultiplication(left, right);
        printArr(left);
        println("--------------------");
        printArr(right);
        println("--------------------");
        printArr(result);
    }

    private int[][] matrixMultiplication(int[][] left, int[][] right) {
        int[][] taula = new int[10][10];
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++){
                taula[a][b] = left[a][b] * right[a][b];
            }
        }
        return taula;
    }

    public int[][] generarRandoms(int[][] arr) {
        double rand;
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[a].length; b++){
                rand = Math.random()*10;
                arr[a][b] = (int) Math.round(rand);
            }
        }
        return arr;
    }

    public void printArr(int[][] chars){
        for (int a = 0; a < chars.length; a++){
            for (int b = 0; b < chars[a].length; b++) {
                print(chars[a][b]);
                if (b != chars[a].length - 1) print("\t");
            }
            println();
        }
    }
}
