package test;

public class StaticTest {
	public int num = 1;//스태틱이 아니기 떄문에 인스턴스화 해줘야댐.
	public static int number=1;//스태틱이기때문에 넘버가 기울어짐 . 인스턴스화 안해도됨 . 프로그램 종료될때까지 기억함 .
	
	public static void main(String[] args) {
		StaticTest.number = 10;
		System.out.println(StaticTest.number);
		StaticTest st = new StaticTest();
		System.out.println(st.number);
		st.number=2;
		StaticTest st1 = new StaticTest();
		System.out.println(st1.number);

	}//메인메소드 사용하기전에 스태틱 변수를 기억을 해논다 . 넘버가 1이란걸 안다 . 10인걸 안 순간 10으로 바뀜,
	//노트에 그림 그려놈 .
}
