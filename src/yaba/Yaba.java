package yaba;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * @author andrralv
 */
public class Yaba {

    /**
     * @param args the command line arguments
     * @throws java.io.UnsupportedEncodingException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        System.out.println("Bienvenido al Compilador de YABA");
        System.out.println("Ingrese el nombre de un archivo YABA.");
        System.out.println("El archivo debe de estar en el mismo directorio del programa.");
        System.out.println("Si desea puede utilizar el ejemplo 'input.yaba'");    
        System.out.print(">> ");
        
        Scanner scanner = new Scanner(System.in);
        String archivo = scanner.nextLine();
        IO reader = new IO();
        Numbers numbers = new Numbers();
        // lcontent es un buffer individual para obtener el numero de lineas
        BufferedReader lcontent = reader.readFile(".\\" + archivo);
        BufferedReader content = reader.readFile(".\\" + archivo);
        
        Tokenizer tokenizer = new Tokenizer();
        int line_number = numbers.getLineNumber(lcontent);

        for (int i = 0; i < line_number; i++) {
            tokenizer.tokenize(content.readLine());
        }
        
        reader.writeFileWithNumbers(content, line_number);
    }
}

