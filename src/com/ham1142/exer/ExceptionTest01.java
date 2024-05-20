package com.ham1142.exer;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
//		try {
//			int a = 10;
//			int sum = a / 0;  // 0 나누기 에러 발생!
//			System.out.println(sum);
//		} catch (ArithmeticException e) { // e 라고 적어주는 것 - 관례
//			// TODO: handle exception
//			System.out.println("0나누기 에러 발생!! 다시 확인하세요!");
//		} catch(NullPointerException e){
//			System.out.println("Null 값을 가르키고 있습니다!! 다시 확인하세요!");
//		}
		
		try {
			int a = 10;
			int sum = a / 0;  // 0 나누기 에러 발생!
			System.out.println(sum);
		} catch (Exception e) { // e 라고 적어주는 것 - 관례
			// TODO: handle exception
			System.out.println("0나누기 에러 발생!! 다시 확인하세요!");
			e.printStackTrace(); // 에러 코드를 콘솔창에 출력해줌
		} finally { // 파이널리 DB 열고나서 닫을 때 사용함
			System.out.println("에러의 발생 여부와 상관없이 실행됨");
		}
		
	}
	
}
