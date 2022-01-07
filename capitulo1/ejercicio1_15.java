/* Ejercicio 1.15
 Dadas las siguientes expresiones aritmético-lógicas calcule cuál 
 es el resultado de evaluarlas.
 Suponga que la variable a tiene un valor de 5 y b un valor de 3.
a) !(a>b&&2*a<=b)
b) b++>3||a+b<=8&&!(a>b)
c) a++ <6&& (b+=2)<a
d) a++/2<b&&(a++/2>b||(a*2<b*4))

*/

public class ejercicio1_15{
    public static void main(String[] args) {
        int a = 5,
            b = 3;

        boolean aBoolean = !(a>b&&2*a<=b);
        boolean bBoolean = b++>3||a+b<=8&&!(a>b);
        
        //Setear de nueva cuenta lso valores de las variables
        a=5; b=3;
        boolean c = a++ <6 && (b+=2)<a;
        //Setear de nueva cuenta lso valores de las variables
        a=5; b=3;
        boolean d = a++/2<b&&(a++/2>b||(a*2<b*4));

        System.out.println("El resultado de la expresion !(a>b&&2*a<=b): es " +aBoolean);
        System.out.println("El resultado de la expresion b++>3||a+b<=8&&!(a>b): es " +bBoolean);
        System.out.println("El resultado de la expresion a++ <6&& (b+=2)<a: es " +c);
        System.out.println("El resultado de la expresion a++/2<b&&(a++/2>b||(a*2<b*4)): es " +d);
    }
}