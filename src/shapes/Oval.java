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
public class Oval {
    
    double width, length;
    
    public void setWidth(double _width){
        width = _width;
    }
    
    public void setLength(double _length){
        length = _length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double area(){
        return (length*width*0.8);
    }
    
}
