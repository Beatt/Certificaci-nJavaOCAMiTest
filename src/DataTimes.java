import static org.junit.Assert.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.junit.Ignore;
import org.junit.Test;


public class DataTimes {
	
	
	/**
	 * 
	 * Las clases date y time son inmutables de la misma
	 * 	maneara que la clase String...
	 * 
	 * Java es demasiado listo para esconderte los minutos, segundos y nanosegundos
	 * 	si no los estás utilizando.
	 * 
	 * Para trabajar con periodos solo se permite el las clases Date y DateTime
	 * 	La clase time no soporta trabajar con periodos.
	 * 
	 * Los métodos staticos dentro de las clases date, time, dateTime, period
	 * 	no ejecutan cada uno de los métodos anidados estos solo se permiten
	 * 	para métodos no-staticos
	 * 
	 * Ejemplo
	 * 	
		LocalDate date3 = LocalDate.of(2010, Month.APRIL, 20)
				.minusMonths(1)
				.minusYears(1)
				.minusWeeks(1);
	
		Si queremos trabajar con estos métodos staticos 
			el compilador nos enviara un warnning pero aún así compilara pero
			solo se ejecutara el último método.
		
	 * 
	 */
	
	
	@Test	
	@Ignore
	public void create() {
		
//		System.out.println(LocalDate.now());
//		System.out.println(LocalTime.now());
		
		// Cuando convierte DateTime a String utiliza la T
		// para separar el date del time
//		System.out.println(LocalDateTime.now());
		
		
		LocalDate date1 = LocalDate.of(2010, Month.MARCH, 4);
		//assertEquals("2010-03-04", date1);
		
		LocalDate date2 = LocalDate.of(2010, 3, 4);
		
		
		LocalTime time1 = LocalTime.of(2, 30);
		
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
//		System.out.println(dateTime1);
		
		
		LocalDate date3 = LocalDate.of(2010, Month.APRIL, 20)
				.minusMonths(1)
				.minusYears(1)
				.minusWeeks(1);
		
		System.err.println(date3);
				
		
	}
	
	@Ignore
	@Test	
	public void manipulatingDate() {
		
		LocalDate date1 = LocalDate.now();
		System.out.println("Original " + date1);
		
		// agregar dias
		date1 = date1.plusDays(2);
		System.out.println("Agregar d " + date1);
		
		// agregar mes
		date1 = date1.plusMonths(2);
		System.out.println("Agregar m " +date1);
		
		// agregar semanas
		date1 = date1.plusWeeks(3);
		System.out.println("Agregar s " + date1);
		
		// agregar años
		date1 = date1.plusYears(1);
		System.out.println("Agregar a " + date1);
		
		// menos dias
		date1 = date1.minusDays(2);
		System.out.println("Menos d " + date1);
		
		date1 = date1.minusMonths(2);
		System.out.println("Menos m " + date1);
		
		// menos semanas
		date1 = date1.minusWeeks(3);
		System.out.println("Menos s " + date1);
		
		// menos año
		date1 = date1.minusYears(1);
		System.out.println("Menos a " + date1);
		
		
	}
	
	@Test
	@Ignore
	public void periods() {
		
		// Cinco formas de crear periodos
		/*
		 	
			Period.ofWeeks(weeks)
			Period.ofDays(days)
			Period.ofMonths(months)
			Period.ofYears(years)
			Period.of(years, months, days)			
		 	
		 * Permite agregar o extraer dia, mes y año de una clase
		 * Date o DateTime
		 *
		 */
		
		
		LocalDate date1 = LocalDate.of(2000, Month.DECEMBER, 2);
		System.out.println(date1);
		
		Period period1 = Period.ofMonths(1);
		System.out.println(date1.plus(period1));
		
		@SuppressWarnings("static-access")
		Period period2 = Period.ofMonths(10).ofYears(10);
		System.out.println(period2);
		
		//LocalTime time1 = LocalTime.of(1, 30);
		//time1.plus(period1);
		
		
	}

	@Test
	@Ignore
	public void formattingDateTime() {
		
		LocalDate date1 = LocalDate.of(2000, Month.APRIL, 20);
		LocalTime time1 = LocalTime.of(20, 30);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		
		// el día de la semana
		System.out.println(dateTime1.getDayOfWeek());
		
		// el día del mes al que pertenece
		System.out.println(dateTime1.getDayOfMonth());
		
		// el día del año al cual pertenece
		System.out.println(dateTime1.getDayOfYear());
		
		// obtiene el mes (January, FEBRUARY, etc)
		System.out.println(dateTime1.getMonth());
		
		// a que año pertenece
		System.out.println(dateTime1.getYear());
		
		System.out.println(date1.format(DateTimeFormatter.ISO_DATE));
		System.out.println(time1.format(DateTimeFormatter.ISO_TIME));
		System.out.println(dateTime1.format(DateTimeFormatter.ISO_TIME));
		System.out.println(dateTime1.format(DateTimeFormatter.ISO_DATE));
		System.out.println(dateTime1.format(DateTimeFormatter.ISO_DATE_TIME));
		
		// LocalizedDate permite trabajar tanto con DateTime y Date, menos time
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dateTimeFormatter.format(dateTime1));
		System.out.println(dateTimeFormatter.format(date1));
		
		// Utilizando el objeto date y el método format, el cual recibe un objeto
		// de tipo DateTimeFormatter
		System.out.println(date1.format(dateTimeFormatter));
		System.out.println(dateTime1.format(dateTimeFormatter));
		
		// Mandara una excepción ya que estamos dandole formato a la fecha y por ende
		// no se permite en time
		//System.out.println(dateTimeFormatter.format(time1));
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(dateTimeFormatter.format(time1));
		System.out.println(dateTimeFormatter.format(dateTime1));
		
		System.out.println(time1.format(dateTimeFormatter));
		System.out.println(dateTime1.format(dateTimeFormatter));
		
		
		// Permite solo trabajar con DateTime
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(dateTimeFormatter.format(dateTime1));
		System.out.println(dateTime1.format(dateTimeFormatter));
		
		// Mandara una excepción ya que solo permite trabajar objetos dateTime
//		System.out.println(dateTimeFormatter.format(time1));
//		System.out.println(dateTimeFormatter.format(date1));
		
		
		
		
	}

	@Test
	@Ignore
	public void predefinedFormats() {
		
		LocalDateTime dateTime = LocalDateTime.of(
				LocalDate.of(2000, Month.AUGUST, 2), 
				LocalTime.of(2, 10)
		);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M, YY, h:m");
		System.out.println(dateTimeFormatter.format(dateTime));
		
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM, YYYY, hh:mm");
		System.out.println(dateTimeFormatter2.format(dateTime));
		
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("MMMM, YYYY, hh:m");
		System.out.println(dateTimeFormatter3.format(dateTime));
		
		DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("MMMM, YYYY, hh:mm");
		System.out.println(dateTimeFormatter4.format(dateTime));
		
		
	}
	
	@Test
	public void parseDateAndTime() {
		
		
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM dd yyyy");		
		
		LocalDate date = LocalDate.parse("01 10 2001", dateTimeFormatter);
		System.out.println(date);
		
		LocalTime time = LocalTime.parse("01:20");
		System.out.println(time);
		
		
	}
	
}
