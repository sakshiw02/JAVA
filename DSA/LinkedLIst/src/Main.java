import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList();
		l1.display();
		l1.insert(20);
		l1.insert(77);
		l1.insert(50);
		l1.insert(90);
		l1.insert(40);
		l1.insert(80);

		l1.display();
		l1.insertByPos(23, 4);
		l1.display();

	}

}
