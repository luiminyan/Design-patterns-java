import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CSVHandler extends DatenHandler{
    public CSVHandler(File datei) {
        super(datei);
    }

    @Override
    public boolean validiereDatentyp() {
        String dateiName = datei.getName();
        return dateiName.toLowerCase().endsWith(".csv");
    }

    @Override
    public Aktienkurs transformiereDaten() {
        try {
            FileReader fr = new FileReader(datei);
            // like a file reading pointer
            Scanner scanner = new Scanner(fr);

            // date formate
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Aktienkurs aktienkurs = new Aktienkurs();

            // skip the header
            String header = scanner.next();

            while (scanner.hasNext()) {
                String zeile = scanner.next();

                // empty line
                if (zeile.isEmpty()) {
                    continue;
                }
                
                // split the line
                String[] werte = zeile.split(",");
                String datumString = werte[0];
                // apply the givern format
                Date date = dateFormat.parse(datumString);
                float open = Float.parseFloat(werte[1]);
                float high = Float.parseFloat(werte[2]);
                float low = Float.parseFloat(werte[3]);
                float close = Float.parseFloat(werte[4]);

                Tageskurs tageskurs = new Tageskurs(date, open, high, low, close);
                aktienkurs.getTageskurs().add(tageskurs);
            }
            scanner.close();
            return aktienkurs;
            
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

}
