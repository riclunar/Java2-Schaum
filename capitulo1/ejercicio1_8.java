/* Ejercicio 1.8
Escriba un programa que escriba en la pantalla cuánto le dará su banco después de 6 meses si pone  2000$
en una cuenta a lazo fijo de 2.75% anual. Recuerde que al pagarle los intereses el banco le retenrá el 18% para hacienda.
Escriba los mensajes apropiados para entender todos los cálculos. */

public class ejercicio1_8{
    public static void main(String[] args) {
        double inversion = 2000,
        plazofijo = 2.75,
        intereses = ((inversion * plazofijo)/ 100) /2,
        retencion = ((intereses * 18)/100),
        ganancia = intereses - retencion;

        System.out.println("Usted está invirtiendo: " + inversion);
        System.out.println("Intres anual: " + plazofijo);
        System.out.println("Usted genero en 6 meses los siguientes intereses: "+intereses);
        System.out.println("Total de retenciones: "+ retencion);
        System.out.println("Usted tuvo una ganancia de: "+ ganancia);
    }
}