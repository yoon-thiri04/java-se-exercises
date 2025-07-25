package Exam;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
public class musicPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String filepath="D:\\YoonThiri\\JavaCS\\yoonJava\\src\\Exam\\wefound.wav";
         Playmusic(filepath);
        // JOptionPane.showMessageDialog(null,"Press");
	}
    public static void Playmusic(String loc)
    {
    	try {
    		File musicPath=new File(loc);
    		
    		
    		if(musicPath.exists())
    		{
    			AudioInputStream audio=AudioSystem.getAudioInputStream(musicPath);
    			Clip clip=AudioSystem.getClip();
    			clip.open(audio);
    			clip.start();
    		}
    		
    		
    		else {
    			System.out.print("Can't Find the file.");
    			
    		}
    		
    	}
    	catch(Exception e)
    	{
    		System.out.print(e);
    	}
    }
}
