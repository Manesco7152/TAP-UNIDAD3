package StephanieMartínez.EjercicioN2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoMain {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Auto vehiculo1 = new Auto();
        vehiculo1.setAño(2020);
        vehiculo1.setColor("Negro");
        vehiculo1.setMarca("Ford");
        vehiculo1.setPropietario("Alicia");
        vehiculo1.setModelo("Mustang");

        Auto vehiculo2 = new Auto();
        vehiculo2.setAño(2022);
        vehiculo2.setColor("Blanco");
        vehiculo2.setMarca("Chevrolet");
        vehiculo2.setPropietario("Roberto");
        vehiculo2.setModelo("Camaro");

        Auto vehiculoUsuario = new Auto();
        System.out.println("Ingrese el año de su vehículo:");
        vehiculoUsuario.setAño(entrada.nextInt());
        entrada.nextLine(); 

        System.out.println("Ingrese el color de su vehículo:");
        vehiculoUsuario.setColor(entrada.nextLine());

        System.out.println("Ingrese la marca de su vehículo:");
        vehiculoUsuario.setMarca(entrada.nextLine());

        System.out.println("Ingrese el nombre del propietario:");
        vehiculoUsuario.setPropietario(entrada.nextLine());

        System.out.println("Ingrese el modelo de su vehículo:");
        vehiculoUsuario.setModelo(entrada.nextLine());

        List<Auto> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(vehiculoUsuario);
        listaVehiculos.add(vehiculo2);
        listaVehiculos.add(vehiculo1);

        System.out.println("\nLista de Vehículos:");
        for (Auto vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }

        entrada.close();
    }
}

