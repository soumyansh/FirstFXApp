package controller;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import model.Person;

public class MainWindowController {
	// views
	@FXML
	private Label label;
	@FXML
	private TextField field;
	private Person person;

	/*
	 * private Main main;
	 * 
	 * public void setMain(Main main) { this.main=main; }
	 */

	public void handleButton() {
		person = new Person("Soumyansh", "Gupta", "28");

		String text = field.getText();
		label.setText(person.getFirstName());
		field.clear();
	}

	public void showAlert1() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.showAndWait();
	}

	public void showInputDialog() {
		TextInputDialog inputDialog = new TextInputDialog();
		inputDialog.setTitle("Input");
		inputDialog.setContentText("Please enter your age");
		Optional<String> result = inputDialog.showAndWait();
		if (result.isPresent()) {
			System.out.println("Age input is " + result.get());
		} else {
			System.out.println("No input provided");
		}
	}

	public void showAlert2() {

	}

}
