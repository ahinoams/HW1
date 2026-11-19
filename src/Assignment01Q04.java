import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (direction != 'L' && direction != 'R') {
            return array;
        }
        int n = array.length;
        if (n == 0) {return array;}
        
        if (move < 0) {
            if (direction == 'L') {direction = 'R';}
            else {direction = 'L';}
            move = -move;
        }
        
        move = move % n;
        if (move == 0) {return array;}
        if (direction == 'L') {move = n - move;}
        
        boolean [] changed = new  boolean[n];
        for (int i = 0; i < n; i++) {
            changed[i] = false;
        }
        int curr = 0;
        int next = 0;
        int prev = 0;

        for (int i = 0; i < n; i++) {
            if (changed[i] == false) {
                next = (i+move) % n;
                prev = array[i];
                while (changed[next] == false){
                    curr = array[next];
                    array[next] = prev;
                    changed[next] = true;
                    prev = curr;
                    next = (next + move) % n;
                }
                
            }
        }
        
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}