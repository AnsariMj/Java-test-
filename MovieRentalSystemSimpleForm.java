import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MovieRentalSystemSimpleForm extends JFrame {

  private JTextField titleField, genreField, languageField, lengthField;

  public MovieRentalSystemSimpleForm() {
    setTitle("Movie Rental System");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create components
    JLabel titleLabel = new JLabel("Title:");
    JLabel genreLabel = new JLabel("Genre:");
    JLabel languageLabel = new JLabel("Language:");
    JLabel lengthLabel = new JLabel("Length:");

    titleField = new JTextField(15);
    genreField = new JTextField(15);
    languageField = new JTextField(15);
    lengthField = new JTextField(15);

    JButton okButton = new JButton("OK");

    // Set layout
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

    // Add components to the frame
    add(titleLabel);
    add(titleField);
    add(genreLabel);
    add(genreField);
    add(languageLabel);
    add(languageField);
    add(lengthLabel);
    add(lengthField);
    add(okButton);

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
          new MovieRentalSystemSimpleForm().setVisible(true);
        }
      }
    );
  }
}
