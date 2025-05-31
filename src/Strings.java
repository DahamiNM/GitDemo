
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = "Dahami Nayantara Munmulla";
		//System.out.println(S1);
		
		String S2 = new String();
		S2= "Welcome to automation";
		
		String[] splittedItem = S1.split("");
		
		for(int i=0; i<splittedItem.length;i++){		
			System.out.println(splittedItem[i]);
		}
		
		
		
		String S3 = "Sri Jayawardhanapura University";
		
		for(int i=0;i<S3.length();++i) {
			System.out.println(S3.charAt(i));
		}

		
		
	}

}
