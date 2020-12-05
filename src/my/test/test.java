package my.test;

public class test {

	public static void main(String[] args) {

		System.out.println("hello world");

		int widthRec = 10;
		int heightRec = 20;

		System.out.println("여기는 int출력");

		System.out.println("가로 :" + widthRec);
		System.out.println("세로 :" + heightRec);
		System.out.println("사각형면적 : 가로*세로 = " + (widthRec * heightRec));
		System.out.println("그냥사칙연산 더하기 : 가로+세로= " + (widthRec + heightRec));
		System.out.println("그냥사칙연산 빼기 : 가로-세로= " + (widthRec - heightRec));
		System.out.println("이번에는 나누기 : 가로/세로= " + (widthRec / heightRec ) + " 아... int는 소수점 표현 안됨");
		System.out.println("다시 나누기 : 세로/가로= " + (heightRec / widthRec));

		char a = 'c';

		String t ="tree";

		System.out.println("여기는 char랑 String 출력");

		System.out.println("char출력 :" + a);
		System.out.println("String출력 :" + t);

		System.out.println("여기는 if 연습");

		int u = 5;

		System.out.println("u = 5");

		if(u >= 5) {
			System.out.println("u는 5보다 같거나 크다");
		}
		if(u < 5) {
			System.out.println("u는 5보다 작다");
		}

		System.out.println("여기는 if문 연습출력");

		for(int i=0; i<10; i++ ) {
			System.out.println("i는 " +i);
		}

		System.out.println("여기는 while문 출력");

		int i = 1;
		while (i<10) {
			System.out.println(i+"*"+(i+1)+"="+i*(i+1));
			i++;
		}

	}

}
