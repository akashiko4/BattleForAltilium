package com.myapp.objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 *It's used for other whose can move, attack and get damage
 */
public class Warrior extends MapObject {

    /**Assigned field*/
    public Warrior() {
        pathTitle.append("second_human.png");
        try {
            tile = ImageIO.read(new File(pathTitle.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        damage = 30;
        hp = 150;
    }
}