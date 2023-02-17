package com.example.demo5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class task2aYL extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        GraphViewYL gv = new GraphViewYL();
        Scene scene = new Scene(gv, 380, 300);

        stage.setTitle("Task2a Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){

        launch();
    }
}