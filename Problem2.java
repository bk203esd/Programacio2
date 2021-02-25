import acm.program.CommandLineProgram;

public class Problem2 extends CommandLineProgram {

    public void run() {
        int[] nums = new int[]{4, 12, -5, 3, 5, 16, 85, 12, 18, 45};
        println("El minimo es " + min(nums));
        println("El maximo es " + max(nums));
    }

    public int min(int[] numbers) {
        int min = numbers[0];
        for (int a = 1; a < numbers.length; a++) {
            if (numbers[a] < min) {
                min = numbers[a];
                a = 0;
            }
        }
        return min;
    }

    public int max(int[] numbers) {
        int max = numbers[0];
        for (int a = 1; a < numbers.length; a++) {
            if (numbers[a] > max) {
                max = numbers[a];
                a = 0;
            }
        }
        return max;
    }
}
