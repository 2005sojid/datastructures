
public class Main {
    public static void main(String[] args) {
        System.out.println("<--------------------------------------------------->");
        System.out.println("Stack");
        MyStack<Integer> int_stack = new MyStack<>(5);
        for (int i = 0; i < 5; i++) {
            int_stack.push(i+1);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(int_stack.pop() + " is popped");
        }

        System.out.println();
        // String stack, reverse a string
        MyStack<String> string_stack = new MyStack<>(4);
        string_stack.push("A");
        string_stack.push("m");
        string_stack.push("i");
        string_stack.push("r");
        String reversed = "";
        for (int i = 0; i < 4; i++) {
            reversed += string_stack.pop();
        }
        System.out.println();
        System.out.println(reversed);

        System.out.println("<--------------------------------------------------->");
        System.out.println("Linked List");
        System.out.println();
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>(new MyNodeForLinkedList<>(1));
        integerMyLinkedList.insertAtEnd(4);
        integerMyLinkedList.insertAtEnd(7);
        integerMyLinkedList.insertAtEnd(10);
        integerMyLinkedList.printLinkedList();
    }
}
