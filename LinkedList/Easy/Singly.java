class Singly{
    Node head;
    class Node{
        Node next;
        int data;
        Node(int d){
            next=null;
            data=d;
        }
    }
    
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void insertAt(int data, int pos){
        Node newNode=new Node(data);
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node curr=head;
        for(int i=0;i<pos-1&&curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            throw new IndexOutOfBoundsException("Position out of bound");
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }

    public void deletefirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null||head.next==null){
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
    public void deleteAt(int pos){
        if(head==null){
            return;
        }
        if(pos==0){
            head=head.next;
            return;
        }
        Node curr=head;
        for(int i=0;i<pos-1&&curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null||curr.next==null){
            throw new IndexOutOfBoundsException("Position out of bound");
        }
        curr.next=curr.next.next;
    }

    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public int count(){
        if(head==null){
            return 0;
        }
        int c=0;
        Node curr=head;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        return c;
    }
    public boolean search(int x){
        Node curr=head;
        while(curr!=null){
            if(curr.data==x){
               return true;
            }
            curr=curr.next;
        }
        return false;
    }
    public static void main(String args[]){
        Singly list=new Singly();
        list.addfirst(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(6);
        list.insertAt(5, 4);
        list.printLL();
        System.out.println(list.count());
        System.out.println(list.search(1)?"exists":"not found");
    }
}
