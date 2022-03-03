class HexObserver extends Observer {    // 2. Concrete class of the "dependent" 
   public HexObserver( Subject s ) {    //    hierarchy
      subj = s;  subj.attach( this ); } // 4. Observers register themselves
   public void update() {
      System.out.print( "  " + Integer.toHexString( subj.getState() ) );
}  }                                    // 6. Observers "pull" information 
