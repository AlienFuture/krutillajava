package csapat3.krutillazs.beadando.Utils;

import javax.swing.*;
import java.awt.*;

public class Window {
    public static void close(Component c) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(c);
        frame.dispose();
    }
}