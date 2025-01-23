
package string;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Aman";
		String [] b=str.split(" ");
		for(String x:b)
		{		String a="";

			for(int i=x.length()-1;i>=0;i--)
			{
				a+=x.charAt(i);

			}
			System.out.print(a+" ");

		}
		
	}

}
