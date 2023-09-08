/*Given a linked list of N nodes. The task is to reverse this list.
*/
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node dummy=null;
        while(head!=null){
            Node nextNode=head.next;
            head.next=dummy;
            dummy=head;
            head=nextNode;
        }
        return dummy;
    }
}
