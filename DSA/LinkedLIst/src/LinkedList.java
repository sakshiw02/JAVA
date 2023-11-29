public class LinkedList{

	private Node head;
	public Node getHead() {
        return head;
    }

    public LinkedList() {
        head = null;
    }



	public boolean insert(int data) {
	
		Node newNode=new Node(data);
		if (head== null) {
		head=newNode;
		return true;
		}

		   Node last = head;
	        while(last.getNext()!= null) {
	            last = last.getNext();
	        }
		last.setNext(newNode);
		return true;
		
	}
	
	

	public void display(){
		//
		 Node last = head;
	        while(last!= null) {
	        	System.out.println(last.getData()+"    ");
	            last = last.getNext();
	        }

		System.out.println("");
	}

	
	boolean insertByPos(int data,int pos) {
        Node newNode = new Node(data);
        
        Node prev = null;
        for(int i=1;i<pos-1;i++) {
        	System.out.println("Hello ");
        	if(i==(pos-1)) {
        		prev=prev.getNext();
        		prev.setData(data);
        	}
        }
		return false;
	

		
		
		
	}
	}

