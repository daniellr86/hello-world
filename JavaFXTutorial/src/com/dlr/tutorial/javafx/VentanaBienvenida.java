/**
 * 
 */
package com.dlr.tutorial.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author daniel.londono
 *
 */
public class VentanaBienvenida extends Application {

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Bienvenido");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10d);
		grid.setVgap(10d);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		// se crea el formulario, agregando el título, y los labels con sus respectivos
		// campos para nombre de usuario y contraseña 
		Text titulo = new Text("Bienvenido");
		titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(titulo, 0, 0, 2, 1);
		
		Label usuario = new Label("Usuario");
		grid.add(usuario, 0, 1);
		
		TextField tfUsuario = new TextField();
		grid.add(tfUsuario, 1, 1);
		
		Label contrasenia = new Label("Contraseña");
		grid.add(contrasenia, 0, 2);
		
		PasswordField pfContrasenia = new PasswordField();
		grid.add(pfContrasenia, 1, 2);
		
		// se crea y agrega a la escena un botón para enviar la información del formulario
		Button enviar = new Button("Enviar");
		HBox hbBotonEnviar = new HBox(10);
		hbBotonEnviar.setAlignment(Pos.BOTTOM_RIGHT);
		hbBotonEnviar.getChildren().add(enviar);
		grid.add(hbBotonEnviar, 1, 3);
		
		final Text mensajes = new Text();
		grid.add(mensajes, 1, 4);
		
		enviar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String stUsuario = tfUsuario.getText();
				String stContrasenia = pfContrasenia.getText();
				mensajes.setFill(Color.FIREBRICK);
				mensajes.setText("Se envía la contraseña para " + stUsuario + ".");
				System.out.println("La contrasenia ingresada es " + stContrasenia);
			}
		});
		
		Scene escena = new Scene(grid, 375, 275);
		primaryStage.setScene(escena);
		
		primaryStage.show();
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		launch(args);
	}

}
