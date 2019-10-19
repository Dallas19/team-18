import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// The LogPage defines the data structure of our logs. Ideally should be connected to the database.
public class LogPage {
    ArrayList<logLine> content;

    // initializes the arraylist
    public LogPage() {
        this.content = new ArrayList<logLine>();
    }
    
    static class logLine {
        String date;
        String Category;

        public logLine(String Category){

            DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            date = dtf.format(LocalDateTime.now());
            this.Category = Category; 
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


