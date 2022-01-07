/* Ejercicio 1.16

*/


public class ejercicio1_16{
    public static void main(String[] args) {
        int a=3, b=6, c;

        c= a/b;
        System.out.println("El valor de c es: "+c);
        c= a%b;
        System.out.println("El valor de c es: "+c);
        a++;
        System.out.println("El valor de a es: "+a);
        ++a;
        System.out.println("El valor de a es: "+a);
        c= ++a + b++;
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de a es: "+b);
        System.out.println("El valor de a es: "+c);

        c=++a + ++b;
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de a es: "+b);
        System.out.println("El valor de a es: "+c);
    }
}