package controller;

public class VetInverte {

	public VetInverte() {
		super();}
	
	public int[] Invertedor(int[] Vet,int tamanho, int i) {
		if( i > (tamanho/2) ) {
			return Vet;
		}
		else {
			int aux= Vet[i];
			Vet[i]= Vet[tamanho-i];
			Vet[tamanho-i]= aux;
			
			return Invertedor(Vet, tamanho, i+1);
		
		}
		
	}}