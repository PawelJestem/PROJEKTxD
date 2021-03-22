package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane mainStackPane; //Wstrzykuje stackPane

    @FXML
    public void initialize() {
        loadMenuScreen();

    }

    public void loadMenuScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/MenuScreen.fxml"));
        Pane pane = null;
        try{
        pane = loader.load();
        }catch(IOException e){
            e.printStackTrace();
        }
        MenuScreenController menuScreenController = loader.getController(); //wyciągamy referencję kontrolera
        menuScreenController.setMainController(this); // Przekazujemy instancję klasy
        setScreen(pane); //Pobieramy wszystkie dzieci, którem a mainStackPane po czym dodajemy Pane
    }

    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();//Czyścimy przed dodaniem do stackPane
       mainStackPane.getChildren().add(pane);
    }
}
