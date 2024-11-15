package view;

import controller.ProductoController;
import dto.Producto;

public class Main {

    static ProductoController productocontroller;

    public static void main(String[] args) {

        String nombreFichero = "salida.dat";
        Producto p = new Producto("pan", 5);
        productocontroller = new ProductoController();
        productocontroller.hacerEscritura(nombreFichero, p);
        System.out.println(productocontroller.hacerLectura(nombreFichero));
    }
}
