package com.dlr.tutorial.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaMundo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button();
		btn.setText("Di 'Hola mundo'");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hola mundo!");
				
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Hola mundo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main (String[] args) {
		launch(args);
	}
	

}
