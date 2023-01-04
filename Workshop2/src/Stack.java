public class Stack {
    private int idx;
    private char[] arr;

    // constructor w/ arr size
    public Stack(int size) {
        arr = new char[size];
    }

    // Push
    public void pushChar(char c) {
        arr[idx++] = c;
    }

    // Pop
    public char popChar() {
        return arr[--idx];
    }
}
