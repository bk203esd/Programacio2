import acm.program.CommandLineProgram;

public class Problem3 extends CommandLineProgram {

    public void run() {
        char[] chars = new char[] {'a','b','c','d','e','f','g'};
        if (chars.length > 1){
            chars = removeExtems(chars);
            printArr(chars);
        }
    }

    public char[] removeExtems(char[] chars) {
        char[] chars1 = new char[chars.length-2];
        for (int a = 1; a < chars.length - 1; a++){
            chars1[a-1] = chars[a];
        }
        return chars1;
    }

    public void printArr(char[] chars){
        print('{');
        for (int a = 0; a < chars.length; a++){
            print("\'" + chars[a] + "'");
            if (a != chars.length-1) print(",");
        }
        print('}');
    }
}
