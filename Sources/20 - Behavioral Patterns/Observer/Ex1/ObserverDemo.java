public class ObserverDemo {
   public static void main( String[] args ) {
      Subject sub = new Subject();
      // 7. Client configures the number and type of Observers
      new HexObserver( sub );  new OctObserver( sub );  new BinObserver( sub );
      while (true) {
         System.out.print( "\nEnter a number: " );
         sub.setState( Read.anInt() );
}  }  }
