package javademos;

public class switchDemo {

	public static void main(String[] args) {
		char grade='C';
		
		switch (grade) {
		case 'A':  System.out.println("Süper. Geçtiniz");	break;			
		case 'B': 
		case 'C':  System.out.println("İyi. Geçtiniz");	break;
		case 'D':  System.out.println("Fena Değil. Geçtiniz");	break;
		case 'F':  System.out.println("Maalesef kaldınız");	break;
		
		default: System.out.println("geçersiz not");
		}

	}

}
