package com.javalab.lambda03;

/**
 * 함수형 인터페이스(메소드가 하나인 인터페이스)
 * - 람다식을 만들어서 저장할 인터페이스
 */
@FunctionalInterface // 어노테이션
interface MyFunctionalInterface {
	public void run(); // 유일한 추상 메소드(껍데기 메소드 , 작업 지시 사항) , abstract 생략 가능
}

/**
 * 람다식 테스트 클래스
 * - 매개 변수가 없고 return문이 없는 람다 함수
 */

public class Lambda003 {

	public static void main(String[] args) {
		MyFunctionalInterface fi; // 함수형 인터페이스 타입 참조변수
		
		/*
		 * [1] 매개 변수가 없으면 빈 괄호() 사용 가능
		 * - 구현 내용이 여러 문장이면 중괄호{}로 감싸야 함
		 */
		fi = () -> { // 익명 구현 객체 탄생
			String str = "method call1";
			System.out.println(str); // run()메소드 내용
		};
		fi.run(); // 익명 구현 객체의 run()메소드 호출
		
		// [2] 구현(실행) 내용이 한 줄이면 중괄호{}를 써도 되고, 생략도 가능함
		// 생략시 세미콜론도 생략 가능
		fi = () -> {System.out.println("method call2");}; // 익명 구현 객체 탄생
		fi.run(); // 익명 구현 객체의 run()메소드 호출
		
		// [3] 구현(실행) 내용이 한 줄이면 중괄호{} 생략 가능
		fi = () -> System.out.println("method call3"); // 익명 구현 객체 탄생
		fi.run(); // 익명 구현 객체의 run()메소드 호출
		
		// [4] 람다식을 사용하지 않고 익명 구현 객체 생성
		// 익명 구현 클래스 정의와 동시에 객체 생성
		// 익명 구현 객체
		fi = new MyFunctionalInterface() {
			
			@Override
			public void run() {
				System.out.println("람다식 사용없이 익명 구현 객체의 run()메소드 호출");
				
			}
		};
		fi.run();
	}

}
