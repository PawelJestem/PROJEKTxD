package sample;

import javafx.fxml.FXML;

public class TworzenieKontScreenController {
    private MainController mainController;
    @FXML
    public void backMenu() {
        mainController.loadMenuScreen();
    }
    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }

}
