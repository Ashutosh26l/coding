import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  

class PicPuzzle2 extends JFrame implements ActionListener {  
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, sample, starB;  
    Icon star;  

    Icon ic0 = new ImageIcon("pic/starB0.jpg");  
    Icon ic10 = new ImageIcon("pic/starB10.jpg");  
    Icon ic20 = new ImageIcon("pic/starB20.jpg");  

    Icon samicon1 = new ImageIcon("pic/main.jpg");  
    Icon samicon2 = new ImageIcon("pic/main2.jpg");  
    Icon samicon3 = new ImageIcon("pic/main3.jpg");  

    Icon[] icons1 = {
        new ImageIcon("pic/1.jpg"),
        new ImageIcon("pic/5.jpg"),
        new ImageIcon("pic/2.jpg"),
        new ImageIcon("pic/7.jpg"),
        new ImageIcon("pic/4.jpg"),
        new ImageIcon("pic/6.jpg"),
        new ImageIcon("pic/8.jpg"),
        new ImageIcon("pic/9.jpg"),
        new ImageIcon("pic/3.jpg")
    };

    Icon[] icons2 = {
        new ImageIcon("pic/12.jpg"),
        new ImageIcon("pic/13.jpg"),
        new ImageIcon("pic/16.jpg"),
        new ImageIcon("pic/11.jpg"),
        new ImageIcon("pic/14.jpg"),
        new ImageIcon("pic/19.jpg"),
        new ImageIcon("pic/17.jpg"),
        new ImageIcon("pic/15.jpg"),
        new ImageIcon("pic/18.jpg")
    };

    Icon[] icons3 = {
        new ImageIcon("pic/24.jpg"),
        new ImageIcon("pic/25.jpg"),
        new ImageIcon("pic/21.jpg"),
        new ImageIcon("pic/27.jpg"),
        new ImageIcon("pic/23.jpg"),
        new ImageIcon("pic/29.jpg"),
        new ImageIcon("pic/28.jpg"),
        new ImageIcon("pic/22.jpg"),
        new ImageIcon("pic/26.jpg")
    };

    PicPuzzle2() {  
        super("Pic Puzzle");  
        
        // Initialize buttons and set bounds
        b1 = new JButton(icons1[0]);
        b2 = new JButton(icons1[1]);
        b3 = new JButton(icons1[2]);
        b4 = new JButton(icons1[3]);
        b5 = new JButton(icons1[4]);
        b6 = new JButton(icons1[5]);
        b7 = new JButton(icons1[6]);
        b8 = new JButton(icons1[7]);
        b9 = new JButton(icons1[8]);

        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
        int x = 10, y = 80;

        // Setting bounds dynamically
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(x, y, 100, 100);
            if ((i + 1) % 3 == 0) {
                y += 100;
                x = 10;
            } else {
                x += 100;
            }
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        // Sample and star button
        sample = new JButton(samicon1);  
        sample.setBounds(380, 100, 200, 200);  
        sample.addActionListener(this);
        add(sample);  

        starB = new JButton(ic0);  
        starB.setBounds(330, 5, 50, 50);  
        star = b9.getIcon(); // Assume the empty tile is the last one by default
        add(starB);  

        // Labels  
        JLabel l1 = new JLabel("Sample:");  
        l1.setBounds(330, 200, 70, 20);  
        add(l1);  

        JLabel l2 = new JLabel("NOTE: Icon has power to swap with neighbouring icons");  
        l2.setBounds(5, 15, 500, 20);  
        add(l2);  

        JLabel l3 = new JLabel("Click the sample picture for the next puzzle");  
        l3.setBounds(380, 320, 200, 20);  
        l3.setForeground(Color.red);  
        add(l3);  

        // JFrame settings  
        setLayout(null);  
        setSize(600, 500);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  

    private void swapIcons(JButton b1, JButton b2) {
        Icon temp = b1.getIcon();
        b1.setIcon(b2.getIcon());
        b2.setIcon(temp);
    }

    public void actionPerformed(ActionEvent e) {  
        JButton source = (JButton) e.getSource();  
        
        if (source == sample) {
            Icon currentIcon = sample.getIcon();
            if (currentIcon == samicon3) {
                sample.setIcon(samicon1);
                setIcons(icons1);
                star = b9.getIcon();
                starB.setIcon(ic0);
            } else if (currentIcon == samicon1) {
                sample.setIcon(samicon2);
                setIcons(icons2);
                star = b6.getIcon();
                starB.setIcon(ic10);
            } else {
                sample.setIcon(samicon3);
                setIcons(icons3);
                star = b6.getIcon();
                starB.setIcon(ic20);
            }
        } else {
            // Handle swapping logic for the 9 buttons
            handleSwap(source);
        }
    }

    private void setIcons(Icon[] icons) {
        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setIcon(icons[i]);
        }
    }

    private void handleSwap(JButton btn) {
        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
        int index = -1;

        for (int i = 0; i < buttons.length; i++) {
            if (btn == buttons[i]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Define possible adjacent indices for the current button
            int[][] adjacents = {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4, 6}, {1, 3, 5, 7}, {2, 4, 8}, {3, 7}, {4, 6, 8}, {5, 7}};
            for (int adj : adjacents[index]) {
                if (buttons[adj].getIcon() == star) {
                    swapIcons(buttons[adj], buttons[index]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {  
        new PicPuzzle2();  
    }  
}
