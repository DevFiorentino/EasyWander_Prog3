public class Client 
{
	public static void main( String arg[] ) 
	{
		Factory creator = new ConcreteFactory();
		creator.doSomething();
	}
}
