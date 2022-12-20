package list;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListMethod list = new ListMethod();
		int val;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("-----List Menu-----");
			System.out.println("1.insert");
			System.out.println("2.display the list");
			System.out.println("3.insert the specified position");
			System.out.println("4.delete the specified position");
			System.out.println("5.exit");
			System.out.println("---------------------");
			int choice = input.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter the value");
				val = input.nextInt();
				list.add(val);
				break;
			}
			case 2: {
				list.display();
				break;
			}
			case 3: {
				System.out.println("Enter the value");
				val=input.nextInt();
				System.out.println("Enter the position");
				int position=input.nextInt();
				list.insertPosition(position, val);
				break;
			}
			case 4:{
				System.out.println("Enter the position");
				val=input.nextInt();
				list.deletePos(val);
				break;
			}

			}
		}

	}

}
