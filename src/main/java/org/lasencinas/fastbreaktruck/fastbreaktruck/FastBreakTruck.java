package org.lasencinas.fastbreaktruck.fastbreaktruck;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Pedido;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Desayuno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FastBreakTruck {

	public static void main(String[] args) {
		// SpringApplication.run(FastBreakTruck.class, args);

		Pedido orden = new Pedido();

		Desayuno holeDes = orden.prepararEyeHoles();
		System.out.println("No abras la caja de Eyeholes!");
		holeDes.mostrarItems();
		System.out.println("Precio pedido: " + holeDes.getCoste());
		
		Desayuno smigDes = orden.prepareSmiggles();
		System.out.println("\nSmiggles per als nins!");
		smigDes.mostrarItems();
		System.out.println("Precio pedido: " + smigDes.getCoste());
	}

}
