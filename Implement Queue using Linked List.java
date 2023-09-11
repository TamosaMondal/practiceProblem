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
