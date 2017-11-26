/*
 * 
 * 
 */

package yaba;

import java.util.StringTokenizer;


public class Tokenizer {
    
    String delimitador = " <>(){};";
    int cursor_anterior=-1, cursor_actual=-1, linea=0;
    String token_raw;
    Lexer lexer = new Lexer();
    
    public String tokenize(String linea_codigo) {
       StringTokenizer lineas = new StringTokenizer(linea_codigo);
       StringTokenizer tokens;
       while(lineas.hasMoreTokens()) {
        linea++;
        tokens = new StringTokenizer(lineas.nextToken(), delimitador, true);
        
        Tokens tokenlist = new Tokens();
        while (tokens.hasMoreTokens()) {
            token_raw = tokens.nextToken().trim();
            Token full_token = lexer.getToken(token_raw);
            tokenlist.addTokens(full_token);
            }
        }
       return token_raw;
    }
}
