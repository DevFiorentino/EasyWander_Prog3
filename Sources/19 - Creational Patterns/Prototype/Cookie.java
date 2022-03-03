/** Prototype Class **/
 public class Cookie implements Clonable {
   
    public Object clone()
    {
        try{
            Cookie copy = (Cookie)super.clone();
//In an actual implementation of this pattern you might now change references to
//the expensive to produce parts from the copies that are held inside the prototype.

            return copy;
        }
        catch(CloneNotSupportedException e)
        {
           e.printStackTrace();
           return null;
        }
    }
 }
