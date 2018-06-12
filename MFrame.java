import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MFrame extends JFrame {
    Container cp;
    //    private JPanel jpn =new JPanel();
    private JButton jbtn = new JButton("Run");
    private JButton jbtn2 = new JButton("EXIT");
    private JLabel jlb1 = new JLabel();
    private JLabel jlb2 = new JLabel();
    private JTextField jtf = new JTextField();


    public MFrame() {
        Ex1();
    }

    private void Ex1() {
        this.setBounds(300, 300, 400, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new GridLayout(2, 2, 3, 3));
        cp.add(jtf);
        cp.add(jbtn);
        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jbtn2);


        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int data[] = new int[5];
                try {
                float v1 = Float.parseFloat(jtf.getText());
                float v2 = v1 * 0.6214f;
                jlb1.setText(Float.toString(v2));
                for (int i = 0 ; i<=5 ; i++) {
                }

                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MFrame.this,"錯誤");
                }
            }
        });


        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
