import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4_Resultados {
    public static void main(String[] args) {
      
        int maximo = Integer.MIN_VALUE;
        String ganador = "";
        try (BufferedReader br = new BufferedReader(new FileReader("resultados.txt"))) {
            String linea;
            System.out.println("=== PARTICIPANTES ===");
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                String[] partes = linea.split(",");
                if (partes.length < 2) continue;
                String nombre = partes[0].trim();
                int puntaje = Integer.parseInt(partes[1].trim());
                System.out.println(nombre + " - " + puntaje + " puntos");
                total += puntaje;
                if (puntaje > maximo) {
                    maximo = puntaje;
                    ganador = nombre;
                }
            }
            System.out.println("\nPuntaje total: " + total);
            System.out.println("Puntaje más alto: " + maximo + " (" + ganador + ")");
        } catch (IOException e) {
            System.out.println("Error al leer resultados.txt: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Un puntaje no es un número válido: " + e.getMessage());
        }
    }
}
