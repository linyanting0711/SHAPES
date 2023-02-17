package com.example.weekfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/*
 step1 : add the javafx library
 step 2: set the vm
 */
public class Task2bYL extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        ClockPaneYL clock1 = new ClockPaneYL("-5");
        Label lblCurrentTime1_0 = new Label("  New York   ");
        String timeString1 = clock1.toString();
        Label lblCurrentTime1 = new Label(timeString1);
        BorderPane pane1 = new BorderPane();
        pane1.setTop(lblCurrentTime1_0);
        pane1.setCenter(clock1);
        pane1.setBottom(lblCurrentTime1);
        BorderPane.setAlignment(lblCurrentTime1, Pos.TOP_CENTER);

        ClockPaneYL clock2 = new ClockPaneYL("-6");
        Label lblCurrentTime2_0 = new Label("     Dallas     ");
        String timeString2 = clock2.toString();
        Label lblCurrentTime2 = new Label(timeString2);
        BorderPane pane2 = new BorderPane();
        pane2.setTop(lblCurrentTime2_0);
        pane2.setCenter(clock2);
        pane2.setBottom(lblCurrentTime2);
        BorderPane.setAlignment(lblCurrentTime2, Pos.TOP_CENTER);

        ClockPaneYL clock3 = new ClockPaneYL("-7");
        Label lblCurrentTime3_0 = new Label("     Arizona    ");
        String timeString3 = clock3.toString();
        Label lblCurrentTime3 = new Label(timeString3);
        BorderPane pane3 = new BorderPane();
        pane3.setTop(lblCurrentTime3_0);
        pane3.setCenter(clock3);
        pane3.setBottom(lblCurrentTime3);
        BorderPane.setAlignment(lblCurrentTime3, Pos.TOP_CENTER);

        ClockPaneYL clock4 = new ClockPaneYL("-8");
        Label lblCurrentTime4_0 = new Label(" Los Angeles ");
        String timeString4 = clock4.toString();
        Label lblCurrentTime4 = new Label(timeString4);
        BorderPane pane4 = new BorderPane();
        pane4.setTop(lblCurrentTime4_0);
        pane4.setCenter(clock4);
        pane4.setBottom(lblCurrentTime4);
        BorderPane.setAlignment(lblCurrentTime4, Pos.TOP_CENTER);

        ClockPaneYL clock5 = new ClockPaneYL("+8");
        Label lblCurrentTime5_0 = new Label("       Beijing     ");
        String timeString5 = clock5.toString();
        Label lblCurrentTime5 = new Label(timeString5);
        BorderPane pane5 = new BorderPane();
        pane5.setTop(lblCurrentTime5_0);
        pane5.setCenter(clock5);
        pane5.setBottom(lblCurrentTime5);
        BorderPane.setAlignment(lblCurrentTime5, Pos.TOP_CENTER);


        HBox hbox = new HBox();
        hbox.getChildren().addAll(pane1, pane2, pane3, pane4, pane5);

        Scene scene = new Scene(hbox, 450, 275);
        primaryStage.setTitle("Clock Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}