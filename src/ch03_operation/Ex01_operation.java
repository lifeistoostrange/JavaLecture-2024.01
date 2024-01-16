package ch03_operation;

public class Ex01_operation {

	public static void main(String[] args) {
		int i = 2, k = 3;
		double f = k / (double) i;							//정수의 소수점계산을 원한다면 계산식에서 강제형변환을 해줘야함
		System.out.printf("%d, %d, %d%n", k/i, i++, k--);
		System.out.printf("%f, %d, %d%n", f, i++, --k);
		
		char c = '안';
		System.out.println(c == '안'); 				// ==은 프리미티브 타임의 값 비교
		String s = new String("Hello");
		System.out.println(s == "Hello");			// 참조형에서는 '저장 위치가 같냐' 라고 질문
		System.out.println(s.equals("Hello"));		// 참조형의 올바른 방법
		
		System.out.println(i == k && k == 4);		// 논리연산자는 각 항마다 분리해서 작성
		
		
		// 성적이 70점 이상이면 합격, 그렇지 않으면 불합격
		int score = 40 + (int) (60 * Math.random());								//double 타입의 숫자 반환
		char grade = score >= 70 ? '급' : '낙';
		System.out.printf("점수: %d, 합격여부: %c%n", score, grade);
	}

}
