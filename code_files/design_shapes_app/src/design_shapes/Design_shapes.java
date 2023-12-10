/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_shapes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author malah
 */
public class Design_shapes extends Application {

    @FXML
    private ComboBox<String> ShapesList;
    @FXML
    private RadioButton red;
    @FXML
    private RadioButton green;
    @FXML
    private RadioButton blue;
    @FXML
    private TextField strokeWidth;
    @FXML
    private CheckBox backgroundColor;
    @FXML
    private Pane panel;
    @FXML
    private Rectangle rec;
    @FXML
    private Circle cir;
    @FXML
    private Rectangle sqr;
    
    private ObservableList<String> shapeList = FXCollections.observableArrayList("Rectangle", "Circle", "Square");
    @FXML
    private ToggleGroup group;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Design_shapes.class.getResource("FXML.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Change shapes Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

     public void initialize()
    {
        panel.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        ShapesList.setValue("Rectangle");
        ShapesList.setItems(shapeList);
        
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
    

    @FXML
    private void onRed(ActionEvent event) 
    {
        if(ShapesList.getValue() == "Rectangle")
        {
            rec.setFill(Color.RED);
        }
        else if(ShapesList.getValue() == "Circle")
        {
            cir.setFill(Color.RED);
        }
        else if(ShapesList.getValue() == "Square")
        {
            sqr.setFill(Color.RED);
        }
    }

    @FXML
    private void onGreen(ActionEvent event) 
    {
        if(ShapesList.getValue() == "Rectangle")
        {
            rec.setFill(Color.GREEN);
        }
        else if(ShapesList.getValue() == "Circle")
        {
            cir.setFill(Color.GREEN);
        }
        else if(ShapesList.getValue() == "Square")
        {
            sqr.setFill(Color.GREEN);
        }
    }

    @FXML
    private void onBlue(ActionEvent event) 
    {
        if(ShapesList.getValue() == "Rectangle")
        {
            rec.setFill(Color.BLUE);
        }
        else if(ShapesList.getValue() == "Circle")
        {
            cir.setFill(Color.BLUE);
        }
        else if(ShapesList.getValue() == "Square")
        {
            sqr.setFill(Color.BLUE);
        }
    }

    @FXML
    private void onEnter(KeyEvent event)
    {
        if (event.getCode().equals(KeyCode.ENTER))
        {
            if (ShapesList.getValue() == "Rectangle")
            {
                rec.setStrokeWidth(Integer.parseInt(strokeWidth.getText()));
            } 
            else if (ShapesList.getValue() == "Circle") 
            {
                cir.setStrokeWidth(Integer.parseInt(strokeWidth.getText()));
            }
            else if (ShapesList.getValue() == "Square") 
            {
                sqr.setStrokeWidth(Integer.parseInt(strokeWidth.getText()));
            }
        }
    }

    @FXML
    private void onCheck(ActionEvent event)
    {
        if(backgroundColor.isSelected())
        {
            panel.setStyle("-fx-background-color: lightyellow");
        }
        else
        {
            panel.setStyle("-fx-background-color: White");
        }
    }

    @FXML
    private void onMouse(MouseEvent event)
    {
        rec.setFill(Color.BLACK);
        cir.setFill(Color.BLACK);
        sqr.setFill(Color.BLACK);
    }
    
}
