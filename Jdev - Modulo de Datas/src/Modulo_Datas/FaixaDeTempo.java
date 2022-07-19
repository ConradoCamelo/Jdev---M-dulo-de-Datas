package Modulo_Datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaDeTempo {

	public static void main(String[] args) {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1989-12-18"), LocalDate.now());
		
		System.out.println("Possui " + dias + " dias entre a faixa da Data.");
		
		long decadas = ChronoUnit.DECADES.between(LocalDate.parse("2000-07-01"), LocalDate.now());
		
		System.out.println("Possui " + decadas + " Décadas entre a faixa da Data.");
		
		
		
	}

}
