/* Ejercicio 1.13
Escribe un programa que escriba en la pantalla cuánto le dará su banco
después de seis meses si pone 2000$ en una cuenta a plazo fijo al 2.75% anual.
Recuerde que al pagarle los intereses al banco le retendrá el 18% para hacienda.
Utilice variables para manejar las cantidades y realzar los cálculos. Escriba los 
mensajes apropiados para entender los cálculos.
*/

public class ejercicio1_13{
    public static void main(String[] args) {
        final double RETENSION =18;
        final int mesesYear = 12;

        double capitalInvertido = 2000,
                interesAnual = 2.75;
        int mesesInversion = 6;

        double interesObtenido= (capitalInvertido*interesAnual/100)* mesesInversion/mesesYear;
        double retencion = (interesObtenido *RETENSION)/100;
        double interesesCobrados = interesObtenido - retencion;

        System.out.println("Cálculo de intereses.");
        System.out.printf("Dinero ingresado: %.2f$.\n", capitalInvertido);
        System.out.printf("Interes Anual: %.2f%%.\n", interesAnual);
        System.out.printf("intereses a los %d meses: %.2f$ \n", mesesInversion, interesObtenido);
        System.out.printf("Retención realizada: %.2f$. \n", retencion);
        System.out.printf("Interes cobrado: %2f$. \n", interesesCobrados );


    }
}