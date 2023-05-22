package se.kth.iv1350.utility;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LogHandler {
    private static final String LOG_FILE_NAME = "ERROR";
    private PrintWriter logfile;

    public LogHandler () throws IOException{
        logfile = new PrintWriter(new FileWriter(LOG_FILE_NAME) , true );

        }
        public void LogException (Exception excp){
        StringBuilder message = new StringBuilder();
            logfile.append(currentTime());
            logfile.append(" Exception has been thrown " );
            logfile.append(excp.getMessage());
            logfile.print(message);
            excp.printStackTrace(logfile);

    }
    private String currentTime (){
        StringBuilder builder = new StringBuilder();
        LocalDateTime present = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        return present.format(format);
    }
}
