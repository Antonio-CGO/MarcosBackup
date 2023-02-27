import java.util.Calendar;

public class Atualdatahora {

	public static void main(String[] args) {
		dataehoraexata();
	}

	public static void dataehoraexata() {
		Calendar c = Calendar.getInstance();
		System.out.println(" Data e hora atual: "+ c.getTime());
	}

}
