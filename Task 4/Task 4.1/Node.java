public class Node {
    int currentValue;
    int minValue;
    Node nextNode;

    public Node(int currentValue, int minValue, Node nextNode) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.nextNode = nextNode;
        //Basically passing by
    }
}

