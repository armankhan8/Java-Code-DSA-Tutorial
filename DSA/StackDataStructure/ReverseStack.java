package DSA.StackDataStructure;

import java.util.Stack;

public class ReverseStack {
    public static void PushBottom(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        PushBottom(data, st);
        st.push(top);
    }

    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        Reverse(st);
        PushBottom(top, st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        Reverse(st);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
