package example.test;
import java.util.Stack;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(isMatched("[(){}[]]"));
    }

    public static boolean isMatched(String expression){
         String open = "({[";
        String close = ")}]";

        Stack<Character> stack = new Stack<>();
        for(Character c : expression.toCharArray()) {
            if (open.indexOf(c) != -1){
                stack.push(c);
            }else if(close.indexOf(c) != -1){
                if(stack.isEmpty())
                    return false;
                if(close.indexOf(c) != open.indexOf(stack.pop()))
                    return false;
            }
        }

         return stack.isEmpty();
    }
}
