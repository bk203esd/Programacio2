import acm.program.CommandLineProgram;

public class Problem4 extends CommandLineProgram {

    public void run(){
        char[] str = new char[] {'a','b',' ','c',' ','d',' ','e'};
        str = removeSpaces(str);
        printArr(str);
    }

    public char[] removeSpaces(char[] str) {
        int contador = 0;
        for (int a = 0; a < str.length; a++){
            if (str[a] != ' '){
                contador++;
            }
        }
        char[] str2 = new char[contador];
        contador = 0;
        for (int a = 0; a < str.length; a++){
            if (str[a] != ' '){
                str2[contador] = str[a];
                contador++;
            }
        }
        return str2;
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
