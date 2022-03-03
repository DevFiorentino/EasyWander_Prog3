public class RandomWalker {
private int currentMilestone;
private int lastWalkedDistance;
private RandomWalker randomWalker;
public RandomWalker() {
randomWalker = this;
}
public void randomWalk() {
lastWalkedDistance = (int) ( Math.random() * 100 );
currentMilestone = currentMilestone + lastWalkedDistance;
}
public int getCurrentMilestone() {
return currentMilestone;
}
public int getLastWalkedDistance() {
return lastWalkedDistance;
}
public Memento createMemento( ) {
return new WalkerMemento( );
}

class WalkerMemento implements Memento{
private int mem_currentMilestone;
private int mem_lastWalkedDistance;
public WalkerMemento() {
mem_currentMilestone = currentMilestone;
mem_lastWalkedDistance = lastWalkedDistance;
}
public void restoreState() {
currentMilestone = mem_currentMilestone;
lastWalkedDistance = mem_lastWalkedDistance;
}
} //End of class WalkerMemento
}

