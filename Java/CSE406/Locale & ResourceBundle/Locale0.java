import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

class Locale0 extends JFrame{
  private JComboBox cbCountry;
  private JLabel lbTime;

  String[] countryNames = new String[160];;
  Locale[] availableLocales;

  public Locale0(){
    availableLocales = Calendar.getAvailableLocales();

    Container cp = getContentPane();
    cp.setLayout(new GridLayout(10,2));

    int i = 0;
    for (Locale l : availableLocales) {
      countryNames[i++] = l.getDisplayName();
    }

    add(new JLabel("Select Country: "));
    cbCountry = new JComboBox(countryNames);
    add(cbCountry);
    add(new JLabel("Time:  "));
    lbTime = new JLabel();
    add(lbTime);

    cbCountry.addActionListener (new ActionListener () {
      public void actionPerformed(ActionEvent e) {
        try{
          int selectedCountry = cbCountry.getSelectedIndex();
          LocalDateTime now = LocalDateTime.now();
          DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(availableLocales[selectedCountry]);

          lbTime.setText(String.valueOf(now.format(df)));
        }catch(Exception ex){
          System.out.println(ex);
        }
      }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Get Time");
    setSize(200,300);
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new Locale0();
      }
    });
  }
}
