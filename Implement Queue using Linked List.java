/*Implement a Queue using Linked List. 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop an element from the queue and print the poped element)
*/
/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/
class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode newnode=new QueueNode(a);
        if(front==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null){
            return -1;
        }
        int result=front.data;
        front=front.next;
        return result;
	}
}
