import java.util.*;
public class RotaPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int l;
		String palabra, palabramay, trozo,letra,cambio;
		System.out.println("Escribe una palabra (máx 20 carácteres)");
		do{//Hacemos un bucle para que la palabra sea de máximo 20 caracteres.
			palabra= teclado.nextLine();
			l=palabra.length();
			if (l<1 || l>20)
				System.out.println("Máximo 20");
		}while (l<1 || l>20);
		for(int veces=0; veces<palabra.length(); veces++){
		palabramay = palabra.toUpperCase();
		trozo = palabramay.substring(0, l-1);//Cogemos todas las letras salvo la última.
		letra = palabramay.substring(l-1,l);//Cogemos la última letra
		cambio = letra.concat(trozo);//Añadimos la última letra delante de la palabra.
		System.out.println(cambio);
		palabra=cambio;//Convertimos en la palabra principal, la palabra cambiada.
		};

	}

}
