package com.leetcode.easy.problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by zhao on 2017/8/10.<br/>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.<br/>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Solution20 {

    public static void main(String[] args) {
        String s = "(){}[]]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){//左括号
                stack.push(map.get(c));
            }else{
                if(stack.isEmpty() || c != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}