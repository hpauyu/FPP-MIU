package lab8.problem3;

import java.util.Stack;

public class BrowserHistoryNavigation {
    private final Stack<String> forward;
    private final Stack<String> backward;

    public BrowserHistoryNavigation(String url) {
        forward = new Stack<>();
        backward = new Stack<>();
        if (url != null)
            forward.push(url);
    }

    public void visit(String url) {
        if (url != null) {
            forward.push(url);
            System.out.println(STR."Visited: \{url}");
        }
    }

    public void back() {
        backward.push(forward.pop());
        System.out.println(STR."Back to: \{forward.peek()}");
    }

    public void forward() {
        forward.push(backward.pop());
        System.out.println(STR."Forward to: \{forward.peek()}");
    }
}
