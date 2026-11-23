import java.util.Stack;
public class stack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int top = st.peek();
        int remove = st.pop();
        boolean empty = st.isEmpty();
        int size = st.size();

        System.out.println(top);
        System.out.println(remove);
        System.out.println(empty);
        System.out.println(size);
        System.out.println(st);


    }
}


