// Lab09Ast.java
// This is the student, starting file of Lab 09A.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the re-defined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.

import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
    public void paint(Graphics g)
    {
        
        XmasTree myTree = new XmasTree();
        myTree.drawTrunk(g);
        myTree.drawLeaves(g);
        myTree.drawOrnaments(g);

    }

}

class Tree
{
    // Do NOT alter this Tree class in any way!
    
    public void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,475,395,525,600);
    }

    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillCircle(g,500,300,100);
    }
}

class PineTree extends Tree
{
    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        int q = 370;  //x
        int w = 200;  //y
        int e = 625;  //x
        int r = 200;  //y
        int t = 500;  //x
        int y = 50;  //y
        Expo.fillPolygon(g,q,w,e,r,t,y);
        Expo.fillPolygon(g,q - 25,w + 75,e + 25,r + 75,t,y + 50);
        Expo.fillPolygon(g,q - 75,w + 200,e + 75,r + 200,t,y + 50);
    }    
}
class XmasTree extends PineTree
{
    public void drawOrnaments(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        int a = 500;
        int s = 100;
        int d = 15;
        Expo.fillCircle(g,a,s,d);
        Expo.fillCircle(g,a,s +50,d);
        Expo.fillCircle(g,a + 50,s + 50,d);
        Expo.fillCircle(g,a,s + 200,d);
        Expo.fillCircle(g,a,s + 100,d);
        Expo.fillCircle(g,a,s + 250,d);
        Expo.fillCircle(g,a - 50,s + 50,d);
        Expo.fillCircle(g,a +50,s + 200,d); 
        Expo.fillCircle(g,a - 50,s + 200,d);
        Expo.fillCircle(g,a,s + 150,d);
    }
}