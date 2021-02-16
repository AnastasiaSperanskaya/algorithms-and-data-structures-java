package dataStructures.stack;

public class BalancedBracketSequence {
    public static void check(String s) {
        StackList<Integer> stack = new StackList<Integer>();
        char a;
        int k;
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
                    if (stack.isEmpty()) {
                        f = false;
                        break;
                    }
                    k = stack.peek();
                    stack.pop();
                    if (k != 1) f = false;
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        f = false;
                        break;
                    }
                    k = stack.peek();
                    stack.pop();
                    if (k != 2) f = false;
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        f = false;
                        break;
                    }
                    k = stack.peek();
                    stack.pop();
                    if (k != 3) f = false;
                    break;
            }
            if (!f) break;
        }

        if (f && stack.isEmpty())
            System.out.println("OK");
        else
            System.out.println("Error");
    }

    public static void main(String[] args) {
        check("((frfe),k )");
    }
}
