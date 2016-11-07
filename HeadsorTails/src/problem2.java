import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		 int[][] m = new int[3][3];
		 Scanner input = new Scanner(System.in);
	        System.out.println("This code shows 9 heads or tails scenarios.");
	        System.out.println("H for heads and T for tails.");
	        System.out.println("Hit enter to see the results.");
	        input.nextLine();
	        String binary = decimalToBinaryModified(9);

	        // put 1's and 0's using binary string
	        int bIndex = 0; // binary string index
	        for (int i = 0; i < m.length; i++) {

	            for (int k = 0; k < m[i].length; k++) {
	                int coinSide = (binary.charAt(bIndex++) == '0') ? 0 : 1;
	                m[i][k] = coinSide;
	            }
	        }
	        for (int i = 0; i < m.length; i++) {

	            for (int k = 0; k < m[i].length; k++) {
	                char ch = (m[i][k] == 0) ? 'H' : 'T';
	                System.out.print(ch + " ");
	            }
	            System.out.println("");
	        }

	    }

	    public static String decimalToBinaryModified(int n) {

	        StringBuilder s = new StringBuilder();
	        while (n != 0) {
	            s.append(n & 1);
	            n = n >> 1;
	        }
	        while (s.length() < 9) {
	            s.insert(0, "0");
	        }
	        return s.toString();
	        

	}

}
