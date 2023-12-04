public class MyStack<E> {
    private final int size;

    private int current_index;

    private final E stack[];
    public MyStack(int size) {
        this.size = size;
        this.current_index = 0;
        stack = (E[]) new Object[size];
    }

    void push(E data){
        if (current_index > size){
            System.out.println("Stack is full!");
            return;
        }
        System.out.println(data + " is pushed");
        stack[current_index++] = data;
    }

    E pop(){
        if (current_index <= 0 || current_index > size){
            return null;
        }
        return stack[--current_index];
    }


}
