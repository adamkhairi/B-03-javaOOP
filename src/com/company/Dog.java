package com.company;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;
import java.io.File;


// I-
public class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    //    public void playSound(String filename) {
//        URL resource = ClassLoader.getSystemClassLoader().getResource(filename);
//        try {
//            final Clip clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
//            clip.addLineListener(event -> {
//                if (event.getType() == LineEvent.Type.STOP) {
//                    clip.close();
//                }
//            });
//            assert resource != null;
//            clip.open(AudioSystem.getAudioInputStream(resource));
//            clip.start();
//        } catch (Exception e) {
//            //LOGGER.error("Failed to play sound " + filename, e);
//            System.out.println("Error");
//        }
//    }
    public void playSound(String soundLocation) {
        try {
            File soundPath = new File(soundLocation);
            if (soundPath.exists()) {

                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundLocation);
                Clip clip = AudioSystem.getClip();
                clip.start();

                JOptionPane.showMessageDialog(null, "Ok to Stop");
            } else {
                System.out.println("Invalid File");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bark() {
        System.out.println("Wwaaaarf !!");
    }

    public void eat() {
        System.out.println("The dog eat meat");
    }
}

// II-
//public class Dog {
//    public String name;
//
//    public Dog(String name) {
//        this.name = name;
//    }
//
//    public void bark(String sound) {
//        System.out.println(sound);
//    }
//
//    public void eat(String items) {
//        System.out.println(items);
//    }
//
//}