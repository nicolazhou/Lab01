package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancella;
    
    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtCom;
    

    @FXML
    void doInsert(ActionEvent event) {

    	long tInizio = System.nanoTime();
    	
    	String parola = txtParola.getText();
    	elenco.addParola(parola);
    	
    	
    	
    	// Stampa parole in ordine alfabetico
    	
    	txtResult.clear();
    	
    	for(String p : elenco.getElenco()) {
    		
    		txtResult.appendText(p + "\n");
    		
    	}
    	
    	txtCom.setText(""+(System.nanoTime()-tInizio)/1000000.0 + " millisecondi");
    	
    	
    }

    @FXML
    void doReset(ActionEvent event) {

    	long tInizio = System.nanoTime();
    	
    	elenco.reset();
    	txtParola.clear();
    	txtResult.clear();
    	
    	
    	txtCom.setText(""+(System.nanoTime()-tInizio)/1000000.0 + " millisecondi");
    	
    }
    
    
    @FXML
    void doCancella(ActionEvent event) {

    	long tInizio = System.nanoTime();
    	
    	String parola = txtParola.getText();
    	
    	elenco.cancellaParola(parola);
    	
    	// Stampa parole in ordine alfabetico
    	
    	txtResult.clear();
    	
    	for(String p : elenco.getElenco()) {
    		
    		txtResult.appendText(p + "\n");
    		
    	}
    	
    	txtCom.setText(""+(System.nanoTime()-tInizio)/1000000.0 + " millisecondi");
    }
    

    @FXML
    void initialize() {
    	assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtCom != null : "fx:id=\"txtCom\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

    
}
