package view;

import controller.VetInverte;
public class Principal {

	public static void main(String[] args) {
	
		VetInverte inv= new VetInverte();
		
		int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
		int quantidade= vet.length-1;
		int indice=0;
		int[] resp= inv.Invertedor(vet, quantidade, indice);
		for( int numero: resp) {
		System.out.println(numero);
		}
	}}