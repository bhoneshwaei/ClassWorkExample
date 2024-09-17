package pattern;

public class SandglassPattern {

	public static void main(String[] args) {
		
		 int rows = 5;

	        // Upper part
	        for (int i = rows; i >= 1; i--) {
	            for (int j = rows; j > i; j--) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Lower part
	        for (int i = 2; i <= rows; i++) {
	            for (int j = rows; j > i; j--) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	}

}
