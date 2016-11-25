import java.util.*;
public class NoRemplazaSi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String frase;
		frase=teclado.nextLine();
		frase=frase.replaceAll("si", "no");
		System.out.println(frase);
	}

}
