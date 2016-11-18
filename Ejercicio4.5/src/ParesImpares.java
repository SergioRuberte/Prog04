import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, palabra, pares="", impares="";
		int leng, op, cont=0; //Inicializamos cont a 0 para que empiece en el 1er caracter
		do{
			System.out.println("Introduce una frase: (máx. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		while(cont<frase.length()){
			impares=impares+frase.charAt(cont);
			cont=cont+2;
		}
		for (cont=1;cont<frase.length();){
			pares=pares+frase.charAt(cont);
			cont=cont+2;
		}
		
		System.out.println("Caracteres impares: "+impares);
		System.out.println("Caracteres pares: "+pares);
	}

}
