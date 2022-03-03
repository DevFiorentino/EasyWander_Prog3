class OctObserver extends Observer {
   public OctObserver( Subject s ) {
      subj = s;  subj.attach( this ); } // 4. Observers register themselves
   public void update() {
      System.out.print( "  " + Integer.toOctalString( subj.getState() ) );
}  }                                    // 6. Observers "pull" information 
