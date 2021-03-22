package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MagazynierScreenController {
    @FXML
    private Button openListaZamowien;
    @FXML
    private Button openStanMagazynowyy;

    private MainController mainController;
    @FXML
    public void backMenu() {
        mainController.loadMenuScreen();
    }
    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }


    public void openListaZamowien () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/ListaZamowienScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        ListaZamowienScreenController listaZamowienScreenController = loader.getController();
        listaZamowienScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    public void openStanMagazynowyy () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/StanMagazynowyMagazynieraScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        StanMagazynowyMagazynierScreenController stanMagazynowyMagazynierScreenController = loader.getController();
        stanMagazynowyMagazynierScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }
}
