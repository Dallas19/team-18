import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class LogPage {

    public LogPage() {
        ArrayList<logLine> content = new ArrayList<logLine>();
    }

    public static class logLine {
        Date date;
        String Category;

        public logLine(String Category){

            DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            logLine.date = dtf.format(LocalDateTime.now());
            logLine.Category = Category; // might be a problem
        }
    }

    // adds log line with current time
    public addLogLine(String Category) {
        LogPage.content.add(new logLine(Category));
    }
}
