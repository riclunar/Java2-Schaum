/* Ejercicio 1.14
Dadas las siguientes expresiones aritméticas-l+ogias calcuñe cuál es el resultado
de evaluarlos:
a) 25>20&&13>5
b) 10+4<15-13 \\ 2*5+1>14-2*2
c) 4*2<=8\\2*2<5&&4>3+1
d) 10<=2*5&&3<4\\!(8>7)&& 3*2<=4*2-1
*/

public class ejercicio1_14{
    public static void main(String[] args) {
        
        boolean a = 25>20 && 13>5;
        boolean b = 10+4<15-13 || 2*5+1>14-2*2;
        boolean c = 4*2<=8 || 2*2 < 5&&4 >3+1;
        boolean d = 10<=2*5&&3<4 || !(8>7)&& 3*2<=4*2-1;
    
        System.out.println("El resultado de la expresion 25>20&&13>5 es: "+a);
        System.out.println("El resultado de la expresion 10+4<15-13 \\ 2*5+1>14-2*2 es: "+b);
        System.out.println("El resultado de la expresion 4*2<=8\\2*2<5&&4>3+1 es: "+c);
        System.out.println("El resultado de la expresion 10<=2*5&&3<4\\!(8>7)&& 3*2<=4*2-1es: "+d);

    }
}