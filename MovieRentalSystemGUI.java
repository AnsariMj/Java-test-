import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MovieRentalSystemGUI extends JFrame {

  private JTextField titleField, genreField, languageField, lengthField;

  public MovieRentalSystemGUI() {
    setTitle("Movie Rental System");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create components
    JLabel titleLabel = new JLabel("Title:");
    JLabel genreLabel = new JLabel("Genre:");
    JLabel languageLabel = new JLabel("Language:");
    JLabel lengthLabel = new JLabel("Length:");

    titleField = new JTextField(20);
    genreField = new JTextField(20);
    languageField = new JTextField(20);
    lengthField = new JTextField(20);

    JButton okButton = new JButton("OK");

    // Set layout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    gbc.gridx = 0;
    gbc.gridy = 0;
    add(titleLabel, gbc);

    gbc.gridx = 1;
    add(titleField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    add(genreLabel, gbc);

    gbc.gridx = 1;
    add(genreField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    add(languageLabel, gbc);

    gbc.gridx = 1;
    add(languageField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    add(lengthLabel, gbc);

    gbc.gridx = 1;
    add(lengthField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.gridwidth = 2;
    add(okButton, gbc);

    // Add action listener to the OK button
    okButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          insertData();
        }
      }
    );
  }

  private void insertData() {
    String title = titleField.getText();
    String genre = genreField.getText();
    String language = languageField.getText();
    int length = Integer.parseInt(lengthField.getText());

    // Insert data into the database
    try {
      Connection connection = DriverManager.getConnection(
        "jdbc:sqlite:movie_rental_system.db"
      );
      String query =
        "INSERT INTO Movie (Title, Genre, Language, Length) VALUES (?, ?, ?, ?)";
      PreparedStatement preparedStatement = connection.prepareStatement(query);
      preparedStatement.setString(1, title);
      preparedStatement.setString(2, genre);
      preparedStatement.setString(3, language);
      preparedStatement.setInt(4, length);
      preparedStatement.executeUpdate();

      // Clear the input fields
      titleField.setText("");
      genreField.setText("");
      languageField.setText("");
      lengthField.setText("");

      connection.close();
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  public static void main(String[] args) {
    // Load SQLite JDBC driver
    try {
      Class.forName("org.sqlite.JDBC");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    // Create and display the GUI
    SwingUtilities.invokeLater(
      new Runnable() {
        @Override
        public void run() {
          new MovieRentalSystemGUI().setVisible(true);
        }
      }
    );
  }
}
