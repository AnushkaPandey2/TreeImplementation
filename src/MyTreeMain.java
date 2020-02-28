//wap to create a binary search tree while traversing an existing tree in inorder

import java.util.Scanner;

public class MyTreeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyTree obj = new MyTree();
        System.out.println("enter your choice");
        while (true) {
            System.out.println("1:insert\n2:search\n3:pre order traversal\n4:post order traversal\n5:In order traversal\n6:exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter data that you want to insert");
                    int data = sc.nextInt();
                    obj.insert(data);
                    break;
                case 2:
                    System.out.println("enter data that you want to search");
                    int d = sc.nextInt();
                    boolean response = obj.search(d);
                    System.out.println(response);
                    break;
                case 3:
                    obj.traversePreOrder(obj.getRoot());
                    break;
                case 4:
                    obj.traversePostOrder(obj.getRoot());
                    break;
                case 5:
                    obj.traverseInOrder(obj.getRoot());
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("you entered wrong choice");
                    break;
            }
        }
    }
}
