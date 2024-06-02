package programmanajementokobuku;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button close;

    @FXML
    private FontAwesomeIcon close_icon;

    @FXML
    private Label edit_label;

    @FXML
    private Hyperlink forgotPass;

    @FXML
    private AnchorPane gantiPw_form;

    @FXML
    private Button gp_gantiPassBtn;

    @FXML
    private Button gp_kembaliBtn;

    @FXML
    private PasswordField gp_konfirPass;

    @FXML
    private PasswordField gp_passBaru;

    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane loginForm;

    @FXML
    private Button lp_brktBtn;

    @FXML
    private TextField lp_jawaban;

    @FXML
    private Button lp_kembaliBtn;

    @FXML
    private ComboBox<?> lp_pertanyaan;

    @FXML
    private AnchorPane lupaPassword_form;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private AnchorPane signup_form;

    @FXML
    private TextField su_jawaban;

    @FXML
    private PasswordField su_password;

    @FXML
    private ComboBox<?> su_pertanyaan;

    @FXML
    private Button su_signupBtn;

    @FXML
    private TextField su_username;

    @FXML
    private AnchorPane sub_form;

    @FXML
    private Button sub_loginBtn;

    @FXML
    private Button sub_signupBtn;

    @FXML
    private TextField username;
    
    @FXML
    private TextField lp_username;


    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet hasil;
    private Alert alert;
    
    private double x = 0;
    private double y = 0;
    
    public void loginAdmin(){
        
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setHeaderText(null);
            alert.setContentText("Username/Password Salah");
            alert.showAndWait();
        } else {
            
            String selctData = "SELECT username, password FROM admin WHERE username = ? and password = ?";
            
            connect = database.connectDb();
            
            try {
                
                prepare = connect.prepareStatement(selctData);
                prepare.setString(1, username.getText());
                prepare.setString(2, password.getText());
                
                hasil = prepare.executeQuery();
                // IF SUCCESSFULLY LOGIN, THEN PROCEED TO ANOTHER FORM WHICH IS OUR MAIN FORM 
                if (hasil.next()) {
                    // TO GET THE USERNAME THAT USER USED
                    getData.username = username.getText();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Pesan Informasi");
                    alert.setHeaderText(null);
                    alert.setContentText("Login Berhasil!");
                    alert.showAndWait();
                    
                    // LINK YOUR DASHBOARD FORM
                    Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                    
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    
                    
                    
                    stage.setScene(scene);
                    stage.show();
                    
                    loginBtn.getScene().getWindow().hide();
                    
                } else { // IF NOT, THEN THE ERROR MESSAGE WILL APPEAR
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error ");
                    alert.setHeaderText(null);
                    alert.setContentText("Username/Password Salah");
                    alert.showAndWait();
                } 
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
    
    public void daftar() {

        if (su_username.getText().isEmpty() || su_password.getText().isEmpty()
                || su_pertanyaan.getSelectionModel().getSelectedItem() == null
                || su_jawaban.getText().isEmpty()) {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setHeaderText(null);
            alert.setContentText("Lengkapi Username, Password, Pertanyaan dan Jawaban");
            alert.showAndWait();
        } else {
            
            String regData = "INSERT INTO admin (username, password, pertanyaan, jawaban, date) "
                    + "VALUES(?,?,?,?,?)";
            connect = database.connectDb();
            
            try {
                // CHECK IF THE USERNAME IS ALREADY RECORDED
                String checkUsername = "SELECT username FROM admin WHERE username = '"
                        + su_username.getText() + "'";
                
                prepare = connect.prepareStatement(checkUsername);
                hasil = prepare.executeQuery();
                
                if (hasil.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error ");
                    alert.setHeaderText(null);
                    alert.setContentText(su_username.getText() + " Username Telah Digunakan");
                    alert.showAndWait();
                } else if (su_password.getText().length() > 8) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error ");
                    alert.setHeaderText(null);
                    alert.setContentText("Maksimal Panjang Password 8 Karakter");
                    alert.showAndWait();
                } else {
                    prepare = connect.prepareStatement(regData);
                    prepare.setString(1, su_username.getText());
                    prepare.setString(2, su_password.getText());
                    prepare.setString(3, (String) su_pertanyaan.getSelectionModel().getSelectedItem());
                    prepare.setString(4, su_jawaban.getText());
                    
                    Date date = new Date();
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                    prepare.setString(5, String.valueOf(sqlDate));
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Pesan Informasi");
                    alert.setHeaderText(null);
                    alert.setContentText("Akun Baru Berhasil Dibuat");
                    alert.showAndWait();
                    
                    su_username.setText("");
                    su_password.setText("");
                    su_pertanyaan.getSelectionModel().clearSelection();
                    su_jawaban.setText("");
                    
                    TranslateTransition slider = new TranslateTransition();
                    
                    slider.setNode(sub_form);
                    slider.setToX(0);
                    slider.setDuration(Duration.seconds(.5));
                    
                    slider.setOnFinished((ActionEvent e) -> {
                        sub_loginBtn.setVisible(false);
                        sub_signupBtn.setVisible(true);
                    });
                    
                    slider.play();
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
       
    }
    
    private String[] questionList = {"Berapa Tanggal Lahir Mu?", "Apa Warna Favorit Mu?", "Apa Program Studi Mu?"};
    
    public void regLquestionList() {
        List<String> listQ = new ArrayList<>();
        
        for (String data : questionList) {
            listQ.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(listQ);
        su_pertanyaan.setItems(listData);
    }
    
    public void switchForgotPass() {
        lupaPassword_form.setVisible(true);
        loginForm.setVisible(false);
        
        forgotPassQuestionList();
    }
    
    public void lanjutBtn() {
        
        if (lp_username.getText().isEmpty() || lp_pertanyaan.getSelectionModel().getSelectedItem() == null
                || lp_jawaban.getText().isEmpty()) {
            
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setHeaderText(null);
            alert.setContentText("Silahkan Lengkapi Bagian yang Kosong");
            alert.showAndWait();
            
        } else {
            
            String selectData = "SELECT username, pertanyaan, jawaban FROM admin WHERE username = ? AND pertanyaan = ? AND jawaban = ?";
            connect = database.connectDb();
            
            try {
                
                prepare = connect.prepareStatement(selectData);
                prepare.setString(1, lp_username.getText());
                prepare.setString(2, (String) lp_pertanyaan.getSelectionModel().getSelectedItem());
                prepare.setString(3, lp_jawaban.getText());
                
                hasil = prepare.executeQuery();
                
                if (hasil.next()) {
                    gantiPw_form.setVisible(true);
                    lupaPassword_form.setVisible(false);
                } else {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error ");
                    alert.setHeaderText(null);
                    alert.setContentText("Jawaban Anda Salah!!");
                    alert.showAndWait();
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }   
        }
    }
    
    public void gantiPassBtn() {
        
        if (gp_passBaru.getText().isEmpty() || gp_konfirPass.getText().isEmpty()) {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setHeaderText(null);
            alert.setContentText("Silahkan Lengkapi Bagian yang Kosong");
            alert.showAndWait();
        } else {
            
            if (gp_passBaru.getText().equals(gp_konfirPass.getText())) {
                String getDate = "SELECT date FROM admin WHERE username = '"
                        + lp_username.getText() + "'";
                
                connect = database.connectDb();
                
                try {
                    
                    prepare = connect.prepareStatement(getDate);
                    hasil = prepare.executeQuery();
                    
                    String date = "";
                    if (hasil.next()) {
                        date = hasil.getString("date");
                    }
                    
                    String updatePass = "UPDATE admin SET password = '"
                            + gp_passBaru.getText() + "', pertanyaan = '"
                            + lp_pertanyaan.getSelectionModel().getSelectedItem() + "', jawaban = '"
                            + lp_jawaban.getText() + "', date = '"
                            + date + "' WHERE username = '"
                            + lp_username.getText() + "'";
                    
                    prepare = connect.prepareStatement(updatePass);
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Pesan Informasi");
                    alert.setHeaderText(null);
                    alert.setContentText("Password Berhasil Diganti!");
                    alert.showAndWait();
                    
                    loginForm.setVisible(true);
                    gantiPw_form.setVisible(false);

                    // TO CLEAR FIELDS
                    gp_konfirPass.setText("");
                    gp_passBaru.setText("");
                    lp_pertanyaan.getSelectionModel().clearSelection();
                    lp_jawaban.setText("");
                    lp_username.setText("");
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error ");
                alert.setHeaderText(null);
                alert.setContentText("Tidak Cocok");
                alert.showAndWait();
            }
        }
    }
       
    public void forgotPassQuestionList() {
        
        List<String> listQ = new ArrayList<>();
        
        for (String data : questionList) {
            listQ.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(listQ);
        lp_pertanyaan.setItems(listData);
        
    }
    
    public void kembaliHalamanLogin(){
        loginForm.setVisible(true);
        lupaPassword_form.setVisible(false);
    }
    
    public void kembaliHalamanLupapass(){
        lupaPassword_form.setVisible(true);
        gantiPw_form.setVisible(false);
    }
    
    public void geserDaftar(ActionEvent event) {

        TranslateTransition slider = new TranslateTransition();
        
        if (event.getSource() == sub_signupBtn) {
            slider.setNode(sub_form);
            slider.setToX(320);
            slider.setDuration(Duration.seconds(.5));
            
            slider.setOnFinished((ActionEvent e) -> {
                edit_label.setText("Login Your Account");
                sub_loginBtn.setVisible(true);
                sub_signupBtn.setVisible(false);
                
                lupaPassword_form.setVisible(false);
                loginForm.setVisible(true);
                gantiPw_form.setVisible(false);
                
                regLquestionList();
            });
            
            slider.play();
        } else if (event.getSource() == sub_loginBtn) {
            slider.setNode(sub_form);
            slider.setToX(0);
            slider.setDuration(Duration.seconds(.5));
            
            slider.setOnFinished((ActionEvent e) -> {
                edit_label.setText("Create Your Account");
                sub_loginBtn.setVisible(false);
                sub_signupBtn.setVisible(true);
                
                lupaPassword_form.setVisible(false);
                loginForm.setVisible(true);
                gantiPw_form.setVisible(false);
            });
            
            slider.play();
        }
    }
    
    public void keluar(){
        javafx.application.Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}