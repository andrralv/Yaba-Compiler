/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaba.exceptions;

/**
 *
 * @author
 */
public class Error 
{
    private int line;
    private String error;

    public Error(int line, String error) 
    {
        this.line = line;
        this.error = error;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
