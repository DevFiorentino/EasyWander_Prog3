class Subject {                                     // 1. The "independent" abs
   private Observer[] observers = new Observer[9];  // 3. Coupled to base class
   private int        totalObs  = 0;
   private int        state;
   public void attach( Observer o ) { observers[totalObs++] = o; } // 3. Coupled
   public int  getState()           { return state; }
   public void setState( int in ) {
      state = in;
      notifyObservers(); }
   private void notifyObservers() {
      for (int i=0; i < totalObs; i++)
         observers[i].update();         // 3. Coupled to base class
}  }                                    // 5. Broadcast events to observers
