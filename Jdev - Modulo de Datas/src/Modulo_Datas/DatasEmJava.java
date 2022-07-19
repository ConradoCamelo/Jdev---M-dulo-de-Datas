package Modulo_Datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println("Data em Milisegundos: " +date.getTime());
		
		System.out.println("Dia do Mês: " + date.getDate());
		
		System.out.println("Dia da Semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minuto da hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano: " + date.getYear());
		
		//------------------Simple Date Format --------------------------
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data Atual em Formato Padrão e String: " + simpleDateFormat.format(date));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
