import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class GuessNumber{
        private JFrame frame;
	    private JLabel titleLabel;
	    private JLabel promptLabel;
	    private JTextField guessField;
	    private JButton submitButton;
	    private int targetNumber;
	    private int attempts;
	    private final int maxAttempts = 7;
	    private int score;

	 public GuessNumber() {
	        frame = new JFrame("Number Guessing Game");
	        frame.getContentPane().setBackground(Color.BLACK);

	        titleLabel = new JLabel("Welcome to the Number Guessing Game..");
	        titleLabel.setFont(new Font("Serif", Font.BOLD, 26));
	        titleLabel.setForeground(new Color(0, 102, 204));

	        promptLabel = new JLabel("Enter your guess (1 to 100):");
	        promptLabel.setFont(new Font("Serif", Font.PLAIN, 24));

	        guessField = new JTextField(10);
	        guessField.setFont(new Font("Serif", Font.PLAIN, 30));

	        submitButton = new JButton("Submit");
	        submitButton.setFont(new Font("Serif", Font.BOLD, 28));
	        submitButton.setBackground(new Color(0, 102, 204));
	        submitButton.setForeground(Color.WHITE);
	        submitButton.setFocusPainted(false);

	        targetNumber = generateRandomNumber();
	        attempts = 0;
	        score = 0;

	        submitButton.addActionListener(new ActionListener() 
	        {
	            @Override
	    public void actionPerformed(ActionEvent e) 
	            {
	                processGuess();
	            }
	        }
	      );

	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(4, 1));
	        panel.setBackground(Color.BLACK);
	        panel.add(titleLabel);
	        panel.add(promptLabel);
	        panel.add(guessField);
	        panel.add(submitButton);

	        frame.add(panel);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }

	    private int generateRandomNumber() 
	    {
	        return new Random().nextInt(100) + 1;
	    }

	    private void processGuess()
	    {
	        int userGuess;
	        try 
	        {
	            userGuess = Integer.parseInt(guessField.getText());
	        } catch (NumberFormatException ex) {
	            showMessage("Please enter a valid number.");
	            return;
	        }
	        attempts++;

	        if (userGuess == targetNumber) {
	            showMessage("Congratulations! You guessed the correct number.");
	            score++;
	            resetGame();
	        } else if (attempts < maxAttempts) {
	            String message = (userGuess < targetNumber) ? "Too low! Try a higher number." : "Too high! Try a lower number.";
	            showMessage(message);
	        } else {
	            showMessage("Sorry! You've used all your attempts. The correct number was " + targetNumber);
	            showScore();
	        }

	        guessField.setText("");
	    }

	    private void showMessage(String message) 
	    {
	        UIManager.put("OptionPane.minimumSize", new Dimension(300, 150));
	        UIManager.put("OptionPane.messageFont", new Font("Serif", Font.PLAIN, 26));
	        JOptionPane.showMessageDialog(frame, message);
	    }

	    private void showScore() 
	    {
	        showMessage("Your final score is: " + score);
	        int option = JOptionPane.showConfirmDialog(frame, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
	        if (option == JOptionPane.YES_OPTION) {
	            resetGame();
	        } else {
	            frame.dispose();
	        }
	    }

	    private void resetGame() 
	    {
	        targetNumber = generateRandomNumber();
	        attempts = 0;
	        guessField.setText("");
	    }

	    public static void main(String[] args)
	    {
	        SwingUtilities.invokeLater(new Runnable() 
	        {
	            @Override
	            public void run() {
	                new GuessNumber();
	            }
	        }
	        );
	     }
}

