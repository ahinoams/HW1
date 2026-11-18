public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String arg : args) {
            if (arg.length() > 0) {
                int ASCII = (int) arg.charAt(0);
                    if (ASCII % 5 == 0) {
                         System.out.println(arg.charAt(0));
                    }

            }

        }
    }
}