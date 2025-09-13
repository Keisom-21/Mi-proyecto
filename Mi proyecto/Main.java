public class Main {

    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
        
        
        int a = 5;
        int b = 10;
        int suma = a + b;
        System.out.println("La suma de " + a + " + " + b + " es: " + suma);

        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
        
        scanner.close();
    }
}
