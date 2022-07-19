package Modulo_Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelasMensais {

	public static void main(String[] args) throws ParseException {
		
		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("19/07/2022");//Data inicial que vai gerar os boletos 
				
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);
		
		for(int parcela = 1; parcela<=12; parcela++) {
			System.out.println("Parcela número: " + parcela + " vencimento é em: " 
		+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
		}
		
				
	}

}
