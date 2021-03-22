package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class AccountantController {
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
}
