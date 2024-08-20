import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        LocalDate onlyDate = LocalDate.now();
        System.out.println(onlyDate);
        LocalTime onlyTime = LocalTime.now();
        System.out.println(onlyTime);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM y G H:m");
        String text = dateTime.format(formatter);
        System.out.println(text);

        LocalDateTime ldtParsed = LocalDateTime.parse(text, formatter);
        System.out.println(ldtParsed);

        var data = new Date(1985, 1, 1);
    }
}