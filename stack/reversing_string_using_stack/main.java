import java.util.ArrayDeque;

public class main {
    static String reverse(String str) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i< str.length(); i++) {        
            char ch = str.charAt(i);

            stack.push(ch);

        }
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        } 
        return reversed;
    }

    public static void main(String[] args) {
        
        String s1 = "babuska";
        String s2 = "bulldozer";
        String s3 = "mahesh";

        System.err.println("reversed string: " + reverse(s1));
        System.err.println("reversed string: " + reverse(s2));
        System.err.println("reversed string: " + reverse(s3));
    }   
}