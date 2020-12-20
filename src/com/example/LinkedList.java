package com.example;

class LinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void reOrder()
    {
        reOrder(head);
    }

    private void reOrder(Node head)
        {
            int high=size(head)-1;
            Node temp=head;
            Node temp2=temp.next;
            for(int i=0;i<size(head)/2;i++)
            {
                Node prev=getNodeAt(head,high);
                Node last=prev.next;
                prev.next=null;
                temp.next=last;
                last.next=temp2;
                temp=temp2;
                temp2=temp2.next;



            }
        }
    private   void printList()
    {
        printList(head);
    }

    public  void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public int size(Node head)
    {
        int c=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
    public Node getNodeAt(Node head,int i)
    {
        Node temp=head;
        for(int j=0;j<i;j++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void quickSort()

    {
        quickSort(head);
        printList(head);
    }
      void quickSort(Node node)
    {

        sort(node,0,size(node)-1);
    }
    public  void sort(Node h,int lo,int hi)
    {
        if(lo>=hi)
        {
            return ;
        }
        int mid=(lo+hi)/2;
        Node pivot=getNodeAt(h,mid);
        int left=lo,right=hi;

        while(left<=right)
        {
            // int ll=getNodeAt(h,left).data;
            //            // int rr=getNodeAt(h,right).data;
            while(getNodeAt(h,left).data<pivot.data)
            {
                left++;
                // ll=getNodeAt(h,left).data;
            }
            while(getNodeAt(h,right).data>pivot.data)
            {
                right--;
                // rr=getNodeAt(h,right).data;
            }
            if(left<=right)
            {
                int temp=getNodeAt(h,left).data;
                getNodeAt(h,left).data=getNodeAt(h,right).data;
                getNodeAt(h,right).data=temp;
                left++;
                right--;
            }
        }
        sort(h,lo,right);
        sort(h,left,hi);
    }
//    public static int size(Node h)
//    {
//        int c=0;
//        while(h!=null)
//        {
//            c++;
//            h=h.next;
//
//        }
//        return c;
//    }
//    public static Node getNodeAt(Node h,int i)
//    {
//        for(int j=0;j<i;j++)
//        {
//            h=h.next;
//        }
//        return h;
//    }





}
