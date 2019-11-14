package com.example.class31;

import android.widget.Toast;

import java.util.Stack;

public class Logic {

    /**
     * check code string validation
     * @param code - the string to check
     * @return true if the code is OK and false if its NOT
     */

    public static boolean chkAnswer(String code) throws Exception{
        Stack<Character> parenthesisStack = new Stack<>();
        for (int i=0; i<code.length(); i++){
            if (code.charAt(i) == '(' || code.charAt(i) == '{' || code.charAt(i) == '['){
                parenthesisStack.push(code.charAt(i));
            }else if(code.charAt(i) == ')' || code.charAt(i) == '}' || code.charAt(i) == ']'){
                        if(parenthesisStack.isEmpty()){
                            return false;
                        }
                    char mostRecentParenthesis = parenthesisStack.pop();
                if(code.charAt(i) - mostRecentParenthesis > 2){
                    return false;
                }
            }
        }
        if(parenthesisStack.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}
