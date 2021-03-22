package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuScreenController {
    private MainController mainController;
    @FXML
    private TextField login;
    @FXML
    private PasswordField password;

    @FXML
    public void openApplication() {
    FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/AppScreen.fxml"));
    Pane pane = null;
    try {
        pane = loader.load();
    }catch (IOException e) {
        e.printStackTrace();
    }
    AppController appController = loader.getController();
    appController.setMainController(mainController);
    mainController.setScreen(pane); //Pane zostanie przekazany do menucontrollera i zosatnie umieszczony w stackPane
    }
    @FXML
    public void openOptions() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/OptionsScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        OptionsController optionsController = loader.getController();
        optionsController.setMainController(mainController);
        mainController.setScreen(pane);

    }
    @FXML
    public void openAdministratorWindow() {
    String userLogin;
    String userPassword;
        userLogin = login.getText().toString();
        userPassword = password.getText().toString();
        System.out.println("Login to:"+ userPassword);

        if(userLogin.equals("admin")  && userPassword.equals("admin")){
            openAdminWindow();
        }
        else if(userLogin.equals("handlowiec")  && userPassword.equals("handlowiec")){
            openHandlowiecWindow ();
        }
        else if(userLogin.equals("magazynier")  && userPassword.equals("magazynier")){
            openMagazynierWindow ();
        }
        else if(userLogin.equals("ksiegowa")  && userPassword.equals("ksiegowa")){
            openAccountantWindow ();
        }
        else if(userLogin.equals("zaopatrzeniowiec")  && userPassword.equals("zaopatrzeniowiec")){
            openZaopatrzeniowiecWindow ();
        }



    }

    public void openAdminWindow () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/AdministratorScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        AdministratorScreenController administratorScreenController = loader.getController();
        administratorScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }
    public void openHandlowiecWindow () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/Handlowiec.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        HandlowiecScreenController handlowiecScreenController = loader.getController();
        handlowiecScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    public void openMagazynierWindow () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/MagazynierScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        MagazynierScreenController magazynierScreenController = loader.getController();
        magazynierScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }
    public void openAccountantWindow () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/AccountantScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        AccountantController accountantController = loader.getController();
        accountantController.setMainController(mainController);
        mainController.setScreen(pane);
    }
    public void openZaopatrzeniowiecWindow () {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/Zaopatrzeniowiec.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch(IOException e) {
            e.printStackTrace();
        }
        ZaopatrzeniowiecController zaopatrzeniowiecController = loader.getController();
        zaopatrzeniowiecController.setMainController(mainController);
        mainController.setScreen(pane);
    }
    @FXML
    public void exit(){
        Platform.exit();
    }
    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }
}
