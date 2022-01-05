/*Ejercicio 1.6
Escriba un programa que escriaba en la panalla cuánto le costará comprar unas deportivas cuyo
precio de catálogo es de 85,00$, si se sabe que puede conseguir una rebaja del 15%  */

public class ejercicio1_6{
    public static void main(String[] args) {
        double deportivas = 85.00;
        double descuento = .15;
        deportivas = deportivas - (deportivas*descuento);
        System.out.println("el valor total es: "+ deportivas);
    }
}