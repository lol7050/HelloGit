package aula3003;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data {

	
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        String dataPorExtenso = getDataPorExtenso(dataHora);
        System.out.println(dataPorExtenso);
    }

    public static String getDataPorExtenso(LocalDateTime dataHora) {
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("EEEE, 'dia' dd 'de' MMMM 'de' yyyy 'e agora são' HH 'horas e' mm 'minutos.'", new Locale("pt", "BR"));
        String dataPorExtenso = dataHora.format(formatoDataHora);
        return "Hoje é " + dataPorExtenso;
    }
}
