package clases;

public class recursividad {

	public int Multiplicar(int n1, int n2) { // 1
		if ( n2 == 1 ) return n1;
		return n1 + Multiplicar(n1, n2 - 1);
	}
	
	public int Factorial( int n ) { //2
		if (  n == 1 ) return 1;
		return n * Factorial(n - 1);
	}
	
	public int vectormenor(int x [],int n,int menor){ // sacar el vector menor //3
	if(n ==0)
		if(menor > x [n])return x [0];
		else return menor;
	else 
	    if(menor > x [n])return vectormenor(x, n-1, x[n]);
	    else return vectormenor (x,n-1,menor);
	}
	
	public int MCD(int x, int y) {//maximo comun divisor //4
		if(x%y==0)return y;
		else
			return MCD(y, x % y);
	}
	public int multiplicarvector(int vector [],int n) {//multiplicar vector //5
		if (n==0)
			return (vector[0]);
		return (vector [n]* multiplicarvector(vector,n-1));
	}
	
	public int sumadedigitos(int n) { //suma de numeros en una cifra //6
		if(n==0)return n;
		else
			return sumadedigitos(n / 10) + (n % 10);
	}
	public int invertirnumero(int n) { //invertir numero 567-765 //7
		if(n < 10)return n;
		else
			return(n % 10)+ invertirnumero(n / 10)* 10;
	}
	public int suma(int n) { // desde 1 hasta n numeros // 8
		if(n==1)return 1;
		else
			return n +suma(n-1);
	}
	public int cantidadnumeros(int n) { //cantidad de numeros de una cifra //9
		if(n <= 0)return 0;
		else
			return 1 + cantidadnumeros(n / 10);
	}
	public int fibonaci(int n) { // calcular un numero de la serie fibonacci //10
		if(n==1 || n==2) return 1;
		else
			return fibonaci(n-1)+ fibonaci(n-2);
	}
	
	public int resta(int a, int b) { //division de restas sucesivas //11
		if(b > a)return 0;
		else 
			return resta(a-b,b) + 1;
	}
	
	
	public int Potencia( int base, int exponente ) { // 12
		if ( exponente == 1 ) return base;
		return base * Potencia(base, exponente - 1);
	}
	
	public int matriz(int f,int c , int o , int matriz [][]) { //suma de los elementos de una matriz //13
		if(f==0 && c==0)return matriz [0][0];
		else
			if(c < 0)return matriz(f -1,o,o,matriz);
			else
				return matriz[f][c] + matriz(f,c-1,o,matriz);
	}

	
	public static void main(String[] args) {
		recursividad recursividad = new recursividad();
	
		System.out.println( recursividad.MCD(30,15));
	
	
	}
	 	 
}
	 
	 
	
	
	
