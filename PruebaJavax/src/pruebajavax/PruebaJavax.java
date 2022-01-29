/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajavax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author navag
 */
public class PruebaJavax extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        FileInputStream inputstream = new FileInputStream("e:\\arturo3.png"); 
        Rectangle rect = new Rectangle(400, 20, 50, 100);
        Polygon polygon1 = new Polygon(new double[]{
            45, 10,
            10, 80,
            80, 80,});
        LinearGradient gradient1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop[]{
            new Stop(0, Color.DODGERBLUE),
            new Stop(1, Color.BLACK)
        });

        
        Image image1 = new Image(inputstream);
        ImageView imageView1 = new ImageView(image1);
        imageView1.setX(200);
        imageView1.setY(205);
        imageView1.setVisible(false);
        rect.setFill(Color.BLUE);
        rect.setStroke(Color.WHITE);
        rect.setStrokeWidth(15);
        rect.setFill(gradient1);
        polygon1.setFill(gradient1);
        polygon1.setStrokeWidth(15);
        polygon1.setStroke(Color.WHITESMOKE);

        Button btn = new Button();
        
        Button btn2 = new Button();
        Button btn3 = new Button();
        btn2.setText("Borrar imagen");
        btn3.setLayoutX(500);
        btn3.setLayoutY(280);
        btn3.setText("Salir");
        
        btn2.setVisible(false);
        btn.setLayoutX(250);
        btn.setLayoutY(150);
        

        btn.setText("Quieres una sorpresa?");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
            imageView1.setVisible(true);   
            btn2.setVisible(true);
                btn2.setLayoutX(150);
                 btn2.setLayoutY(150);
               
            }
        });
         btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
            imageView1.setVisible(false);
            btn2.setVisible(false);
            
            }
        });
         btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
            
            }
        });

        Group root = new  Group();
        root.getChildren().addAll(btn, btn2, rect, polygon1,imageView1,btn3);

        Scene scene = new Scene(root, 600, 300, Color.YELLOW);

        primaryStage.setTitle("Super ventana");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);

        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
       
        launch(args);
        
    }

}
