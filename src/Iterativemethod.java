//public class Iterativemethod {
  //  public void Iterativemethod(){
        //Base case
        id(head == null|| head.null==next){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode !=null){
            Node newNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=newNode;
        }
        head.next=null;
        head=prevNode;
    }
}
}
