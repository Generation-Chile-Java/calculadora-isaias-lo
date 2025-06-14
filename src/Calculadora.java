import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa primer numero: ");
        float num1 = teclado.nextFloat();

        System.out.println("Ingresa segundo numero: ");
        float num2 = teclado.nextFloat();

        float resta = num1 - num2;
        System.out.println("La resta es: " + resta);
        float multiplicacion = num1 * num2;
        System.out.println("La multiplicacion es: "+ multiplicacion);
        float division = num1 / num2;
        System.out.println("La division es: " + division);
        float modulo = num1 % num2;
        System.out.println("El modulo es: " + modulo);

    }
}