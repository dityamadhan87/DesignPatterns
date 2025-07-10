package MementoPattern;

import java.util.Stack;

public class CaretakerStack {
    private Stack<Memento> stack = new Stack<>();

    public void saveState(Memento memento) {
        stack.push(memento);
    }

    public Memento undo() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
