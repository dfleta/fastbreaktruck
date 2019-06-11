package org.lasencinas.fastbreaktruck.fastbreaktruck;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.FastBreakTruck;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Desayuno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		// SpringApplication.run(FastBreakTruck.class, args);

		/**
		 * Desayuno Eyeholes
		 */
		
		Desayuno holeDes = FastBreakTruck.prepararEyeHoles();
		System.out.println("No abras la caja de Eyeholes!");
		holeDes.mostrarItems();
		System.out.println("Precio pedido: " + holeDes.getCoste());

		/**
		 * Desayuno Smiggles
		 */
		
		Desayuno smigDes = FastBreakTruck.prepareSmiggles();
		System.out.println("\nSmiggles per als nins!");
		smigDes.mostrarItems();
		System.out.println("Precio pedido: " + smigDes.getCoste());

		/**
		 * Plumbus
		 */

		smigDes = FastBreakTruck.prepareSmiggles();
		System.out.println("\nSmiggles con plumbus!");
		smigDes.mostrarItems();
		System.out.println("Precio pedido: " + smigDes.getCoste());
	}
}
