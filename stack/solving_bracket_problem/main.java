import java.util.ArrayDeque;

public class main {

    static boolean is_valid(String str) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i=0; i< str.length(); i++) {
            
            char ch = str.charAt(i);

            // case one where open bracket
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
               
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if (ch == ')' && open != '(' || 
                    ch == ']' && open != '[' ||
                    ch == '}' && open != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        
        String s1 = "()";
        String s2 = "((})";
        String s3 = "{[()]}";

        System.out.println("valid structure: " + is_valid(s1));
        System.out.println("valid structure: " + is_valid(s2));
        System.out.println("valid structure: " + is_valid(s3));
    }

}