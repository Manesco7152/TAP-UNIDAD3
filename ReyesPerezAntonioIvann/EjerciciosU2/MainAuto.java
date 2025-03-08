import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class MainAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto a1 = new Auto();
        a1.setModelo("Deportivo");
        a1.setMarca("Ford");
        a1.setColor("Azul");
        a1.setAño(2018);
        a1.setPrecio(120000);
        Auto a2 = new Auto();
        a2.setModelo("Golf");
        a2.setMarca("Chevrolet");
        a2.setColor("Rojo");
        a2.setAño(2022);
        a2.setPrecio(150000);
        Auto a3 = new Auto(); 
        System.out.println("Ingresa el modelo de su vehiculo: ");
        a3.setModelo(sc.nextLine());
        System.out.println("Ingrese la marca de su vehiculo: ");
        a3.setMarca(sc.nextLine());
        System.out.println("Ingrese el color de su vehiculo: ");
        a3.setColor(sc.nextLine());
        System.out.println("Ingrese el año de su vehiculo: ");
        a3.setAño(sc.nextInt());
        System.out.println("Ingrese el precio de su vehiculo: ");
        a3.setPrecio(sc.nextInt());
        sc.close();
            List <Auto> list = new ArrayList<>();
            list.add(a1);
            list.add(a2);
            list.add(a3);
            for (Auto auto : list) {
                System.out.println(auto);
            }
    
    }
}