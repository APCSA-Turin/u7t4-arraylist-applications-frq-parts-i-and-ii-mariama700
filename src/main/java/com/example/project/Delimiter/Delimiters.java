package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String> delimiters = new ArrayList<>();
        for (String token : tokens) {
            if (token.indexOf(openDel) != -1) {
                delimiters.add(openDel);
            }
            if (token.indexOf(closeDel) != -1) {
                delimiters.add(closeDel);
            }
        }
        return delimiters;
    } 

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < delimiters.size(); i++) {
            if (delimiters.get(i) == openDel) {
                open++;
            }
            if (delimiters.get(i) == closeDel) {
                close++;
            }
            if (close > open) {
                return false;
            }
        }
        if (open == close) {
            return true;
        }  
        return false;
    } 
}
