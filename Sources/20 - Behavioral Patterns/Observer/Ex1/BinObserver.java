class BinObserver extends Observer {
   public BinObserver( Subject s ) {
      subj = s;  subj.attach( this ); } // 4. Observers register themselves
   public void update() {
      System.out.print( "  " + Integer.toBinaryString( subj.getState() ) );
}  }                                    // 6. Observers "pull" information 
