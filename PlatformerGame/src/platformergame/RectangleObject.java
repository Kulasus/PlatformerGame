/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platformergame;

import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author lukas
 */
public class RectangleObject extends GameObject{
    private int w;
    private int h;
    private Node entity;
    private int health;
    public RectangleObject(int x, int y, int h, int w, Color color, Pane pane, Point2D velocity, int health){
        super(x,y,color,velocity);
        this.w = w;
        this.h = h;
        this.health = health;
        Rectangle body = new Rectangle(w,h);
        body.setTranslateX(x);
        body.setTranslateY(y);
        body.setFill(color);
        this.entity = body;        
        pane.getChildren().add(this.entity);
    }
    public RectangleObject(int x, int y, int h, int w, Color color, Pane pane, Point2D velocity, int health, ImagePattern image){
        super(x,y,color,velocity);
        this.w = w;
        this.h = h;
        this.health = health;
        Rectangle body = new Rectangle(w,h);
        body.setTranslateX(x);
        body.setTranslateY(y);
        body.setFill(image);
        this.entity = body;        
        pane.getChildren().add(this.entity);
    }
        
    public Node getEntity() {
        return entity;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        health = newHealth;
    }
    
}
