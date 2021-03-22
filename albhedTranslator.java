import java.util.Scanner;

public class albhedTranslator{  
	private static String enToAl(String en){
		String al = en;
		char[] En = {'a','b','c','d','e',
				'f','g','h','i','j',
				'k','l','m','n','o',
				'p','q','r','s','t',
				'u','v','w','x','y','z'
		};
		char[] Al = {'Y','P','L','T','A',
				'V','K','R','E','Z',
				'G','M','S','H','U',
				'B','X','N','C','D',
				'I','J','F','Q','O','W'
		};

		for (int i = 0; i < En.length; i++) {
			// System.out.println(En[i] + " to " + Al[i]);
			al = al.replace(En[i], Al[i]);
		}
		return al;
	}
	private static String alToEn(String al){
		String en = al;
                char[] Al = {'Y','P','L','T','A',
				'V','K','R','E','Z',
				'G','M','S','H','U',
				'B','X','N','C','D',
				'I','J','F','Q','O','W'
		};
		char[] En = {'a','b','c','d','e',
				'f','g','h','i','j',
				'k','l','m','n','o',
				'p','q','r','s','t',
				'u','v','w','x','y','z'
		};
		for (int i = 0; i < Al.length; i++) {
			// System.out.println(En[i] + " to " + Al[i]);
			en = en.replace(Al[i],En[i]);
		}
		return en;
    }
	public static void main(String args[]){  
		String s1="hello, this is al bhed translator \nplease put your text here ";  

		// System.out.println(s1);	
		System.out.println(alToEn(s1));
		System.out.println(enToAl(s1));
		
		Scanner in = new Scanner(System.in);
		String transText = in.nextLine();
		
		System.out.println(enToAl(transText));
	}
}  