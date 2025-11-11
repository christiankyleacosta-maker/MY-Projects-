public class dowhileLoop {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.print("Enter Tree Height: ");
        int height = scan.nextInt();
        
        int rep = 1;
        do {
            int i = 0;
            do {
                int k = height;
                do {
                    if (k > i) {
                        System.out.print(" ");
                    }
                    k--;
                } while (k >= 0 && k > i);
                
                int j = 1;
                do {
                    if (j <= 2 * i + 1) {
                        System.out.print("*");
                    }
                    j++;
                } while (j <= 2 * i + 1);
                
                System.out.println();
                i++;
            } while (i <= height);
            rep++;
        } while (rep <= 3);
        
        int i = 1;
        do {
            int j = 0;
            do {
                if (j <= height / 2 + 1) {
                    System.out.print(" ");
                }
                j++;
            } while (j <= height / 2 + 1);
            
            int k = 1;
            do {
                if (k <= height / 2) {
                    System.out.print("*");
                }
                k++;
            } while (k <= height / 2);
            
            System.out.println();
            i++;
        } while (i <= height / 2);
        
    }
}
