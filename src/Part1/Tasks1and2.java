package Part1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tasks1and2 {
    public static void main(String args[]) throws ParseException {
        // Написать программу для вывода на консоль названия дня недели по введенной дате.
        System.out.print("Введите дату: ");
        Scanner date = new Scanner(System.in);
        String userDate = date.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dayWeek =  format.parse(userDate);

        System.out.println("День недели для выбранной даты " + new SimpleDateFormat("EEEE").format(dayWeek));
        date.close();

        System.out.println();

// Написать программу для вывода на экран дату следующего вторника
        int dayOfWeek = 3;
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        int days = (Calendar.SATURDAY - weekday + dayOfWeek) % 7;
        now.add(Calendar.DAY_OF_YEAR, days);
        Date date1 = now.getTime();
        String dateStr = new SimpleDateFormat("dd.MM.yyyy").format(date1);
        System.out.println("Дата следующего вторника: " + dateStr);


    }

}

