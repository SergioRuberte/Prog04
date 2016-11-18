import java.util.*;
public class Cifrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase;
		int n, num;
		char c;
		do{
			System.out.println("Introduce una frase: (máx. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		frase=frase.toUpperCase();
		do{
			System.out.println("Escribe un numero entre 1 y 10:");
			n=teclado.nextInt();
		}while(n<1 || n>10);
		
		for(int i=0; i<frase.length();i++){
			num=frase.charAt(i)+n;
			c=(char) num;
			System.out.print(c);
		}

	}

}
