package JasonRojas.EjercicioN2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
 class MainAuto {
  public static void main(String[] args) {
    Scanner op=new Scanner(System.in);
    Auto n1=new Auto();
    n1.setAño(2321);
    n1.setColor("rojo");
    n1.setMarca("toyota");
    n1.setPropietario("jose");
    n1.setModelo("deportivo");
    Auto n2=new Auto();
    n2.setAño(2323);
    n2.setColor("azul");
    n2.setMarca("toyota");
    n2.setPropietario("issac");
    n2.setModelo("spark");
    Auto n3=new Auto(); 
    System.out.println("Escribe el año de tu carro");
        n3.setAño(op.nextInt());
        System.out.println("Escribe el color de tu auto ");
        n3.setColor(op.next());
        System.out.println("Escribe el nombre de tu propietario");
        n3.setPropietario(op.next());
        System.out.println("Escribe el modelo de auto");
        n3.setModelo(op.next());
        List <Auto> list=new ArrayList<>();
        list.add(n3);
        list.add(n2);
        list.add(n1);
        for (Auto auto : list) {
            System.out.println(auto);
        }

  }
}
