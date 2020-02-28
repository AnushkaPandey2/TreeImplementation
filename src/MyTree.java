//binary search tree method
public class MyTree {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            Node parent = null;
            while (temp != null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }

            }
            if (node.getData() <= parent.getData()) {
                parent.setLeft(node);
            } else {
                parent.getRight();
            }
        }
    }

    public boolean search(int data) {
        boolean response = false;
        Node temp = root;
        while (temp != null) {
            if (temp.getData() == data) {
                response = true;
                break;
            } else {
                if (data <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return response;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData());
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.print(node.getData() + ",");
            traverseInOrder(node.getRight());
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            // System.out.println(node.getRight());
            traversePostOrder(node.getRight());
            System.out.println(node.getData());

        }
    }
}
