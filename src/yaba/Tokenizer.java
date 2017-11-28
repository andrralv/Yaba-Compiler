/*
 * 
 * 
 */

package yaba;

import java.util.StringTokenizer;


public class Tokenizer {
    
    String delimitador = " <>(){};";
    String token_raw;
    Lexer lexer = new Lexer();
    
    public String tokenize(String linea_codigo) {
       StringTokenizer lineas = new StringTokenizer(linea_codigo);
       StringTokenizer tokens;
       while(lineas.hasMoreTokens()) {
        tokens = new StringTokenizer(lineas.nextToken(), delimitador, true);
        
        Tokens tokenlist = new Tokens();
        
        while (tokens.hasMoreTokens()) {
            token_raw = tokens.nextToken();
            Token full_token = lexer.getToken(token_raw);
            tokenlist.addTokens(full_token);
            }
        }
       return token_raw;
    }
}
