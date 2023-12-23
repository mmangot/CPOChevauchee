/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchee;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
/**
 *
 * @author manon
 */
public class CaseGraphique extends JButton {
    
    int largeur;
    int longeur;
    Case CaseLumineuse;
    private int coordX;
    private int coordY;
    
    public CaseGraphique(Case CaseLum, int largeur, int Hauteur){
        this.largeur=largeur;
         this.longeur=Hauteur;     
         this.CaseLumineuse=CaseLum;
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (CaseLumineuse.estEteint()){
            g.setColor(Color.black);
        }
        else{
            g.setColor(Color.yellow);
        }
        g.fillRect(4, 4, largeur,longeur);
        
    this.setText(CaseLumineuse.toString());
        if (CaseLumineuse.cavalierHere==true){
            g.setColor(Color.green);
        g.fillRect(4, 4, largeur, longeur);
        }}
    
    public int getCoordX(){
        return coordX;
    }
    
      public int getCoordY(){
        return coordY;
    }
      
      public void defCoordX(int x){
          this.coordX=x;
      }
        
        public void defCoordY(int y){
          this.coordY=y;
      }
}
