import java.awt.dnd.InvalidDnDOperationException;

public class AktariciFactory {
     private static final String CSV  = "csv";
     private static final String EXCEL = "excel";

     public IAktarici nesneYarat(String format){
         if(format == CSV){
             return new CsvAktarici();
         } else if (format == EXCEL) {
             return new ExcelAktarici();
         }
         else
             throw new InvalidDnDOperationException(format + " formatı desteklenmiyor");
     }
}
