import java.io.*;
import java.util.*;

public class Solution 
{
    QueueCharacter> qe=new LinkedList<>();
    StackCharacter> st=new Stack<>();
    void pushCharacter(char c){
        st.push(c);
    }
    void enqueueCharacter(char c){
        qe.add(c);
    }
    char popCharacter(){
        return st.pop();
    }
    char dequeueCharacter(){
        return qe.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        char[] s = input.toCharArray();
        Solution p = new Solution();
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
