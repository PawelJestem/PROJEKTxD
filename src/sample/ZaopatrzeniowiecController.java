package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ZaopatrzeniowiecController {
    @FXML
    private Button openStanMagazynowy;
    @FXML
    private Button test;
    @FXML
    private Button openStatystyki;
    @FXML
    private Button openZamowieniaWew;
    @FXML
    private Button openDodajZamowienie;

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

    public void openStanMagazynowy () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/StanMagazynowyScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        StanMagazynowyController stanMagazynowyController = loader.getController();
        stanMagazynowyController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    public void openStatystyki () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/StatystykiScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        StatystykiScreenController statystykiScreenController = loader.getController();
        statystykiScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }
    public void openZamowieniaWew() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/ListaZamowienWewScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        ListaZamowienWewScreenController listaZamowienWewScreenController = loader.getController();
        listaZamowienWewScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }


    public void openDodajZamowienie() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/DodajZamowienieScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        DodajZamowienieScreenController dodajZamowienieScreenController  = loader.getController();
        dodajZamowienieScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }
}
