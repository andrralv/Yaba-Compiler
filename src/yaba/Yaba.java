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
        System.out.println("Escriba el nombre de un ejemplo o ingrese el nombre de un archivo .yaba en el mismo directorio.");  
        System.out.println("");  
        System.out.println("Ejemplos disponibles:");    
        System.out.println("\t input-con-errores.yaba");   
        System.out.println("\t input-sin-errores.yaba");   
        System.out.print(">> ");
        
        Scanner scanner = new Scanner(System.in);
        String archivo = scanner.nextLine();
        IO reader = new IO();
        Numbers numbers = new Numbers();
        // lcontent es un buffer individual para obtener el numero de lineas
        BufferedReader lcontent = reader.readFile(".\\" + archivo);
        BufferedReader llcontent = reader.readFile(".\\" + archivo);
        BufferedReader content = reader.readFile(".\\" + archivo);
        reader.setStartOfFile(content, numbers.getLineNumber(lcontent));
        BufferedReader fcontent = reader.readFile(".\\input_temp.txt");
        Tokenizer tokenizer = new Tokenizer();
        int line_number = numbers.getLineNumber(llcontent);
        Parser parser = new Parser();
        System.out.println("--- ERRORES DE PARSER ---");
        for (int i = 0; i < line_number; i++) {
            tokenizer.tokenize(fcontent.readLine());
        }
        Tokens tokenList = tokenizer.getTokenList();
        // PRUEBA DE LEXER -- IMPRESION Y VALORACION DE LEXICO
        System.out.println("");
        System.out.println("PRUEBA 1 --- TEST DE LEXICO ---");
        tokenList.printTokens();
        System.out.println("********* FIN DE PRUEBA 1 **********");
        System.out.println("");
        // PRUEBA DE SINTAXIS -- COMPROBACION DE GRUPOS Y ARITMETICA
        System.out.println("PRUEBA 2 --- ARBOL SINTACTICO ---");
        parser.parse(tokenList);
        System.out.println("********* FIN DE PRUEBA 2 **********");
        System.out.println("");
        
        reader.writeFileWithNumbers(fcontent, line_number);
    }
}

