import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_Mensaje {
    public static void main(String[] args) {
        int total = 0;
        try (FileReader fr = new FileReader("mensaje.txt")) {
            int c;
            System.out.println("=== MENSAJE DE EMERGENCIA ===");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
                total++;
            }
            System.out.println();
            System.out.println("Total de caracteres: " + total);
        } catch (IOException e) {
            System.out.println("Error al leer mensaje.txt: " + e.getMessage());
        }
    }
}
