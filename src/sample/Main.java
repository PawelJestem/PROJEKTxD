package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/MainScreen.fxml")); // Podajemy ścieżke do pliku, który chcemy załadować
        StackPane stackPane = loader.load(); //Tworzymy nasz StackPane
        Scene scene = new Scene(stackPane, 1000, 600); //Powołujemy naszą scene, podajemy wymiary
        primaryStage.setScene(scene); // Dorzucamy scene
        primaryStage.setTitle("Projekt");//Tworzymy tytuł
        primaryStage.setResizable(false);//Blokuje zmienianie rozmiarów okna
        primaryStage.show();//Pokazujemy scene

    }



}
