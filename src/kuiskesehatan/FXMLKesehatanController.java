/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuiskesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Farhan
 */
public class FXMLKesehatanController implements Initializable {

    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField beratbadan;
    @FXML
    private JFXTextField tinggi;
    @FXML
    private JFXRadioButton lk;
    @FXML
    private ToggleGroup rad;
    @FXML
    private JFXRadioButton pr;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXButton reset;
    @FXML
    private JFXTextField beratideal;
    @FXML
    private JFXTextArea hak;
    @FXML
    private JFXTextField saran;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnproses(ActionEvent event) {
        String nm = nama.getText(),
        tg = tinggi.getText(), simpulan;
        int bil = parseInt(beratbadan.getText()), bi;
        
        if (lk.isSelected()){ 
            bi = 105-bil;
            beratideal.setText(""+bi);
            if (105-bil-10 <= 105-bil){
                saran.setText("Lebih banyak porsi makan");
                simpulan = "Under Weight";
            } else if (105-bil+10 >= 105-bil){
                saran.setText("Mulai atur jadwal diet");
                simpulan = "Over Weight";
            } else {
                saran.setText("Pertahankan kesehatan dan pertahankan pola makan");
                simpulan = "Ideal";
            }
        } if (pr.isSelected()){
            bi = 110-bil;
            beratideal.setText(""+bi);
            if (105-bil-10 <= 105-bil){
                saran.setText("Lebih banyak porsi makan");
                simpulan = "Under Weight";
            } else if (110-bil+10 >= 110-bil){
                saran.setText("Mulai atur jadwal diet");
                simpulan = "Over Weight";
            } else {
                saran.setText("Pertahankan kesehatan dan pertahankan pola makan");
                simpulan = "Ideal";
            }
        }
        
        hak.setText("Nama       : " + nm + "\nBerat Badan : " + bil + 
                    "\nTinggi Badan : " + tg + "\nKesimpulan : ");
    }

    @FXML
    private void btnreset(ActionEvent event) {
        nama.setText("");
        beratbadan.setText("");
        tinggi.setText("");
        pr.setSelected(false);
        lk.setSelected(false);
        hak.setText("");
        saran.setText("");
    }
    
}
