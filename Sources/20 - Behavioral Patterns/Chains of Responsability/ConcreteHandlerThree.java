public class ConcreteHandlerThree extends Handler
{
     public void handleRequest(Request request)
	{
		if (request.getValue() == 0)
		{   //if request is eligible handle it System.out.println(”Zero values are handled by ConcreteHandlerThree:");

System.out.println("\t ConcreteHandlerThree.HandleRequest : " + request.getDescription() + request.getValue());
		}
		else
		{
			m_successor.handleRequest(request);
		}
	}
 }
