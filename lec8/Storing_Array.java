import java.util.Scanner;

public class ArrayUse {
	
	
	public static int largestInArray(int input[]){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < input.length; i++){
			if(input[i] > max){
				max = input[i];
			}
		}
		
		return max;
	}
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}
	
	public static void increment(int i){
		i++;
	}

	public static void incrementArray(int input[]){
		input = new int[5];
		for(int i = 0; i < input.length;i++){
			input[i]++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 10;
//		increment(i);
//		System.out.println(i);
		
		int arr[] = {1,2,3,4,5};
		incrementArray(arr);
		print(arr);
		
//		int arr[] = takeInput();
//		System.out.println(arr);
//		print(arr);
//		int largest = largestInArray(arr);
//		System.out.println("Largest " + largest);
		
		
		
		
		
		
	}

}
