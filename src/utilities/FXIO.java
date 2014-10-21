/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;

/**
 *
 * @author Piotr
 */
public class FXIO {
    
    public static Image getImage(String name){
        Image im = null;
        try {
            im = new Image(new FileInputStream(new File("images/"+name)));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }        
        return im;
    }
    
    public static WritableImage[] getImageMatrix(Image image){
        WritableImage[] images = new WritableImage[(int)(image.getWidth()/image.getHeight())];
        PixelReader reader = image.getPixelReader();
        for(int i=0;i<images.length;i++){
            images[i] = new WritableImage(reader,(int)(i*image.getHeight()), 0, (int)image.getHeight(), (int)image.getHeight());
            
        }
        return images;
    }
    
}
