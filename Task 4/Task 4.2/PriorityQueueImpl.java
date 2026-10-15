public class PriorityQueueImpl implements PriorityQueue<Integer> {



    private final Node[] heap = new Node[100001];
    private final int[] position = new int[100001]; //I feel very wrong doing this

    private int size = 0;
    private long nextOperation = 0;
    private long lastRemovedOperation = -1;

    public long getLastRemovedOperation() {
        return lastRemovedOperation;
    }

    @Override
    public void enqueue(Integer value) { //Puting in heap
        long operation = ++nextOperation;
        heap[++size] = new Node(value, operation);
        position[(int) operation] = size;
        siftUp(size);
    }

    @Override
    public Integer dequeueMax() {//Remobing from hip
        if (size == 0) {//Heap empty
            lastRemovedOperation = -1;
            return null;
        }
        Node max = heap[1];
        lastRemovedOperation = max.operation;
        position[(int) max.operation] = 0;
        if (size == 1) {//Heap was onky one
            heap[size--] = null;
            return max.value;
        }
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        position[(int) heap[1].operation] = 1;
        siftDown(1);
        return max.value;
    }

    @Override
    public void increment(long operation, Integer addition) {
        if (operation < 1 || operation > nextOperation) {
            return; //User wrote something wrong
        }

        int index = position[(int) operation]; //seacrh
        if (index == 0) { //empty, user inputed wrong or doesnt exist
            return;
        }
        heap[index].value += addition;
        if (index > 1 && heap[index].value > heap[index / 2].value) { //checking in
            siftUp(index);
        } else {
            siftDown(index);
        }
    }

    private void siftUp(int index) {//Keepinh heap in order. Up it
        while (index > 1) {
            int parent = index / 2;
            if (heap[parent].value >= heap[index].value) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    private void siftDown(int index) {//Keepinh heap in order. Down it
        //Kinda complicated I think. I swear I could done it easier
        while (true) {
            int left = index * 2;
            int right = left + 1;
            int largest = index;
            if (left <= size && heap[left].value > heap[largest].value) {
                largest = left;
            }
            if (right <= size && heap[right].value > heap[largest].value) {
                largest = right;
            }
            if (largest == index) {
                break;
            }
            swap(index, largest);
            index = largest;
        }
    }

    private void swap(int i, int j) {
        Node temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
        position[(int) heap[i].operation] = i;
        position[(int) heap[j].operation] = j;
    }
}