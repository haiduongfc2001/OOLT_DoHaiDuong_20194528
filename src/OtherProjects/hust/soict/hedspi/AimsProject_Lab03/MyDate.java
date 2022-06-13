package OtherProjects.hust.soict.hedspi.AimsProject_Lab03;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Locale;

public class MyDate {

	private int day, month, year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("Fail!.");
            System.exit(0);
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Fail!");
            System.exit(0);
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate() {
        Calendar cal = Calendar.getInstance();
        day = cal.get(Calendar.DAY_OF_MONTH);
        month = cal.get(Calendar.MONTH) + 1;
        year = cal.get(Calendar.YEAR);
    }

    public MyDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Fail!");
            System.exit(0);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(s.replaceAll("st ", " ").replaceAll("nd ", " ")
                .replaceAll("rd ", " ").replaceAll("th ", " "), formatter);
        day = date.getDayOfMonth();
        month = date.getMonthValue();
        year = date.getYear();
    }

    public void print() {
        System.out.printf("Today is %d/%d/%d.\n", day, month, year);
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MyDate date = new MyDate(s);
        day = date.getDay();
        month = date.getMonth();
        year = date.getYear();
    }
}
