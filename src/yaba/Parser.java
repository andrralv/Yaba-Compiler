/*  
 *
 */
package yaba;

import java.util.ArrayList;

/**
 *
 * @author andrralv
 */

public class Parser {
    Tokens tokenlist = new Tokens();
    String tokenString = "";
    SintaxisValida sintaxis = new SintaxisValida();
    
    public Parser() {
    
    }
    
    public void parse(Tokens tokens) {
        
        ArrayList<Token> tokenList = tokens.getTokens();
        Node root = new Node(new Token("statement", "root"));
        Node cursor = root;
        for (Token t: tokenList) {
            Node child = new Node(t);
            child.setParent(cursor);
            child.index = cursor.index + 1;
            cursor.getChildren().add(child);
            if (t.getValue().equals(sintaxis.delimitators_open[1]) || (t.getValue().equals(sintaxis.delimitators_open[0]))){
                cursor = child;
            }
            if (t.getValue().equals(sintaxis.delimitators_closed[1]) || (t.getValue().equals(sintaxis.delimitators_closed[0]))){               
                cursor = child.getParent().getParent();
                child.index = child.index - 1;
    
            }
        }
        System.out.println(root);

    }
}
