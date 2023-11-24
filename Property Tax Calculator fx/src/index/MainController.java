package index;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {	
	
	@FXML
	private TextField actualValueField;
	
	@FXML
	private TextField assessmentValueField;
	
	@FXML
	private TextField taxField;
	
	@FXML
	private Button calculateBtn;
	
	@FXML
	private Button clearBtn;
	
	@FXML
    private void calculateTax() {
 
            // Get the actual value from the text field
            double actualValue = Double.parseDouble(actualValueField.getText());

            // Calculate the assessment value and property tax
            double assessmentValue = actualValue * 0.6;
            double propertyTax = assessmentValue * 0.0064;

            // Display the assessment value and property tax
            assessmentValueField.setText(String.format("$%,.2f", assessmentValue));
           
            taxField.setText(String.format("$%,.2f", propertyTax));
            
            
        }

	@FXML
    private void clearForm() {
        // Clear the text field and labels
        actualValueField.clear();
        assessmentValueField.setText("");
        taxField.setText("");
    }
}