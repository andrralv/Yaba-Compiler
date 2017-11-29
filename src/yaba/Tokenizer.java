/*
 * 
 * 
 */

package yaba;

import java.util.StringTokenizer;


public class Tokenizer {
    
    String delimitador = " \"'(){};";
    String token_raw;
    Lexer lexer = new Lexer();
    StringTokenizer tokens;
    Tokens tokenlist = new Tokens();
    
    public void tokenize(String linea_codigo) {
       StringTokenizer lineas = new StringTokenizer(linea_codigo);
       
       
       while(lineas.hasMoreTokens()) {
        tokens = new StringTokenizer(lineas.nextToken(), delimitador, true);
                
            while (tokens.hasMoreTokens()) {
            token_raw = tokens.nextToken();
            Token full_token = lexer.getToken(token_raw);
            tokenlist.addTokens(full_token);
            }
        }
       
    }
    public Tokens getTokenList() {
        return this.tokenlist;}
}
