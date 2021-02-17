package dataStructures.stack;

public class BalancedBracketSequence {
    public static void check(String s) {
        StackList<Integer> stack = new StackList<Integer>();
        char a;
        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            switch (a) {
                case '(':
                    stack.push(1);
                    break;
                case '[':
                    stack.push(2);
                    break;
                case '{':
                    stack.push(3);
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek() == 1) { stack.pop(); }
                    else { f = false; }
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek() == 2) { stack.pop(); }
                    else { f = false; }
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek() == 3) { stack.pop(); }
                    else { f = false; }
                    break;
            }
            if (!f) break;
        }

        if (f && stack.isEmpty())
            System.out.println("The sequence is correct!");
        else
            System.out.println("Error");
    }

    public static void main(String[] args) {
        check("((frfe),k )");
        check("[(){()}]");
        check(")))}]])((((((");
    }
}
