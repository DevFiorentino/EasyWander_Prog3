public abstract class Handler
{
	protected Handler ©;
	public void setSuccessor(Handler successor)
	{
		m_successor = successor;
	}

public abstract void handleRequest(Request request);
}
