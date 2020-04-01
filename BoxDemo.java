/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxdemo;
import java.util.*;
class Box{
    double width;
    double height;
    double depth;
    
}

/**
 *
 * @author KAVYA
 */
public class BoxDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox=new Box();
        double vol;
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        vol=mybox.width*mybox.depth*mybox.height;
        System.out.println("volume is :" + vol);
        
    }
    
}
