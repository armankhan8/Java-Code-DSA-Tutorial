package DSA.StackDataStructure.UsingArrayList;

import java.util.ArrayList;

public class AllOperation {
    static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.peek());

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
    
}
