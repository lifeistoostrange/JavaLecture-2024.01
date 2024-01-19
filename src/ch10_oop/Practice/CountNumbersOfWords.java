package ch10_oop.Practice;

public class CountNumbersOfWords {

	public static void main(String[] args) {
		String syntax = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?";

		System.out.println("입력된 구문: " + syntax);

		String lowerCaseSyntax = syntax.toLowerCase().replaceAll("[^a-zA-Z0-9_\\s]", "");
		String[] dividedSyntax = lowerCaseSyntax.split("\\s+");

		int count = 0;

//		for (int i = 0; i <= dividedSyntax.length; i++) {
//			for (int j = i; j <= dividedSyntax.length - i; j++) {
//				if (dividedSyntax[i] == dividedSyntax[j]) {
//					
//				}
//			}
//		}

		System.out.println("단어의 개수: " + dividedSyntax.length);
		for (int i = 0; i < dividedSyntax.length; i++) {
			System.out.println(dividedSyntax[i] + "\n");
		}
	}

}
