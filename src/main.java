import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.print("¿En qué año naciste? ");
        int año = sc.nextInt();
        int edad = 2025 - año;
        System.out.println("Hola " + nombre + ", tienes " + edad + 
            " años. Este programa está hecho en el lenguaje de programación: Java.");
        sc.close();
    }
}
