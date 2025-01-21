package StackInteview;

public class CustomStack {

    private final int[] stack;
    private int top; // To track the top index of the stack

    public CustomStack(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
    }

    // operasi push/menambahkan data kedalam stack
    public int push(int value) {
        if (top == stack.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = value;
        return top + 1;
    }

    // operasi pop/mengambil data lalu menghapusnya dati stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    // operasi peek/mengambil data tapi datanya tidak di hapus
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    // ngecek kalo stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // ambil panjang dari stack
    public int length() {
        return top + 1;
    }


}
