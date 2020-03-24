package sample;

import java.awt.*;
import java.awt.event.ActionEvent;

import static java.lang.String.valueOf;

public class Controller {
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;

    private int num1;
    private int num2;
    private int num3;
    private int num4;

    private Field field;

    public Controller() {
        field = new Field();
    }

    public void initialize() {
        Tile[][] array = field.getTiles();
        btn1.setText(valueOf(array[0][0].getValue()));
        btn2.setText(valueOf(array[0][1].getValue()));
        btn3.setText(valueOf(array[1][0].getValue()));
        btn4.setText(valueOf(array[1][1].getValue()));
        initializeNumbers();
    }

    private void initializeNumbers() {
        num1 = Integer.parseInt(btn1.getText());
        num2 = Integer.parseInt(btn2.getText());
        num3 = Integer.parseInt(btn3.getText());
        num4 = Integer.parseInt(btn4.getText());
    }

    public void clickBtn1 (ActionEvent actionEvent) {
        Tile[][] array = field.getTiles();
        if (num1 > 0) {
            num1 = num1 - 1;
            btn1.setText(valueOf(num1));
            num3 = num3 + 1;
            num2 = num2 + 1;
            btn2.setText(valueOf(num3));
            btn2.setText(valueOf(num2));

            array[0][0].setValue(num1);
            array[1][0].setValue(num3);
            array[0][1].setValue(num2);
        }

    }

    public void clickBtn2(ActionEvent actionEvent) {
        Tile[][] array = field.getTiles();
        if (num2 > 0) {
            num2 = num2 - 1;
            btn2.setText(valueOf(num2));
            num1 = num1 + 1;
            num4 = num4 + 1;
            btn1.setText(valueOf(num1));
            btn4.setText(valueOf(num4));

            array[0][0].setValue(num1);
            array[1][1].setValue(num4);
            array[0][1].setValue(num2);
        }
    }


    public void clickBtn2(ActionEvent actionEvent) {
        Tile[][] array = field.getTiles();
        if (num3 > 0) {
            num3 = num3 - 1;
            btn2.setText(valueOf(num3));
            num4 = num4 + 1;
            num1 = num1 + 1;
            btn4.setText(valueOf(num4));
            btn1.setText(valueOf(num1));

            array[0][0].setValue(num1);
            array[1][0].setValue(num3);
            array[1][1].setValue(num4);
        }
    }

    public void clickBtn4(ActionEvent actionEvent) {
        Tile[][] array = field.getTiles();
        if (num4 > 0) {
            num4 = num4 - 1;
            btn4.setText(valueOf(num4));
            num3 = num3 + 1;
            btn2.setText(valueOf(num3));
            num2 = num2 + 1;
            btn2.setText(valueOf(num2));

            array[1][1].setValue(num4);
            array[1][0].setValue(num3);
            array[0][1].setValue(num2);
        }
    }
}

}