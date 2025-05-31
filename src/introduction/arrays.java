package introduction;

import java.util.ArrayList;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		
		array[0] =2;
		array[1] = 5;
		array[2]= 4;
		array[3]=7;
		array[4]=9;
		
		//System.out.println(array[2]);
		
		//for loop
		
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
		String[] name = new String [5];
		
		name[0] ="abc";
		name[1]= "xyz";
		name[2]="cow";
		name[3]="dog";
		
		for(String s: name) {
			System.out.println(s);
		}
        
		
		int[] array2 = new int[5];
		
		array2[0] = 1;
		array2[1] = 2;
		array2[2] = 3;
		array2[3] = 4;
		array2[4] = 5;
		
		for(int i =0;i<array2.length;i++) {
			if (array[i] %2 ==0 ) {
				System.out.println(array[i]);
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Rahul");
		a.add("Shetty");
		
		System.out.println(a);
	}

}
