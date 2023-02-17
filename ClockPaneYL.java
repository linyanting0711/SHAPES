package com.example.weekfinal;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.TimeZone;

public class ClockPaneYL extends Pane {
    private int hour;
    private int minute;
    private int second;
    // Clock pane's width and height
    private double w = 250, h = 250;

    // default constructor that is going to construct a clock with the current time
    public ClockPaneYL(){
//        setCurrentTime();
    }

    public ClockPaneYL(String timezone) {
        //set it to current time
        setCurrentTime(timezone);
    }
    public ClockPaneYL(int hour, int minute, int second)
    {
        this.hour =hour;
        this.minute = minute;
        this.second=second;
        paintClock();
    }
    public int getHour()
    {
        return this.hour;
    }
    public int getMinute()
    {
        return this.minute;
    }

    public int getSecond()
    {
        return this.second;
    }

    /** Return clock pane's width */
    public double getW() {
        return w;
    }

    /** Set clock pane's width */
    public void setW(double w) {
        this.w = w;
        paintClock();
    }

    /** Return clock pane's height */
    public double getH() {
        return h;
    }

    /** Set clock pane's height */
    public void setH(double h) {
        this.h = h;
        paintClock();
    }

    public void setHour(int hour)
    {
        this.hour=hour;
        paintClock();
    }

    public void setMinute(int minute)
    {
        this.minute=minute;
        paintClock();
    }

    public void setSecond(int second)
    {
        this.second=second;
        paintClock();
    }
    public void setCurrentTime(String timezone){
//        Calendar calendar = new GregorianCalendar();

        TimeZone tz = TimeZone.getTimeZone("GMT" + timezone);
        Calendar calendar = Calendar.getInstance(tz);
        this.hour =calendar.get(Calendar.HOUR_OF_DAY);
        this.minute =calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        // paint/repaint our pane
        paintClock();
    }

    public void paintClock()
    {
        //Initialize clock parameters
        double clockRadius = Math.min(getWidth(),getHeight())*0.4;

        double centerX = getWidth()/2;
        double centerY =getHeight()/2;

        //Draw Clock/circle
        Circle circle = new Circle(centerX,centerY,clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Circle circle2 = new Circle(centerX,centerY,clockRadius*0.05);
        //circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        //Add some texts
        Text t1 = new Text(centerX-5,centerY-clockRadius+12,"12");
        Text t2 = new Text(centerX-clockRadius,centerY + 1,"9");
        Text t3 = new Text(centerX+clockRadius-10,centerY+3,"3");
        Text t4 = new Text(centerX-3,centerY+clockRadius-3,"6");


        //Draw the second hand
        double sLength = clockRadius*0.9;
        double secondX = centerX+sLength*Math.sin(this.second*(2*Math.PI/60));
        double secondY = centerY-sLength*Math.cos(this.second*(2*Math.PI/60));
        Line sLine = new Line(centerX,centerY,secondX,secondY);
        sLine.setStroke(Color.RED);
        sLine.setStrokeWidth(2);

        //Draw the minute hand
        double mLength = clockRadius*0.7;
        double minuteX = centerX+mLength*Math.sin(this.minute*(2*Math.PI/60)+this.second*(2*Math.PI/3600));
        double minuteY = centerY-mLength*Math.cos(this.minute*(2*Math.PI/60)+this.second*(2*Math.PI/3600));
        Line mLine = new Line(centerX,centerY,minuteX,minuteY);
        mLine.setStroke(Color.GREEN);
        mLine.setStrokeWidth(4);

        //Draw the hour hand
        double hLength = clockRadius*0.6;
        double hourX = centerX+hLength*Math.sin(this.hour*(2*Math.PI/12)+this.minute*(2*Math.PI/(60*12))+this.second*(2*Math.PI/(3600*12)));
        double hourY = centerY-hLength*Math.cos(this.hour*(2*Math.PI/12)+this.minute*(2*Math.PI/(60*12))+this.second*(2*Math.PI/(3600*12)));
        Line hLine = new Line(centerX,centerY,hourX,hourY);
        hLine.setStroke(Color.GREEN);
        hLine.setStrokeWidth(4);

        //add the node to the pane object
        getChildren().clear();

        getChildren().addAll(circle,t1,t2,t3,t4,sLine,mLine,hLine,circle2);

        // Display more details on the clock

    }

    public void setHeight(double height)
    {
        super.setHeight(height);
        paintClock();
    }

    public void setWidth(double width)
    {
        super.setWidth(width);
        paintClock();
    }

    public String toString() {
        return "   " + this.hour + ":" + this.minute + ":" + this.second + "   ";
    }
}