package com.dlr.tutorial.javafx.main;

import com.dlr.tutorial.javafx.HolaMundo;

import javafx.application.Application;
import javafx.stage.Stage;

public class TutorialJavaFXMain extends Application{

	public static void main(String[] args) {
//		Application holaMundo = new HolaMundo();
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HolaMundo holaMundo = new HolaMundo();
		holaMundo.inicio(primaryStage);
		primaryStage.show();
		
	}

}
