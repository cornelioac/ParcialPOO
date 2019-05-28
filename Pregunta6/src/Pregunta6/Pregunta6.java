package Pregunta6;
import java.util.Scanner;
public class Pregunta6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de digitos");
        n=teclado.nextInt();
        int [] A= new int [n];
        System.out.println("Introduzca los numeros: ");
        for (int x=0; x < n; x++) {
            A[x] = teclado.nextInt();
            }
        int [] PROD=new int [n-3];
        int [] B= new int [4];
        for(int k=0;k<n-3;k++){
            PROD[k]=1;
        }
        for(int i=0;i<n-3;i++){
            for(int j=0;j<4;j++){
                PROD[i]*=A[j+i];
            }
        }
        int may, pos;
        may=PROD[0];
        pos=0;
        for(int g=0;g<n-3;g++){
            if(may<PROD[g]){
                may=PROD[g];
                pos=g;
            }
        }
        System.out.println("El producto mayor es: "+may);
        for(int k=0;k<4;k++){
            B[k]=A[k+pos];
        }
        System.out.print("B=[ ");
        for(int p=0;p<4;p++){
            System.out.print(B[p]+" ");
        }
        System.out.print("]");

 
	}

}
