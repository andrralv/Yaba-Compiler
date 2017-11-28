/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaba;

import java.util.ArrayList;

public class Token {

  private int cursor;
  private String type;
  private String value;
  public String sequence;

  public Token(int token, String sequence) {
    super();
    this.sequence = sequence;
  }
  
  public Token(int currentLine, String type, String value, int token, String sequence) {
        this.cursor = currentLine;
        this.type = type;
        this.value = value;
        this.sequence = sequence;
    }
  
   public Token(int currentLine, String type, String value) {
        this.cursor = currentLine;
        this.type = type;
        this.value = value;
        this.sequence = "";
    }
   
   public Token(String type, String value) {
        this.type = type;
        this.value = value;
        this.sequence = "";
    }
   
   public Token() {
        this.type = "";
        this.value = "";
        this.sequence = "";
    }
  
  public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

class Tokens {
    public ArrayList<Token> tokens = new ArrayList<Token>();
    
    public ArrayList<Token> getTokens() {
        return tokens;
    }
    
    public void addTokens(Token e) {
        
        try {
            if (this.isAlphaNumeric(e.getValue()) || this.checkBracket(e.getValue()) || this.checkOperator(e.getValue()) || this.checkDigit(e.getValue())) {
                
                System.out.println("Pass: " + e.getType() + " " + e.getValue());
            }
        }
        catch (Exception exp) {
                System.out.println(exp.getMessage());
                System.out.println("Fail: " + e.getType() + " " + e.getValue());
            }   
    }
        
    public boolean isAlphaNumeric(String s){
        String pattern= "^[a-zA-Z0-9]*$";
        return s.matches(pattern);
        }
    
    public boolean checkDigit(String s){
        String pattern= "[0-9]+";
        return s.matches(pattern);
        }
    
    public boolean checkBracket(String s) {
        if (s.equals("{") || s.equals("}") || s.equals("[") || s.equals("]") || s.equals(";") || s.equals("(") || s.equals(")")) {
            return true;
        } else {return false;}
    }
    
    public boolean checkOperator(String s) {
        if (s.equals("-") || s.equals("+") || s.equals("=") || s.equals("%") || s.equals("*") || s.equals("-") || s.equals("<=") || s.equals(">=") || s.equals("==")) {
            return true;
        } else {return false;}
    }
    
    
    public void printTokens() {
       for (Token t : this.tokens) {
           System.out.println("Type: " + t.getType() + "| Value: " + t.getValue());
       }
    }
}