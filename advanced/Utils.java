import java.text.NumberFormat;
import java.util.Locale;


public class Utils {
	
	public static String formatarParaReais(double valor)
	{
		NumberFormat format = NumberFormat.getCurrencyInstance( new Locale("pt", "BR") );
		return format.format( valor );
	}

}
