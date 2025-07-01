//Example usage of stackDS
/*
You are given a string containing lowercase alphabets along with special characters # and *:

# represents an Undo operation — it removes the most recently added character (if any).

* represents a Redo operation — it restores the most recently undone character (if any).

Lowercase characters (a–z) are added to the current text.

Your task is to simulate the behavior of a basic text editor that supports these operations and return the final resulting string.

Input:
A single string str consisting of lowercase letters, #, and *.
1 <= str.length <= 10^5

Output:
Return the final string after processing all characters from left to right, applying the undo and redo rules.

Example:
Input: "abc#de##*f"
Output: "abdf"
 */
package stackDs.array.implementation;
import java.util.Stack;

public class UndoRedo {
    public static String undoRedo(String str){
        Stack<Character> stack = new Stack<>();
        Stack<Character> deleted = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '#'){
                if (!stack.isEmpty()) {
                    deleted.push(stack.pop());
                }
            } else if (ch == '*') {
                if (!deleted.isEmpty()) {
                    stack.push(deleted.pop());
                }
            } else {
                stack.push(ch);
            }
        }


        StringBuilder result = new StringBuilder();
        for(char c : stack){
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = undoRedo("abc#de##*f");
        System.out.println(result);
    }
}
