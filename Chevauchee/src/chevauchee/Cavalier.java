/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchee;

/**
 *
 * @author manon
 */
public class Cavalier {
      int posX;
    int posY;
    
    public Cavalier (int debX, int debY){
        this.posX=debX;
        this.posY=debY;
    }
    
    public int PositionX (){
        return posX;
    }
    
     public int PositionY (){
        return posY;
    }
     
     public void deplacement(int nouvX, int nouvY){
         this.posX=nouvX;
         this.posY=nouvY;
     }
    
}


