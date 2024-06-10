package lab6.problem1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Converter converter = new Converter();
            }
        });
    }
}
