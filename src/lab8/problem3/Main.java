package lab8.problem3;

public class Main {
    public static void main(String[] args) {
        BrowserHistoryNavigation browserHistoryNavigation = new BrowserHistoryNavigation("home");
        browserHistoryNavigation.visit("page1");
        browserHistoryNavigation.visit("page2");
        browserHistoryNavigation.back();
        browserHistoryNavigation.back();
        browserHistoryNavigation.forward();
        browserHistoryNavigation.forward();
        browserHistoryNavigation.visit("page3");
    }
}
