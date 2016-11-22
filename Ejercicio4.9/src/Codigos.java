import java.util.*;
public class Codigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String codigo = "", cod2 = "",fechas="1990/1991/1992/1993/1994/1995";
		String sexo="HM",curso="12",sub1,sub2,sub3, cod_totales="";
		int error=0;
		
		do{
			System.out.println("Introduce un código. (00000000 para parar)");
			System.out.println("Formato del codigo AAAA entre 1990-1995, despues H o M y por ultimo 1 o 2 y dos caracteres cualesquiera");
			//cada vez que volvemos a iniciar el bucle inicializamos error a 0 para que no cuente los errores de codigos anteriores
			error=0;
			do{
				cod2=teclado.nextLine();
				//si el codigo no es de la longitud deseada se muestra el mensaje y nos pide que lo insertemos de nuevo
				if(cod2.length()!=8){
					System.out.println("Longitud del codigo erronea, introduce uno nuevo");					
				}
			}while(cod2.length()!=8);
			//calculamos que los tres primeros caracteres del codigo sean 199 y en caso de que no sea asi sumamos uno al contador error
			sub1=cod2.substring(0, 4);
			sub2=cod2.substring(4,5);
			sub3=cod2.substring(5,6);
			// fecha correcta
			if (fechas.indexOf(sub1)==-1){
				error++;
			}
			//sexo correcto
			if (sexo.indexOf(sub2)==-1){
				error++;
			}
			//calculamos que el sexto caractaer sea 1 o 2 y en caso de que no sea asi sumamos uno al contador error
			if (curso.indexOf(sub3)==-1){
				error++;
			}
			//cuando no se encuentre ningun error en el codigo entramos al if
			if(error==0){
				cod_totales=cod_totales+cod2+"  ";
			}
			//si ponemos el codigo de salida del programa no queremos que nos muestre que es codigo erroneo
			if(!cod2.equals("00000000")){
				//si encuentra algun error nos muestra el mensaja siguiente
				if(error!=0){
					System.out.println("Codigo erroneo, vuelve a introducir uno nuevo");
				}
			}
			//se repite el bucle hasta que introducimos 000000
		}while(!cod2.equals("00000000"));
		System.out.println("Los códigos introducidos son: "+cod_totales);
	}

}
