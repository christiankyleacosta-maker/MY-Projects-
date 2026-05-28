public class whileLoop {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.print("Enter Tree Height: ");
        int height = scan.nextInt();
        
        int rep = 1;
        while (rep <= 3) {
            int i = 0;
            while (i <= height) {
                int k = height;
                while (k > i) {
                    System.out.print(" ");
                    k--;
                }
                int j = 1;
                while (j <= 2 * i + 1) {
                    System.out.print("*");
                    j++;
                }
                
                System.out.println();
                i++;
            }
            rep++;
        }
        
        int i = 1;
        while (i <= height / 2) {
            int j = 0;
            while (j <= height / 2 + 1) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= height / 2) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        
    }
}
