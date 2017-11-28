package yaba;
import yaba.exceptions.Error;
import java.util.ArrayList;

/**
 * @author andrralv
 */

public class Lexer {
    
    SintaxisValida tablaSimbolos = new SintaxisValida();

    public Token getToken(String token_raw) {
        Token token = new Token("variable",  token_raw);
        
        String pattern= "[0-9]+";
        if (token_raw.matches(pattern)) {
            token = new Token("digit", token_raw);
        }
            
        if (!token_raw.split("").equals(" ")) {
            for (int i = 0; i < tablaSimbolos.control.length; i++) {
                if (token_raw.equals(tablaSimbolos.control[i])) {
                    String lexema = "control";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.comments.length; i++) {
                if (token_raw.equals(tablaSimbolos.comments[i])) {
                    String lexema = "comment";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.loop.length; i++) {
                if (token_raw.equals(tablaSimbolos.loop[i])) {
                    String lexema = "loop";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.exceptions.length; i++) {
                if (token_raw.equals(tablaSimbolos.exceptions[i])) {
                    String lexema = "exceptions";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.keywords.length; i++) {
                if (token_raw.equals(tablaSimbolos.keywords[i])) {
                    String lexema = "keywords";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.legacy.length; i++) {
                if (token_raw.equals(tablaSimbolos.legacy[i])) {
                    String lexema = "legacy";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.digits.length; i++) {
                if (token_raw.equals(tablaSimbolos.digits[i])) {
                    String lexema = "digits";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.dataTypes.length; i++) {
                if (token_raw.equals(tablaSimbolos.dataTypes[i])) {
                    String lexema = "dataTypes";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.operators.length; i++) {
                if (token_raw.equals(tablaSimbolos.operators[i])) {
                    String lexema = "operator";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.comparison_operators.length; i++) {
                if (token_raw.equals(tablaSimbolos.comparison_operators[i])) {
                    String lexema = "comparison_operator";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.delimitators_open.length; i++) {
                if (token_raw.equals(tablaSimbolos.delimitators_open[i])) {
                    String lexema = "delimitators_open";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.delimitators_closed.length; i++) {
                if (token_raw.equals(tablaSimbolos.delimitators_closed[i])) {
                    String lexema = "delimitators_closed";
                    token = new Token(lexema, token_raw);
                }
            } 
            for (int i = 0; i < tablaSimbolos.end_line.length; i++) {
                if (token_raw.equals(tablaSimbolos.end_line[i])) {
                    String lexema = "end_line";
                    token = new Token(lexema, token_raw);
                    }
                } 
            
            }
        else {
            
        }
        
        return token;
        
    }
}
   