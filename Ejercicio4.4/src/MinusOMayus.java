import java.util.*;
public class MinusOMayus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, palabra;
		int leng, op;
		do{
			System.out.println("Introduce una frase: (m�x. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		do{
		System.out.println("----ELIGE UNA OPCI�N----");
		System.out.println("1.-Transformar la frase a may�sculas.");
		System.out.println("2.-Transformar la frase a min�sculas.");
		op=teclado.nextInt();
		}while(op!=1 && op!=2);
		switch(op){
		case 1:
			frase=frase.toUpperCase();
			System.out.println("Frase en may�sculas: " +frase);
			break;
		case 2:
			frase=frase.toLowerCase();
			System.out.println("Frase en min�sculas: " +frase);
			break;
		
		}
	}

}
