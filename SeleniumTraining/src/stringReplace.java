

public class stringReplace {

	public static void main(String[] args) {
		String str="selenium";
		String NewStr=str.replace("e", "i");
		System.out.println(NewStr);
		
		String str1="I am a business man";
		String NewStr1=str1.replace("man", "woman");
		System.out.println(NewStr1);
		
		for(int i=0; i<5; i++) {
			System.out.println("1");
			for (int j=0; j<i; j++) {
				System.out.println("2");
			}
		}

	}

}
