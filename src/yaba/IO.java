/* Lee el archivo .YABA y escribe el output
 * en el archivo de errores o en un nuevo archivo compilado
 */

package yaba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

class IO {
    
    public BufferedReader readFile(String filename) throws UnsupportedEncodingException, FileNotFoundException, IOException
    {
        filename = filename.replace(".yaba", ".txt");
        BufferedReader bf;
        
        File f;
        try {
            f = new File(filename);
            if (!f.exists()) {
                f.getParentFile().mkdirs();
                f.createNewFile();
            } else {
               f.createNewFile();
            }
            
        } catch (IOException e) {
            System.out.print("No existe el archivo o introdujiste el nombre incorrecto.");
            f = new File(filename);
            System.out.print(f.getAbsolutePath());
        } 
        
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(f), "UTF-8");
        bf = new BufferedReader(inputStreamReader); 
               
    return bf;
    }
    
    // escribe el nuevo archivo
    public void writeFileWithNumbers (BufferedReader reader, int lineNumber) throws IOException {
        Numbers addLineNumbers = new Numbers();
        File file = new File(".\\YABA-errores.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file); 
        BufferedWriter out = new BufferedWriter(writer);
        
        for (int i=0;i<lineNumber;i++){
            out.write(addLineNumbers.formatNumber(i) + " " + reader.readLine());
            out.newLine();
            }
        out.close();
        }
    
    public void setStartOfFile (BufferedReader reader, int lineNumber) throws IOException {
        File file = new File(".\\input_temp.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file); 
        BufferedWriter out = new BufferedWriter(writer);
        out.append("");
        
        for (int i=0;i<lineNumber;i++){
            out.write(reader.readLine());
            out.newLine();
            }
        out.close();
        }
    
}