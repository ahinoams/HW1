public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;
                ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (i == 0 || i == 1) {
                a3 = 1;}
            else {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            }
            if (a3 % 2 == 1) {
                numOdd++;
            }
            System.out.print(a3);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
