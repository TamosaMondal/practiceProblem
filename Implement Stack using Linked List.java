/*Let's give it a try! You have a linked list and you have to implement the functionalities push and pop of stack using this given linked list. Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 
*/
class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        StackNode temp=new StackNode(a);
        temp.next=top;
        top=temp;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code her
        if(top == null) return -1;
        StackNode temp=top;
        top=top.next;
        temp.next=null;
        return temp.data;
    }
}
