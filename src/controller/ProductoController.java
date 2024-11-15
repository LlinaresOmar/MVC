package controller;

import dto.Producto;

public class ProductoController {

    FuncionesFichero fichero;

    public ProductoController(){
        fichero = new FuncionesFichero();
    }

    public void hacerEscritura(String nombreFichero, Producto producto){
        fichero.escribirFicheroBinario(nombreFichero, producto);
    }

    public Producto  hacerLectura(String nombreFichero){
        return fichero.leerFicheroBinario(nombreFichero);
    }
}
