public class BreakExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(/*                              */) {
                System.out.println("Breaking the loop.");
                break;
            }
            System.out.println("i: " + i);
        }
    }
}
