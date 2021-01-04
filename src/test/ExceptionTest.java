package test;

public class ExceptionTest {
	static void PrintSomething(String str) throws Exception {
		if("".contentEquals(str)) {
			throw new Exception("야 .. 빈물자열을 왜 프린트 할려구 하니 ?");
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		try {
			PrintSomething("123");
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
	
		String str = "백이십";
		try {
			int num = Integer.parseInt(str);//여기서 오류가나면
			System.out.println(num);
			System.out.println("위에 코드가 정상이면 난 실행됨");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Class.forName("oracle.jdbc.OracleDriver");//직접 적어야되는 요소가 많으므로 트라이 캡치 무조건 사용하게함.
			System.out.println("위 코드가 드라이버가 있다면 난 실행됨");//밑에 실행이 안됨 .
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}

	}//하지만 트라이 캐치 이용하면 위에 코드는 오류나는 이유 말해주고 밑에꺼 실행한다 .

}
