package my.test;

import java.math.BigDecimal;

public class Test1 {

	public static void main(String[] args) {
		calRecArea(10, 20);


	System.out.println("hello world");
	int widthRec = 10;
	int heightRec = 20;

	System.out.println("width :" + widthRec);
	System.out.println("height:" + heightRec);
	System.out.println("사각형면적:" + (heightRec * widthRec));
	System.out.println("사각형면적:" + (heightRec / widthRec));

	char c = 'a';
	String d = "apple";

	System.out.println(c);
	System.out.println(d);


	BigDecimal big;


	big = new BigDecimal(0);



	System.out.println(big);


}


	private static void calRecArea(int w, int h) {
		int widthRec = w;
		int heightRec = h;

		System.out.println("width :" + widthRec);
		System.out.println("height:" + heightRec);
		System.out.println("사각형면적:" + (heightRec * widthRec));
		System.out.println("그냥테스트:" + (heightRec / widthRec));
}



}
