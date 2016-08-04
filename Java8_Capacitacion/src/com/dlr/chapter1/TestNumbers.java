package com.dlr.chapter1;

public class TestNumbers {

	public static void main(String [] args) {
		int a = 20;
		int b = 8;
		
		TestNumbers tn = new TestNumbers();
		
		int mcd = tn.mcd(a, b);
		
		System.out.println("el mcd entre " + a + " y " + b + " es " + mcd);
		
		System.out.println(5.0/3.0);
		System.out.println(false^false); // operación xor: es verdadero sólo si uno de los dos valores es verdadero
		
		int n = 2147483647;
		System.out.println("¿" + n + " es primo? " + (tn.esPrimo(n)?"SI":"NO"));
	}
	
	/**
	 * Método que calcula el máximo común divisor entre los números a y b
	 * @param a
	 * @param b
	 * @return
	 */
	public int mcd(int a, int b) {
		System.out.println("mcd(" + a + ", "+ b + ")");
		if(b == 0) return a;
		int r = a % b;
		return mcd(b, r);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public boolean esPrimo(int n) {
		boolean esPrimo = true;
		if(n < 2) {
			return false;
		}
		long i;
		for(i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				System.out.println(n + " es divisible por " + i);
				return false;
			}
		}
		System.out.println(i*i);
		return esPrimo;
	}
}
