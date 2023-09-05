/*Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.
*/
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node notun=new Node(key);
         if(head1.data>=key){
             notun.next=head1;
             head1=notun;
             return head1;
         }
         Node cur=head1;
         while(cur.next!=null){
             if(cur.data<=key && cur.next.data>=key){
                 notun.next=cur.next;
                 cur.next=notun;
                 break;
             }
             cur=cur.next;
         }
         if(cur.next==null){
             cur.next=notun;
             notun.next=null;
         }
         return head1;
    }
}
