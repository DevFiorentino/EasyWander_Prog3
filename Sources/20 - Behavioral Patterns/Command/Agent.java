import java.util.*;

// Invoker.
class Agent {
    //private ArrayList m_ordersQueue = new ArrayList();
    
    //private LinkedList m_ordersQueue = new LinkedList();
    
    Queue m_ordersQueue = new LinkedList();
    

    public Agent() {
    }
    
    void placeOrder(Order order) {
        m_ordersQueue.add(order);
	m_ordersQueue.remove();
        order.execute();
    }    
}