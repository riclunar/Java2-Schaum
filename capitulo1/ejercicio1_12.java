/* Ejercicio 1.12
Escriba un programa para calcular el ára y el volúmen de un clilindro. Para ello declar una constante de valor Pi.
eclre también variables para el díametro y la ltura del cilindro. 
Suponga para el ejemplo que el cilindro tiene un diametro de 15.5cm y una altura de 42.4cm */

public class ejercicio1_12{
    public static void main(String[] args) {
        final double PI = 3.141592;

              double altura = 42.4,
                     diametro = 15.5,
                     radio = 0,
                     volumen = 0,
                     area =0;

        /* la fomula para calcular área y columen son:
            v= π r² h
            a= 2π r h + 2π r²

            Fórmula para calcular radio de un circulo: r= diametro/2
        */

            radio = diametro/2;
            volumen = PI * (radio*radio) * altura;
            area = (2*PI * radio * altura) + (2*PI * (radio*radio));

            System.out.println("Se calculará el Volúmen y el Área de un cilindo con "+altura +
                                " de altura y "+diametro+ " de Diámetro. \n");
            
            System.out.printf("Área: %.2f\n", area);
            System.out.printf("Volúmen: %.2f\n", volumen);
    }
}