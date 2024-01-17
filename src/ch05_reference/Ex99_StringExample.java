package ch05_reference;

public class Ex99_StringExample {

	public static void main(String[] args) {
		
		// Q1
		String numStr = "";
		for (int i = 1; i <= 1000; i++) {
			numStr += i;
		}
		String oneStr = numStr.replaceAll("[^1]", "");
		System.out.println("1에서 1000사이의 1은 " + oneStr.length() + "번 나왔습니다.");

		for (int i = 0; i <= 9; i++) {
            String pattern = "[^" + i + "]";
            String countStr = numStr.replaceAll(pattern, "");
            int count = countStr.length();
            System.out.println(i + ": " + count);
		}
            
		
		// Q2
		int displayTime = 0;

		for (int hour = 0; hour <= 23; hour++) {
			for (int minute = 0; minute <= 59; minute++) {
				String clock = hour + ":" + minute;
				if (clock.contains("3")) {
					displayTime += 60;
				}
			}
		}

		System.out.println("하루동안 3이 표시되는 시간은 " + displayTime + "초 입니다.");

		
		// Q3
		int maxPal = 0, max1 = 0, max2 = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				int mul = i * j;
                String s = String.valueOf(mul);

                if (s.equals(new StringBuilder(s).reverse().toString()) && mul > maxPal) {
                    maxPal = mul;
                    max1 = i;
                    max2 = j;
                }
			}
		}
		System.out.println(max1 + " * " + max2 + " = " + maxPal);
		
		
		// Q4
		String path = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";

        // split 후 맨 마지막 요소
        String[] pathArr = path.split("/");
        System.out.println(".split 메소드를 이용해 배열로 반환 후 .length 메소드를 사용한 출력 : " + pathArr[pathArr.length - 1]);

        // 맨 마지막에 있는 / 위치를 찾아서 substring 메소드를 찾는 방법
        int fileIndex = path.lastIndexOf('/');
        System.out.println(".lastIndexOf 메소드를 사용해 출력 : " + path.substring(fileIndex + 1));
	}

}
