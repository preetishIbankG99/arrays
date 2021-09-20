package september;

public class CopyArray {
public static void main(String[] args) {
	//source array
	char[]copyFrom= {'d','e','c','a','f','f','e','i','n','a','t','d'};
	//destination array
	char[]copyTo=new char[7];
	System.arraycopy(copyFrom, 2, copyTo,0,7);
	System.out.println(String.valueOf(copyTo));
}
}
