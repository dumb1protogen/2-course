public class MinStackImpl implements MinStack<Integer> {
    private Node head;

    @Override
    public void push(Integer value) {
        if (head == null) {// if empty just pushing
            head = new Node(value, value, null);
        } else {// Else check if it minimal
            int currentMin = Math.min(value, head.minValue);
            head = new Node(value, currentMin, head);
        }
    }

    @Override
    public Integer pop() {
        int value = head.currentValue;
        head = head.nextNode; //Push head back, Viva La Revolution (sorry)
        return value;
    }

    @Override
    public Integer top() {
        return head.currentValue; //Just saying who first
    }

    @Override
    public Integer min() {
        return head.minValue; //Just saying who lowest
    }
}
// Нет проверки на null, если посылают коректные команды, не значит что не могуть послать ничего
//All of this is O(n), we check our Stack for all those operatons one time of N where N is amount of numbers in our Stack