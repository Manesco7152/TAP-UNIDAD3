package StephanieMartínez.EjercicioN2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MainLibro {
    
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        Libro l1=new Libro();
        Libro l2=new Libro();
        Libro l3 =new Libro();
        l1.setPaginas(500);
        l1.setAutororiginal("pepe");
        l1.setFormatos("bolsillo");
        l1.setNombre("caperusita");
        l1.setLibreriadeventa("porrua");


        l2.setPaginas(110);
        l2.setAutororiginal("jose");
        l2.setFormatos("normal");
        l2.setNombre("Torre oscura");
        l2.setLibreriadeventa("porrua");


        System.out.println("Escribe le numero de paginas");
        l3.setPaginas(op.nextInt());
        System.out.println("Escribe autor original");
        l3.setAutororiginal(op.next());
        System.out.println("Escribe el tipo de formato");
        l3.setFormatos(op.next());
        System.out.println("Escribe el nombre del libro");
        l3.setNombre(op.next());
        System.out.println("Escribe la libreria donde lo venden");
        l3.setLibreriadeventa(op.next());

        List <Libro> list =new ArrayList<>();
        list.add(l3);
        list.add(l1);
        list.add(l2);
        for (Libro libro : list) {
            System.out.println(libro);
        }
}
}