import java.util.*;
public class PalabraEnFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, palabra;
		int leng, out;
		do{
			System.out.println("Introduce una frase: (m�x. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		System.out.println("Introduce una palabra para buscarla en la frase");
		palabra=teclado.nextLine();
		 out=frase.indexOf(palabra);
		 if (out>-1){
			 System.out.println("La posici�n de la palabra es: "+out);
		 }else if(out==-1){
			 System.out.println("0");
		 }
	}

}
