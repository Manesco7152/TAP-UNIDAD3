import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class MainLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro l1 = new Libro();
        l1.setTitulo("El principito");
        l1.setAutor("Antoine de Saint-Exupery");
        l1.setEditorial("Marin");
        l1.setAño(2009);
        l1.setPrecio(160);
        Libro l2 = new Libro();
        l2.setTitulo("Cien años de soledad");
        l2.setAutor("Gabriel Garcia Marquez");
        l2.setEditorial("Real Academia Española");
        l2.setAño(2007);
        l2.setPrecio(350);
        Libro l3 = new Libro();
        System.out.println("Ingresa el titulo del libro: ");
        l3.setTitulo(sc.nextLine());
        System.out.println("Ingresa el autor del libro: ");
        l3.setAutor(sc.nextLine());
        System.out.println("Ingresa la editorial del libro: ");
        l3.setEditorial(sc.nextLine());
        System.out.println("Ingresa el año del libro: ");
        l3.setAño(sc.nextInt());
        System.out.println("Ingresa el precio del libro: ");
        l3.setPrecio(sc.nextInt());
        sc.close();
        List <Libro> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        for (Libro libro : list) {
            System.out.println(libro);
        }
    }
}