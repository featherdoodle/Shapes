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
public class Sphere {
    
    double radius;
    
    public void setRadius(double _radius){
        radius = _radius;
    }
    
    public double volume(){
        double sphereVolume;
        sphereVolume = (4*Math.pow(radius, 3)*Math.PI)/3;
        return sphereVolume;
    }
    
    public double surfaceArea(){
        double sphereSurfaceArea = 4*Math.PI*Math.sqrt(radius);
        return sphereSurfaceArea;
    }
    
}
