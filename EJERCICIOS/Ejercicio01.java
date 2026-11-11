import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_Pistas {
    public static void main(String[] args) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("pistas.txt"))) {
            String linea;
            System.out.println("=== PISTAS DE LA INVESTIGACIÓN ===");
            while ((linea = br.readLine()) != null) {
                contador++;
                System.out.println("Pista " + contador + ": " + linea);
            }
            System.out.println("Total de pistas: " + contador);
        } catch (IOException e) {
            System.out.println("Error al leer pistas.txt: " + e.getMessage());
        }
    }
}
