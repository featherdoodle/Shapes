/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;

/**
 *
 * @author SyBye8898
 */
public class RightTriangle {
    
    double base, height;
    
    public void setBase(double _base){
        base = _base;
    }
    
    public void setHeight(double _height){
        height = _height;
    }
    
    public double getBase(){
        return base;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double area(){
        double triangleArea;
        triangleArea = (base*height)/2;
        return triangleArea;
    }
    
}
