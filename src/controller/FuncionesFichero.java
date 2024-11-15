package controller;

import dto.Producto;

import java.io.*;

public class FuncionesFichero {

    public Producto leerFicheroBinario(String nombreFichero){
        FileInputStream fichero = null;
        ObjectInputStream serializador = null;
        Object objeto = null;

        try {
            fichero = new FileInputStream(nombreFichero);
            serializador = new ObjectInputStream(fichero);

            objeto = serializador.readObject();

            return (Producto) objeto;

        } catch (FileNotFoundException fnfe){
            System.out.println("No se encuentra el fihcero especificado");
        } catch (ClassNotFoundException cnfe){
            System.out.println("Tipo de objeto no conocido");
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            if (serializador != null){
                try {
                    serializador.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
        return (Producto) objeto;
    }

    public void escribirFicheroBinario(String nombreFichero, Producto producto){
        FileOutputStream fichero = null;
        ObjectOutputStream serializador = null;

        try {
            fichero = new FileOutputStream(nombreFichero);
            serializador = new ObjectOutputStream(fichero);
            serializador.writeObject(producto);
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            if (serializador != null){
                try {
                    serializador.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
}
