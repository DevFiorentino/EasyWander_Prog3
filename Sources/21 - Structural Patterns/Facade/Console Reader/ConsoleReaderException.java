public class ConsoleReaderException extends RuntimeException {
public ConsoleReaderException( Exception e ) {
super( e.toString() );
}
}