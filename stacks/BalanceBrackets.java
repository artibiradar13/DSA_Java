import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets{
    public static boolean isBAlanced(String str){
    Stack<Character> st=new Stack<>();
    int n=str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
            st.push(ch);
            }
            else{    //')'
            if(st.isEmpty())return false;//if empty
            if(st.peek()=='(') st.pop();//matching 
            }
        }
        return st.isEmpty();
    }

    public static int removeBrackets(String str){
    Stack<Character> st=new Stack<>();
    int n=str.length();
    int remove=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            if(ch=='('){
            st.push(ch);
            }
            else{    //')'
            if(st.isEmpty()) remove++;//if empty
            if(st.peek()=='(') st.pop();//matching 
            }
        }
    remove+=st.size();
    return remove;
    }
 public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            // For closing brackets, check match
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;  // No opening bracket to match
                char top = st.pop();
                if (!isMatching(top, ch)) return false;
            }
        }
        return st.isEmpty(); // True if no unmatched opening brackets
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }


    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(str);
    //System.out.println(isBAlanced(str));
    //System.err.println("brackets removing: "+removeBrackets(str));
sc.close();
}
}
