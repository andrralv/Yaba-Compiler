/*
 * Clase de utilidad creada personalmente para
 * numerar las lineas del output del compilador
 */

package yaba;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author andrralv
 */
public class Numbers {
    // crea el formato para numerado de lineas
    public String formatNumber(int number) {
        String line = String.format("%04d", number);
        return line;
    }
    
    // obtiene el numero de lineas de un documento
    public int getLineNumber(BufferedReader reader) throws IOException {
        int counter = 0;
        while (true) {
            if (reader.readLine() != null) {
                counter++;}
            else {
                break;}
        }
    return counter;
    }
}
