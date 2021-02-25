import acm.program.CommandLineProgram;

public class Problem1 extends CommandLineProgram {

    public boolean isPerfect(int n){
        int cont = 0;
        for (int a = 1; a < n; a++){
            if (n % a == 0){
                cont += a;
            }
        }
        return n == cont;
    }

    public void run(){
        int num = readInt("Escriu un nombre n > 1\n");
        if (num > 1) {
            if (isPerfect(num)){
                println("El nombre " + num + " és perfecte");
            }else {
                println("El nombre " + num + " no és perfecte");
            }
        }else {
            println("Error: El nombre que ha escrit no es major a 1");
        }
    }
}
