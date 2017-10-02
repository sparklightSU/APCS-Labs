package ch2lab;

public class ReplaceAs {
	
	public static void main(String[] args){
		System.out.println(appendString("AP Computer Science A", "E","S"));
	}
	
	public static String appendString(String str1,String str2){
		str1 = str1.toUpperCase();
		String toReturn = str1.replace("A", str2);
		return toReturn;
	}
	
	public static String appendString(String str1, String str2, String str3){
		str1 = str1.toUpperCase();
		String toReturn = str1.replace(str2,str3);
		return toReturn;
	}

}
