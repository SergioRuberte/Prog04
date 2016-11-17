import java.util.*;
public class LeerCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String frase, s2;
		int leng;
		do{
			System.out.println("Introduce una frase: (máx. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
	
		leng=frase.length();
		for (int i=0; i<=leng; i++){
			s2=frase.substring(0,i);
			System.out.println(s2);
		}
	}

}
