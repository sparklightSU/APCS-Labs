package ch2lab;

public class HollePrinter {
	
	public static void main(String[] args){
		String str = "Hello, World!";
		replaceChar(str);
	}
	
	public static void replaceChar(String input){
		char[] charArr = input.toCharArray();
		for(int i = 0;i < charArr.length;i++){
			switch(charArr[i]){
				case'e':
					charArr[i] = 'o';
					break;
				case 'o':
					charArr[i] = 'e';
					break;
			}
			System.out.print(charArr[i]);
		}
	}

}
