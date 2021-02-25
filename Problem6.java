import acm.program.CommandLineProgram;

public class Problem6 extends CommandLineProgram {

    public void run() {
        String str = "hola Laura que tal estas";
        str = removeExtrems(str);
        println(str);
    }

    private String removeExtrems(String str) {
        String str2;
        str2 = str.substring(1,str.length()-1);
        return str2;
    }
}
