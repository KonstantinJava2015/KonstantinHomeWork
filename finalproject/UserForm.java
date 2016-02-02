package finalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 02.02.2016.
 */
public class UserForm extends JFrame{
    public static void main(String[] args) {
        new UserForm();
    }

    private JPanel mainPanel = new JPanel();
    private JPanel innerPanel = new JPanel();
    private JButton actionButton = new JButton("GETTING MIN AND MAX VALUES");
    private JTextArea programScreen = new JTextArea();
    private JLabel aValueLabel = new JLabel("Firs value of the segment");
    private JLabel bValueLabel = new JLabel("Last value of the segment");
    private JTextField aValueText = new JTextField();
    private JTextField bValueText = new JTextField();

    public UserForm(){
        super();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        final int frameWidth = toolkit.getScreenSize().width / 2;
        final int frameHeight = toolkit.getScreenSize().height / 2;

        setSize(frameWidth, frameHeight);
        setLocation(frameWidth / 2, frameHeight / 2);

        setLayout(new BorderLayout());

        add(mainPanel, BorderLayout.CENTER);
        add(actionButton, BorderLayout.SOUTH);
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(innerPanel, BorderLayout.CENTER);
        innerPanel.setLayout(new BorderLayout());

        innerPanel.add(programScreen, BorderLayout.CENTER);

        add(aValueLabel, BorderLayout.NORTH);
        mainPanel.add(aValueText, BorderLayout.NORTH);

        innerPanel.add(bValueLabel, BorderLayout.SOUTH);
        mainPanel.add(bValueText, BorderLayout.SOUTH);
        programScreen.setEditable(false);

        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dichotomia dichotomia = new Dichotomia();

                try {
                    double segmentBeginning = Double.parseDouble(UserForm.this.getFirstValue());
                    if(segmentBeginning < 0){
                        throw new finalproject.NegativeNumberException(segmentBeginning);
                    }
                    dichotomia.setSegmentBeginning(segmentBeginning);

                    double segmentEnding = Double.parseDouble(UserForm.this.getLastValue());
                    if (segmentEnding < 0){
                        throw new finalproject.NegativeNumberException(segmentEnding);
                    }
                    dichotomia.setSegmentEnding(segmentEnding);
                    UserForm.this.addingInfoToProgramScreen(dichotomia.getAnswer());
                  //  break;
                }catch (finalproject.NegativeNumberException ex1){
                    UserForm.this.addingInfoToProgramScreen(ex1.getMessage());
                }
                catch (NumberFormatException ex1){
                    UserForm.this.addingInfoToProgramScreen("You have to type numbers only! Try again!");

                }catch (Exception ex1){
                    UserForm.this.addingInfoToProgramScreen("RUUUUUUUN!!");
                    return;
                }


            }
        });

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void addingInfoToProgramScreen(String string){
        programScreen.append(string + "\n");
    }

    public String getFirstValue(){
        return aValueText.getText();
    }

    public String getLastValue(){
        return bValueText.getText();
    }
}
