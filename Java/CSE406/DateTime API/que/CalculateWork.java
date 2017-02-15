import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class CalculateWork extends JFrame {
  private JTextField tfWork, tfDate, tfMonth, tfYear;
  private JButton calculateButton;
  private JLabel lblResult;
  public CalculateWork() {
    Container cp = getContentPane();
    cp.setLayout(new GridLayout(7,2));

    add(new JLabel("Total Work: "));
    tfWork = new JTextField(20);
    add(tfWork);

    add(new JLabel("START Date:"));
    add(new JLabel("------"));
    tfDate = new JTextField(20);
    add(new JLabel("Date: "));
    add(tfDate);
    add(new JLabel("Month: "));
    tfMonth = new JTextField(20);
    add(tfMonth);
    add(new JLabel("Year: "));
    tfYear = new JTextField(20);
    add(tfYear);

    add(new JLabel(""));

    calculateButton = new JButton("calculate");
    add(calculateButton);

    lblResult = new JLabel();
    add(lblResult);

    calculateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        int work = Integer.parseInt(tfWork.getText().trim());
        int date = Integer.parseInt(tfDate.getText().trim());
        int month = Integer.parseInt(tfMonth.getText().trim());
        int year = Integer.parseInt(tfYear.getText().trim());

        try{
            lblResult.setText(calculate(work, LocalDate.of(year, month, date)));
        }catch(Exception e){
          System.out.println(e);
        }
      }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Student Details");
    setSize(500,300);
    setVisible(true);
  }


  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new CalculateWork();
      }
    });
  }

  static String calculate(int totaltfWork, LocalDate starttfDate) {
    LocalDate nowtfDate = LocalDate.now();
    String result = "";

    float _totalDaysToDotfWork = ((float)totaltfWork/7);
    int totalDaysToDotfWork = 0;
    if( (_totalDaysToDotfWork - (int)_totalDaysToDotfWork) != 0)
      totalDaysToDotfWork = (int)_totalDaysToDotfWork + 1;
    else
      totalDaysToDotfWork = (int)_totalDaysToDotfWork;

    int daysTillToday = (int)starttfDate.until(nowtfDate, DAYS);

    if(daysTillToday > totalDaysToDotfWork)
      result += "100% of work is completed.";
    else {
      result += (daysTillToday*100/totalDaysToDotfWork) + "% of tfWork is completed.\n";
      result += "\nExpected date to complete work is " + starttfDate.plusDays(totalDaysToDotfWork);
    }
  return result;
  }
}
