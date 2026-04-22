package es.etg.prog.pokedex.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FicheroManager {
    
    public static byte[] read(String nombreFichero) throws IOException {
        File fichero = new File(nombreFichero);
        byte[] contenido = Files.readAllBytes(fichero.toPath());
        return contenido;
    }

    public static void write(String nombreFichero, byte[] contenido) throws IOException{ 
        File fichero = new File(nombreFichero);
        Files.write(fichero.toPath(), contenido);
    }

    public static byte[] convertirString(String texto){
        byte[] datosAConvertir = texto.getBytes();
        return datosAConvertir;
    }
}
