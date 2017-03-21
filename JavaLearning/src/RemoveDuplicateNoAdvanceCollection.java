import java.util.Base64;

public class RemoveDuplicateNoAdvanceCollection {

	public static void main(String[] args)
	{
		String[] names = {"rashmi", "Rashmi", "Vineet", "Vineet"};
		//Array namesNew = new Array[String][int];
		int count = 0;
		
		String orig = "My name is Rashmi";
		byte[] encoded = Base64.getEncoder().encode(orig.getBytes());
		
		System.out.println(new String(encoded));
				
		byte[] decoded = Base64.getDecoder().decode(encoded);
		System.out.println(new String(decoded));
	}
}
