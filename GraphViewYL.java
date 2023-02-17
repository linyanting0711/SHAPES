package com.example.demo5;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class GraphViewYL extends Pane {
    public GraphViewYL() throws IOException {
        paintGraphView();
    }

    private void paintGraphView() throws IOException {
        // get data
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the filename for creating graph: ");

        String filename = in.nextLine();
        System.out.println(filename);

        Scanner inFile = new Scanner(Path.of(filename));
        int numVertices = 0;
        if(inFile.hasNextLine()){
            numVertices = Integer.parseInt(inFile.nextLine());
        }

        int[][] positions = new int[numVertices][2];
        HashMap<Integer, HashSet<Integer>> edges = new HashMap<Integer, HashSet<Integer>>();

        String temp = "";
        int vertex_id = 0;

        while (inFile.hasNextLine()) {
            temp = inFile.nextLine();
            String[] values = temp.split(" ");

            for(int i = 0; i < values.length; ++i){
                if(i == 0){
                    vertex_id = Integer.parseInt(values[i]);
                    edges.put(vertex_id, new HashSet<>());
                }else if(i == 1 || i == 2){
                    positions[vertex_id][i - 1] = Integer.parseInt(values[i]);
                }else{
                    edges.get(vertex_id).add(Integer.parseInt(values[i]));
                }
            }
        }

        for (Map.Entry<Integer,HashSet<Integer>> mapElement : edges.entrySet()) {
            int key = mapElement.getKey();
            HashSet<Integer> s = mapElement.getValue();

            Iterator<Integer> i = s.iterator();

            while(i.hasNext()){
                int k = i.next();
                System.out.println(positions[key][0] + ", " + positions[key][1] + ", " + positions[k][0] + ", " + positions[k][1]);
                Line line = new Line(positions[key][0], positions[key][1], positions[k][0], positions[k][1]);
                line.setStrokeLineCap(StrokeLineCap.ROUND);
                getChildren().addAll(line);
            }
        }

        // add label
        for (int j = 0; j < positions.length; ++j){
            Circle circle = new Circle(positions[j][0], positions[j][1],5);
            Text text = new Text();
            text.setText(String.valueOf(j));
            text.setX(positions[j][0] - 10);
            text.setY(positions[j][1] - 5);
            getChildren().addAll(text, circle);
        }


    }
}
