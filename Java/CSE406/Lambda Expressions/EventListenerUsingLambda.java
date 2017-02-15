
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ItemListenerFrame extends JFrame
{
  JLabel lblData;
  JButton btn;

  int i = 0;

  ItemListenerFrame()
  {
    setLayout(new FlowLayout());

    btn = new JButton("Hello");
    btn.addActionListener((e) -> {
      btn.setText(String.valueOf(i++));
    });

    add(btn);
  }
}


class EventListenerUsingLambda {
  public static void main(String[] args) {
      ItemListenerFrame frame= new ItemListenerFrame();
      frame.setTitle("ItemListener Demo");
      frame.setBounds(100,100,100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(true);
      frame.setVisible(true);
  }
}
