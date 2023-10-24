
import java.util.Random;


public class Shffule {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		shuffleArray(arr);
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}

	}

	public static void shuffleArray(int[] arr) {
		
		int n = arr.length;
		Random random = new Random();
		for(int j = n-1; j>0;j--)
		{
		int k = random.nextInt(j + 1);
		
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
		}
	}

}
