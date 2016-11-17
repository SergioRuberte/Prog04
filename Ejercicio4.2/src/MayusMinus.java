import java.util.*;
public class MayusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String frase, s2;
		int contmayus=0, contminus=0;
		int leng;
		char c1;
		do{
			System.out.println("Introduce una frase: (máx. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		leng=frase.length();
		for (int i=0; i<leng; i++){
			c1=frase.charAt(i);
			if (c1<=90 && c1>=65 || c1=='Ñ'){
				contmayus++;//mayus
			}else if (c1<=122 && c1>=97 || c1=='ñ'){
				contminus++;//minus
			}
		}
		System.out.println(contmayus+" "+contminus);
	}

}
