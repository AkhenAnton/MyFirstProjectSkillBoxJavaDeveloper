// Hometask 1.6 - Console application Russia time format

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HometaskOneSixConsoleAppRussiaTime {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
