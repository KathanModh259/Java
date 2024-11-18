import java.util.ArrayList;

class MyStack {
    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
        System.out.println(o + " pushed onto the stack.");
    }
}

public class PR1 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Stack size: " + stack.getSize());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop (peek): " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty());
        System.out.println("\nThis Practical is made by 23CS032-Kathan Kanabar");
    }
}
