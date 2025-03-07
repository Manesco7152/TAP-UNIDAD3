package JasonRojas.EjercicioN2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLibro {
  



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        Libro libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setEditorial("Sudamericana");
        libro1.setEdicion("Primera");
        libro1.setPaginas(417);

        Libro libro2 = new Libro();
        libro2.setTitulo("El principito");
        libro2.setAutor("Antoine de Saint-Exupéry");
        libro2.setEditorial("Reynal & Hitchcock");
        libro2.setEdicion("Segunda");
        libro2.setPaginas(96);

  
        Libro libroUsuario = new Libro();
        System.out.println("Ingrese el título del libro:");
        libroUsuario.setTitulo(entrada.nextLine());

        System.out.println("Ingrese el autor del libro:");
        libroUsuario.setAutor(entrada.nextLine());

        System.out.println("Ingrese la editorial del libro:");
        libroUsuario.setEditorial(entrada.nextLine());

        System.out.println("Ingrese la edición del libro:");
        libroUsuario.setEdicion(entrada.nextLine());

        System.out.println("Ingrese el número de páginas:");
        libroUsuario.setPaginas(entrada.nextInt());

       
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libroUsuario);


        for (Libro libro : listaLibros) {
            System.out.println(libro);
            System.out.println("----------------------------");
        }

    }
}


