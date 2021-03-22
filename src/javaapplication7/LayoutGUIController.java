package javaapplication7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayoutGUIController {
    
    private String crrntArthOp = "DEFAULT";
    private String opd1 = "0";
    
    @FXML
    private TextField txt1;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;
    
    @FXML
    private Button btn4;
    
    @FXML
    private Button btn5;
    
    @FXML
    private Button btn6;
    
    @FXML
    private Button btn7;
    
    @FXML
    private Button btn8;
    
    @FXML
    private Button btn9;
    
    @FXML
    private Button btn0;
    
    @FXML
    private Button btnAC;

    @FXML
    private Button plusBtn;

    @FXML
    private Button eqBtn;

    @FXML
    private Button subBtn;

    @FXML
    private Button mulplyBtn;

    @FXML
    private Button divisionBtn;

    @FXML
    void addNum(ActionEvent event) {
        
        
        if(((Button)event.getSource()).getText().equals("1")){
            txt1.setText(txt1.getText() + "1");       
        }
        else if(((Button)event.getSource()).getText().equals("2")){
            txt1.setText(txt1.getText() + "2");
        }
        else if(((Button)event.getSource()).getText().equals("3")){
            txt1.setText(txt1.getText() + "3");
        }
        else if(((Button)event.getSource()).getText().equals("4")){
            txt1.setText(txt1.getText() + "4");
        }
        else if(((Button)event.getSource()).getText().equals("5")){
            txt1.setText(txt1.getText() + "5");
        }
        else if(((Button)event.getSource()).getText().equals("6")){
            txt1.setText(txt1.getText() + "6");
        }
        else if(((Button)event.getSource()).getText().equals("7")){
            txt1.setText(txt1.getText() + "7");
        }
        else if(((Button)event.getSource()).getText().equals("8")){
            txt1.setText(txt1.getText() + "8");
        }
        else if(((Button)event.getSource()).getText().equals("9")){
            txt1.setText(txt1.getText() + "9");
        }
        else if(((Button)event.getSource()).getText().equals("0")){
            txt1.setText(txt1.getText() + "0");
        }
        else if(((Button)event.getSource()).getText().equals("AC")){
            txt1.clear();
            txt1.setText("");
        }
    }

    @FXML
    void addOperation(ActionEvent event) {
        
        if(((Button)event.getSource()).getText().equals("+")){
            if(crrntArthOp.equals(crrntArthOp)){
                opd1 = txt1.getText();
                crrntArthOp = "ADD";
                txt1.clear(); 
            }
        }
        
    }

    @FXML
    void divideNum(ActionEvent event) {
        
        if(((Button)event.getSource()).getText().equals("÷")){
            if(crrntArthOp.equals(crrntArthOp)){
                opd1 = txt1.getText();
                crrntArthOp = "DIVIDE";
                txt1.clear(); 
            }
        }
    }

    

    @FXML
    void multiplyNum(ActionEvent event) {
        if(((Button)event.getSource()).getText().equals("x")){
            if(crrntArthOp.equals(crrntArthOp)){
                opd1 = txt1.getText();
                crrntArthOp = "MULTI";
                txt1.clear(); 
            }
        }
    }

    @FXML
    void subNum(ActionEvent event) {
        if(((Button)event.getSource()).getText().equals("-")){
            if(crrntArthOp.equals(crrntArthOp)){
                opd1 = txt1.getText();
                crrntArthOp = "SUBTRACT";
                txt1.clear(); 
            }
        }
    }
    
    
    @FXML
    void eqOperation(ActionEvent event) {
        
        int num1 = Integer.parseInt(opd1);
        int num2 = Integer.parseInt(txt1.getText());
        if(crrntArthOp.equals("ADD")){
            txt1.setText("" + (num1+num2));
        }
        else if(crrntArthOp.equals("MULTI")){
            txt1.setText("" + (num1*num2));
        }
        else if(crrntArthOp.equals("SUBTRACT")){
            txt1.setText("" + (num1-num2));
        }
        else if(crrntArthOp.equals("DIVIDE")){
            txt1.setText("" + (num1/num2));
        }
        
    }

}


