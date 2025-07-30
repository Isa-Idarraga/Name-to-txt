import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class nombree {
   public static void main(String[] args) {
      Scanner letricas = new Scanner(System.in);
      System.out.println("Introduce tu nombre:");
      String nombre = letricas.nextLine();

      try (BufferedWriter escribir = new BufferedWriter(new FileWriter("nombre.txt"))){
            escribir.write(nombre);
            System.out.println("Nombre guardado en nombre.txt");
         } catch (IOException e) {
            System.out.println("Error al escribir en el archivo"+ e.getMessage());
        } finally {
         letricas.close();
        }
    }
}
