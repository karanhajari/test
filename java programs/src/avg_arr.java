
public class avg_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		int sum = 0;
		
		for (int i =0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		double avg = sum / (arr.length);
		System.out.println(avg);

	}

}
