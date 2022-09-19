//Написать реализацию очереди на основе массива; Реализовать методы size(), empty(), offer(), poll(), peek()

public class Task_2_Queue<T> {
    private T[] array;
    private int index,tempIndex;

    public Task_2_Queue(int length) {
        this.index = 0;
        this.tempIndex=0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
         return this.index;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void offer(T value) {
        try {
            this.array[index++] = value;
        } catch (Exception e) {
            System.out.println("Error! Queue is overflow!");
        }
    }

    public T peek() {
        if (!this.empty()) {
            return this.array[tempIndex];
        } else {
            System.out.println("Error! Queue is empty!");
            return null;
        }
    }

    public T poll() {
        if (!this.empty()) {
            this.index--;
            return this.array[tempIndex++];
        } else {
            System.out.println("Error! Queue is empty!");
            return null;
        }
    }

    public static void main(String[] args) {
        Task_2_Queue<String> queue = new Task_2_Queue<>(4);
        queue.offer("String 1");
        queue.offer("String 9");
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.poll());
    }
}