import acm.program.CommandLineProgram;

public class Problem7 extends CommandLineProgram {

    public void run() {
        String str = readLine();
        str = removeSpaces(str);
        println(str);
    }

    private String removeSpaces(String str) {
        return str.replace(" ","");
    }
}
