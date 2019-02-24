package Overveiwer;

import javax.swing.*;
import java.awt.*;

public class OrderViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());

        //ползунок горизонтальной прокрутки
        JSlider headingSlider = new JSlider(0, 360, 180);
        pane.add(headingSlider, BorderLayout.SOUTH);

        //ползунок вертикальной прокрутки
        JSlider pitchSlider = new JSlider(SwingConstants.VERTICAL, -90, 90, 0);
        pane.add(pitchSlider, BorderLayout.EAST);

        //панель отображения результата рендеринга
        JPanel renderPanel = new JPanel(){
            public void painComponenet(Graphics g){
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.BLACK);
                g2.fillRect(0, 0, getWidth(), getHeight());
                // рендеринг происходит здесь
            }
        };
        pane.add(renderPanel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
