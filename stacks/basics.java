import java.util.*;
public class basics {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();   
        st.push(3);
        st.push(4);
        st.push(2);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop();
          

    }
}
