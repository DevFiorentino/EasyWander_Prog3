public class PrinterSpooler {
private static PrinterSpooler instance;
private PrinterSpooler() {
}
public static PrinterSpooler getInstance() {
if ( instance==null) {
instance = new PrinterSpooler();
}
return instance;
}
public void print (String msg) {
System.out.println( msg );
}
}
