/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchee;

/**
 *
 * @author manon
 */
public class Case {
    private int etat;
     boolean cavalierHere=false;
   
    /**
     *initialise l'etat de la cellule a false (eteinte)
     * 
     */
    public Case() {
        this.etat = 1;
    }
    
    /**
     *permet d'inverser l'état actuel de la cellule
     */
    public void activerCellule(){
      if (etat==1){
          etat=2;
      }
      else {
          etat=1;
      }
  }


    /**
     *permet d'éteindre une cellule si celle ci est allumée
     */
    public void eteindreCase(){
           if (etat==2){
               etat=1;
           }   
      }
  
public boolean estEteint(){
    if (etat==1){
        return true;}
    else {
        return false;
    }}
   
     public boolean estAllumée(){
    if (etat==2){
        return true;}
    else {
        return false;
    }}
     
        public int getEtat(){
        return etat;
    }}

    

