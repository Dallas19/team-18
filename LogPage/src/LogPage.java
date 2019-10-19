import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class LogPage {
    ArrayList<logLine> content;

    public LogPage() {
        this.content = new ArrayList<logLine>();
    }

    static class logLine {
        String date;
        String Category;

        public logLine(String Category){

            DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            date = dtf.format(LocalDateTime.now());
            this.Category = Category; // might be a problem
        }
    }

    // adds log line with current time
    public void addLogLine(String Category) {
        this.content.add(new logLine(Category));
    }

    /*
    public static void main (String[] args) {
        LogPage lp = new LogPage();
        lp.addLogLine("Poop");
        System.out.println(lp.content.get(0).date);
        System.out.println(lp.content.get(0).Category);
    }
    */
}


