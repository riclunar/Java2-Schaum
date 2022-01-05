/* Ejercicio 1.11
Esriba un programa que defina dos variables enteras para describir las longitudes de los lados de  un rectángulo.
El programa debe calcular y escribir en la pantalla las longitudes  de los lados, el perímetro y el área del rectángulo.
(Suponga que el rectángulo mide 15cm de ato y 25cm de ancho.*/

public class ejercicio1_11{
    public static void main(String[] args) {
        int ancho = 25;
        int alto =15;

        /* Fórmulas de cálculo del área: b*a y perímetro: 2(b+a) */
        int area = alto*ancho;
        int perimetro = 2*(ancho+alto);

        System.out.println("El rectángulo tiene las siguientes medidad: Alto = "+alto +
                            " y de Ancho = "+ancho);
        System.out.println("El área del retángulo es: "+area);
        System.out.println("El perímetro del retángulo es: "+perimetro);
    }
}