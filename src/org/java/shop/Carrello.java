package org.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		Prodotto[] cart = new Prodotto[10];
		double totalPrice = 0;
		double savedMoney = 0;
		
		String name = null; 
		String brand = null; 
		double price = 0; 
		float iva = 0;
		int index = 0;
		
		
		
		
		System.out.println("Scegli il prodotto: Televisore(1) - Smartphone(2) - Cuffie(3) | Qualsiasi altro numero per il checkout");
		int productType = sc.nextInt();
		
		
		while(productType <= 3 && productType > 0) {

			
			// Dettagli prodotto
			System.out.print("Nome: ");
			name = sc.next();

			System.out.print("Marca: ");
			brand = sc.next();
			
			System.out.print("Prezzo: ");
			price = sc.nextDouble();
			
			System.out.print("Iva: ");
			iva = sc.nextInt();
			
			
			if (productType == 1)  {
				// Dettagli Televisore	
				System.out.print("Dimensioni: ");
				int dimensions = sc.nextInt();
			
				System.out.print("E' una smart Tv (si o no): ");
				String isSmart = sc.next();
				
				// Creo il prodotto
				Televisore tv = new Televisore(name, brand, price, iva, dimensions, (isSmart.toLowerCase().equals("si") ? true : false));
				System.out.println(tv);
				
				// Pusho il prodotto nel carrello
				cart[index] = tv;		
			}
			
			if(productType == 2){
				// Dettagli Smartphone
				System.out.print("Memoria interna: ");
				int memory = sc.nextInt();
			
				System.out.print("Codice IMEI: ");
				String imei = sc.next();
				
				Smartphone phone = new Smartphone(name, brand, price, iva, imei, memory);
				
				System.out.println(phone);
				cart[index] = phone;

			}
			if(productType == 3) {
				// Dettagli Cuffie
				System.out.print("Colore: ");
				String color = sc.next();
			
				System.out.print("Wireless(1) o Cablato(2)?: ");
				int isWireless = sc.nextInt();
				
				Cuffie cuffie = new Cuffie(name, brand, price, iva, color, (isWireless == 1 ? true : false));
			
				System.out.println(cuffie);
				cart[index] = cuffie;

			}
			
			System.out.println("Scegli il prodotto: Televisore(1) - Smartphone(2) - Cuffie(3) | Qualsiasi altro numero per il checkout");
			productType = sc.nextInt();
			index++;
			
		}

		
		// Se il carrello è vuoto lo faccio presente al cliente
		if(cart[0] == null){
			
			System.out.println("Non hai prodotti nel carrello");
		}else {
			// Chiedo se ha una carta fedeltà 
			System.out.println("Hai una carta fedeltà? (si / no)");
			String fidelityCard = sc.next();
			
			// se non ce l'ha calcolo il prezzo intero altrimenti con lo sconto 
			if(fidelityCard.toLowerCase().equals("no")) {

				// altrimenti calcolo il saldo e mostro i prodotti 
				System.out.println("\n Resoconto carrello: \n");
				for(int i = 0; i < cart.length; i++) {

					if(cart[i] != null) {
						
						System.out.println(cart[i]);
						totalPrice += cart[i].getTotalPrice();
					}else {

						break;
					}
				}
				System.out.println("\n Prezzo finale: " + String.format("%.02f", totalPrice) + "$");

			}else {
				
				System.out.println("\n Resoconto carrello: \n");
				
				for(int i = 0; i < cart.length; i++) {
				
					if(cart[i] != null) {
						
						System.out.println(cart[i]);
						totalPrice += cart[i].discountedPrice() + (cart[i].getTotalPrice() - cart[i].getPrice());
						savedMoney += (cart[i].getPrice() - cart[i].discountedPrice());
					}else {
						break;
					}
				}
				System.out.println("\n Prezzo finale: " + String.format("%.02f", totalPrice)+ "$");
				System.out.println("Hai risparmiato: " + String.format("%.02f", savedMoney) + "$ !!");

			}
			
		}
	}
}
