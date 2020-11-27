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
        for(int j=1;j<i;j++)
        {
            temp=temp.next;
        }
        return temp;
    }




}
