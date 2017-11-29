package yaba.exceptions;

public class LexerException extends RuntimeException {

  String msg;
  public LexerException(String msg) {
    super(msg);
    this.msg = msg;
    
  }
  public void printToConsole() {
       System.out.println("PARSER ERROR: " + this.msg);
  }
}

