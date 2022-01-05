/* Ejercicio 1.7
Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone 2000$
en una cuenta a plazo fijo al 2.75% anual. Recuerde que al pagarle los inereses el banco le retendrá el 18% para hacienda */

public class ejercicio1_7{
    public static void main(String[] args) {
        double inversion = 2000,
               plazofijo = 2.75,
               intereses = ((inversion * plazofijo)/ 100) /2,
               retencion = ((intereses * 18)/100),
               ganancia = intereses - retencion;

               System.out.println("Tu ganancia despues de 6 meses es: " + ganancia);

    }
}