/////*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

import java.awt.Font;
import processing.core.*;

/**
 *
 * @author savindu
 */
public class NewClass extends PApplet {
   public static void main(String[] args) {
       PApplet.main(new String[]{"stopwatch.NewClass"});  
    } 
public void settings(){
    size(300, 300);
   
}
   
   
public void setup(){
    
}
int t = 0;
long t1 = millis();
int seconds =0; int minutes = 0;int hours =0;
public void draw(){
     background(0, 0, 0);
      textFont(new PFont(new Font("Agency FB", Font.BOLD, 80), true));
      text(hours+":"+minutes+":"+seconds,75,100);
      textFont(new PFont(new Font("Agency FB", Font.BOLD, 45), true));
      text("Start",0,200);
      text("Stop",210,200);
      text("Reset",105,200);
        if(t==1){
         if(millis() - t1 >= 1000){
           seconds = seconds+1;
           t1 =millis();
           System.out.println(hours+":"+minutes+":"+seconds);
            

         }
         if(seconds>=60){
            minutes = minutes + 1;
            seconds = 0;
            System.out.print(minutes);
         }
         if(minutes>=60){
             hours = hours + 1;
             minutes = 0;
         }
        }
}
public void mousePressed(){
   if (mouseX>210 && mouseX <300){
       if(mouseY>150 && mouseY<250){
           t=2;    
       }}
       
       
    if (mouseX>105 && mouseX <195){
       if(mouseY>150 && mouseY<250){
          seconds=0;minutes=0;hours=0;
       }}
       
       
       
    
   if (mouseX>0 && mouseX <90){
       if(mouseY>150 && mouseY<250){
           t=1;
       }}
       
   } 
   

}
