/* Ejercicio 1.9
Dadas las siguientes expresiones aritméticas, calcule cuál es el resultadod e evaluarlas.
a = "25+20-15",
b = "20*10+15*10",
c = "20*10/2-20/5*3",
d = "15/10*2+3/4*8"
*/

public class ejercicio1_9{
    public static void main(String[] args) {
        String a = "25+20-15",
               b = "20*10+15*10",
               c = "20*10/2-20/5*3",
               d = "15/10*2+3/4*8";

        int ar = 25+20-15,
            br = 20*10+15*10, 
            cr = 20*10/2-20/5*3,
            dr = 15/10*2+3/4*8;   
        System.out.println(" El resultado de la operación " + a +" es: " +ar);
        System.out.println(" El resultado de la operación " + b +" es: " +br);
        System.out.println(" El resultado de la operación " + c +" es: " +cr);
        System.out.println(" El resultado de la operación " + d +" es: " +dr);
    }
}

