/* Ejercicio 1.10
Dadas las siguientes expresiones aritméticas, calcule cuál es el resultado de evaluarlas. Suponga
que las variables a y b que aparecen sin de tipo int y a tiene valir de 2 y b tiene valor de 4 

a) -a+5%b-a*a
b) 5+3%7*b*a-b%a
c) (a+1)*(b+1)-b/a
*/

public class ejercicio1_10{
    public static void main(String[] args) {
        String as = "-a + 5 % b - a * a",
               bs = "5 + 3 % 7 * b * a - b % a",
               cs = "(a+1) * (b+1) - b / a";

        int a =2, b=4;

        int ar = -a+5%b-a*a,
            br = 5+3%7*b*a-b%a,
            cr = (a+1)*(b+1)-b/a;

        System.out.println(" El resultado de la expresión:"+as + ", es: " +ar);
        System.out.println(" El resultado de la expresión:"+bs + " es: " +br);
        System.out.println(" El resultado de la expresión:"+cs + " es: " +cr);

    }
}