package code5_12;

public class Main {
	public static void printArray(int[] test) {
		for (int element : test) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);
	}
}
