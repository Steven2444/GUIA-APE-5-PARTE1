import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ejercicio3_Obras {
    public static void main(String[] args) {
        // Formato de cada línea en obras.txt: nombre,categoria
        Map<String, Integer> categorias = new LinkedHashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("obras.txt"))) {
            String linea;
            System.out.println("=== OBRAS DEL MUSEO ===");
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                String[] partes = linea.split(",");
                if (partes.length < 2) continue;
                String nombre = partes[0].trim();
                String categoria = partes[1].trim();
                System.out.println(nombre + " - " + categoria);
                categorias.put(categoria, categorias.getOrDefault(categoria, 0) + 1);
            }
            System.out.println("\n=== CLASIFICACIÓN POR CATEGORÍA ===");
            for (Map.Entry<String, Integer> e : categorias.entrySet()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error al leer obras.txt: " + e.getMessage());
        }
    }
}
