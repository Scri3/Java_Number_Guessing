package number.guessing;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class NumberGuessing {

    public static void main(String[] args) {
        
        int o = 0;

        JFrame f1 = new JFrame();
        
        String name = null;

        while (o < 1) {

            name = JOptionPane.showInputDialog(null, "Please enter your name: ", "Welcome! ", JOptionPane.INFORMATION_MESSAGE);
            o++;

            try {
                int tempInt = Integer.valueOf(name);
                o = 0;
                JOptionPane.showMessageDialog(f1, "Enter a valid character! ");
            } catch (NumberFormatException e) {

            }
        }
        int input = JOptionPane.showConfirmDialog(null, "Dear " + name + " ! Guess a number from 10 to 20 and keep it in mind. ", "Take a guess! ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        switch (input) {
            case 0:
                int OE = JOptionPane.showConfirmDialog(null, "Is the number Even? ", "Odd or Even ", JOptionPane.YES_NO_OPTION);
                if (OE == 0) {
                    int above15 = JOptionPane.showConfirmDialog(null, "Is it above 15? ", "Above 15? ", JOptionPane.YES_NO_OPTION);
                    if (above15 == 0) {
                        int multipleOf4 = JOptionPane.showConfirmDialog(null, "Is it a multiple of 4? ", "", JOptionPane.YES_NO_OPTION);
                        if (multipleOf4 == 0) {
                            int multipleOf10 = JOptionPane.showConfirmDialog(null, "Is it a multiple of 10? ", "", JOptionPane.YES_NO_OPTION);
                            if (multipleOf10 == 0) {
                                JOptionPane.showMessageDialog(null, "The guessed number is 20 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(null, "The guessed number is 16 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The guessed number is 18 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        int multipleOf4 = JOptionPane.showConfirmDialog(null, "Is it a multiple of 4? ", "", JOptionPane.YES_NO_OPTION);
                        if (multipleOf4 == 0) {
                            JOptionPane.showMessageDialog(null, "The guessed number is 12 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);

                        } else {

                            int multipleOf10 = JOptionPane.showConfirmDialog(null, "Is it a multiple of 10? ", "", JOptionPane.YES_NO_OPTION);
                            if (multipleOf10 == 0) {
                                JOptionPane.showMessageDialog(null, "The guessed number is 10 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(null, "The guessed number is 14 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);
                            }

                        }
                    }
                } else {
                    int PNumber = JOptionPane.showConfirmDialog(null, "Is it a Primary number? ", "Primary number? ", JOptionPane.YES_NO_OPTION);
                    if (PNumber == 0) {
                        int above16 = JOptionPane.showConfirmDialog(null, "Is it above 16? ", "Above 16? ", JOptionPane.YES_NO_OPTION);
                        if (above16 == 0) {
                            int SOD8 = JOptionPane.showConfirmDialog(null, "Is sum of the digits equal to 8? ", "Sum of digits ", JOptionPane.YES_NO_OPTION);
                            if (SOD8 == 0) {
                                JOptionPane.showMessageDialog(null, "The guessed number is 17 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);

                            } 
                            else {
                                JOptionPane.showMessageDialog(null, "The guessed number is 19 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);
                            
                            }
                        }
                        else{
                            int SOD2 = JOptionPane.showConfirmDialog(null, "Is sum of the digits equal to 2? ", "Sum of digits ", JOptionPane.YES_NO_OPTION);
                            if (SOD2 == 0) {
                                JOptionPane.showMessageDialog(null, "The guessed number is 11 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);

                            } 
                            else {
                                JOptionPane.showMessageDialog(null, "The guessed number is 13 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);
                            }
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "The guessed number is 15 ! ", "Found it! ", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                break;

            case 1:
                exit();
                break;
            default:
                exit();
                break;
        }

    }

    private static void exit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
