import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		int[] data = {
			157, 149, 125, 144, 132, 150, 164, 138, 144, 152, 
			148, 136, 147, 140, 158, 146, 165, 154, 119, 163, 
			179, 138, 126, 168, 135, 140, 153, 153, 147, 142,
			173, 146, 162, 145, 135, 140, 153, 153, 147, 142
		};

		/*
		 * data = [
		 * 119, 125, 126, 132, 135, 135, 
		 * 136, 138, 138, 140, 140, 140, 
		 * 142, 142, 144, 144, 145, 146, 
		 * 146, 147, 147, 147, 148, 149, 
		 * 150, 152, 153, 153, 153, 153, 
		 * 154, 157, 158, 162, 163, 164, 
		 * 165, 168, 173, 179
		 * ]
		 */

		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		System.out.println("\n" + data.length);

		int[] data2 = {9, 8, 7, 9, 4, 3, 5, 5, 3, 5};

		Arrays.sort(data2);
		System.out.println(Arrays.toString(data2));
		System.out.println("\n" + data2.length);
	}
}	