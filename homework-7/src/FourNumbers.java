import java.util.Scanner; 
public class FourNumbers {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("How long is the list (must be at least 4)? ");
	        int size = input.nextInt(); //define the size of the array. 
	        int[] list = new int[size]; //create the array at the specified size. 
	       
	        System.out.print("Enter the integers in the list: ");
	        for (int i = 0; i < size; i++) list[i] = input.nextInt();

	        if (isConsecutiveFour(list)) {
	            System.out.println("The list has four consecutive values.");
	        } 
	        
	        else {
	            System.out.println("The list does not have four consecutive values.");
	        }


	    }

	    public static boolean isConsecutiveFour(int[] list) {

	        int sequence = 0;
	        int last = list[0];
	        for (int i = 1; i < list.length; i++) {

	            if (list[i] == last) {
	                sequence++;
	            } else {
	                sequence = 1;
	                last = list[i];
	            }
	            if (sequence == 4) return true;

	        }

	        return false;
	    
	
	}

}
