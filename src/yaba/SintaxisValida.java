/*
 * Todo: cada metodo deberia ser una lista separada de keywords
 * segun funciones diferentes.
 * Ejemplo: Lista de operadores, lista de keywords de decision, lista de
 * keywords de clase, etc.
 */
package yaba;

/**
 * 1. variable
 * 
 */
public class SintaxisValida {
        String[] control;
        String[] loop;
        String[] exceptions;
        String[] keywords;
        String[] legacy;
        String[] digits;
        String[] dataTypes;
        String[] operators;
        String[] comparison_operators;
        String[] delimitators_open;
        String[] delimitators_closed;
        String[] comments;
        String[] end_line;
  
        
    public SintaxisValida() {
        control = new String[3];
        loop = new String[2];
        exceptions = new String[4];
        keywords = new String[16];
        legacy = new String[2];
        dataTypes = new String[6];
        digits = new String[5];
        dataTypes = new String[7];
        operators = new String[5];
        comparison_operators = new String[7];
        delimitators_closed = new String[4];
        delimitators_open = new String[4];
        comments = new String[3];
        end_line = new String[3];
        
        delimitators_open();
        delimitators_closed();
        comments();
        control();
        loop();
        exceptions();
        keywords();
        legacy() ;
        dataTypes();
        digits() ;
        operators();
        comparison_operators();
        end_line();
    }
    
    void delimitators_open() {
        delimitators_open[0] = "(";
        delimitators_open[1] = "{";
        delimitators_open[2] = "[";
        delimitators_open[3] = "<";
    }
    
    void delimitators_closed() {
        delimitators_closed[0] = ")";
        delimitators_closed[1] = "}";
        delimitators_closed[2] = "]";
        delimitators_closed[3] = ">";
    }
    
    void comments() {
        comments[0] = "//";
        comments[1] = "/***";
        comments[2] = "***/";

    }
    
    void control() {
        
        control[0] = "if";
        control[1] = "else";
        control[2] = "switch";
    }
    
    void loop() {
        
        loop[0] = "for";
        loop[1] = "while";
    }
    
    void exceptions() {
        
        exceptions[0] = "try";
        exceptions[1] = "catch";
        exceptions[2] = "raise";
        exceptions[3] = "throw";
    }
    
    void keywords() {
        
        keywords[0] = "not";
        keywords[1] = "True";
        keywords[2] = "False";
        keywords[3] = "return";
        keywords[4] = "public";
        keywords[5] = "private";
        keywords[6] = "extends";
        keywords[7] = "new";
        keywords[8] = "package";
        keywords[9] = "import";
        keywords[10] = "static";
        keywords[11] = "println";
        keywords[12] = "System.out.println";
        keywords[13] = "abstract";
        keywords[14] = "class";
        keywords[15] = "";
    }    
    
    void legacy() {
        
        legacy[0] = "continue";
        legacy[1] = "break";
    }
    
    void dataTypes() {
        
        dataTypes[0] = "class";
        dataTypes[1] = "String";
        dataTypes[2] = "char";
        dataTypes[3] = "Array";
        dataTypes[4] = "byte";
        dataTypes[5] = "boolean";
        dataTypes[6] = "void";
    }   
    
    void digits() {
        
        digits[0] = "int";
        digits[1] = "float";
        digits[2] = "long";
        digits[3] = "short";
        digits[4] = "double";
    }
    
    void operators() {
        
        operators[0] = "+";
        operators[1] = "-";
        operators[2] = "/";
        operators[3] = "*";
        operators[4] = "%";
    }   
    void comparison_operators() {
        
        comparison_operators[0] = "=";
        comparison_operators[1] = "==";
        comparison_operators[2] = "!=";
        comparison_operators[3] = ">";
        comparison_operators[4] = "<";
        comparison_operators[5] = ">=";
        comparison_operators[6] = ">=";
    }
    
    void end_line() {
        end_line[0] = ";";
        end_line[1] = "'";
        end_line[2] = "\"";
    }
    
}
