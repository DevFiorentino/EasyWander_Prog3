public class PrinterSpoolerSynch {
private static PrinterSpooler instance;
private PrinterSpooler() {
}
public static synchronized PrinterSpooler getInstance() {
if ( instance==null) {
instance = new PrinterSpooler();
}
return instance;
}
public void print (String msg) {
System.out.println( msg );
}
}
