package ch2lab;

public class ReplaceTester {
	
	public static void main(String[] args){
		String str = "Mississippi";
		replaceChar(str);
	}
	
	public static void replaceChar(String input){
		char[] charArr = input.toCharArray();
		for(int i = 0;i < charArr.length;i++){
			switch(charArr[i]){
				case'i':
					charArr[i] = '!';
					break;
				case 's':
					charArr[i] = '$';
					break;
			}
			System.out.print(charArr[i]);
		}
	}

}
