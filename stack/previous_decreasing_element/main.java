import java.util.ArrayDeque;

public class main {
    static int [] pDecrease(int [] arr) {

        int n = arr.length;
        int [] result = new int [n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i=arr.length-1; i>=0; i--) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }

    public static void main(String [] args) {
        int [] arr = {5,3,4,5,6,7,8,8,2};

        int [] res = pDecrease(arr);

        for (int x: res) {
            System.out.println(x + " ");
        } 
    }
}