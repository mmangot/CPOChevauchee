/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chevauchee;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author manon
 */

public class Partie extends javax.swing.JFrame {
//grilleJeu Partie=new Partie();
Grille grille;
int nbLignes=0;
int nbColonnes=0;
Cavalier cavalier=new Cavalier (0,0);
int niveau;
List<CaseGraphique> boutons = new ArrayList<>();

    /**
     * Creates new form Partie
     */
    public Partie(int nbLigne, int nbColonne, int niv) {
        initComponents();
        int nbLignes = nbLigne;
        int nbColonnes = nbColonne;
        niveau=niv;
        System.out.println(niveau);
        this.grille=new Grille (nbLignes,nbColonnes,niveau);
        panneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
//        jLabel1.setText("");
//        jLabel2.setText("");
        
        
        for (int i=0; i < nbLignes; i++) {
          for (int j=0; j < nbColonnes; j++ ) {
              CaseGraphique bouton_cellule=new CaseGraphique(grille.lireCellule(i,j),36,36);
//          JButton bouton_cellule = new JButton(); // cr�ation d'un bouton
          bouton_cellule.defCoordX(i);
          bouton_cellule.defCoordY(j);
          panneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
          boutons.add(bouton_cellule);
//          panneauGrille.add(bouton_cellule);
 }
 
}
        
        if (niveau==0){
            cavalier.deplacement(1, 1);
        }
        if (niveau==1){
            cavalier.deplacement(1, 1);
            grille.matriceCellules[1][1].cavalierHere=true;
        }
        if (niveau==2){
            cavalier.deplacement(3, 4);
             grille.matriceCellules[3][4].cavalierHere=true;
        }
        
 for (CaseGraphique bouton:boutons){
     bouton.addActionListener(new ActionListener(){
     @Override
     
     public void actionPerformed(ActionEvent e){
         CaseGraphique clic =(CaseGraphique)e.getSource();
         int x=clic.getCoordX();
         int y=clic.getCoordY();
         int deltax=Math.abs(x-cavalier.PositionX());
         int deltay=Math.abs(y-cavalier.PositionY());
         boolean dplcmt=(deltax==1&&deltay==2)||(deltax==2&&deltay==1);
         
         if (dplcmt){
             Case casee = grille.lireCellule(x,y);
         if(casee.estEteint()){
             FenetrePerdue perdu = new FenetrePerdue();
             perdu.setVisible(true);
             casee.activerCellule();
         }else{
             casee.eteindreCase();
         }
         grille.matriceCellules[cavalier.PositionX()][cavalier.PositionY()].cavalierHere=false;
         panneauGrille.repaint();
         cavalier.deplacement(x, y);
         grille.matriceCellules[x][y].cavalierHere=true;
         
//         if(niveau==1&&grille.cellulesToutesEteintes()==true ||niveau==2&&grille.cellulesToutesEteintes()||niveau==3&&grille.cellulesToutesEteintes()=true){
             
             
         
         }
     }
 });

  getContentPane().add(panneauGrille,new org.netbeans.lib.awtextra.AbsoluteConstraints(110,20,nbColonnes*40,nbLignes*40));
    this.pack();
     this.revalidate();
 }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauGrille = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneauGrille.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panneauGrilleLayout = new javax.swing.GroupLayout(panneauGrille);
        panneauGrille.setLayout(panneauGrilleLayout);
        panneauGrilleLayout.setHorizontalGroup(
            panneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panneauGrilleLayout.setVerticalGroup(
            panneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(panneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 68, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//  public static void main(String args[]) {
//
//       
//
//        try {
//
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//
//                if ("Nimbus".equals(info.getName())) {
//
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//
//                    break;
//
//                }
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//
//            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (InstantiationException ex) {
//
//            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (IllegalAccessException ex) {
//
//            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//
//            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        }
//
//        //</editor-fold>
//
// 
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//
//                new FenetrePrincipale(4).setVisible(true);
//
//            }
//
//        });
//
//    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panneauGrille;
    // End of variables declaration//GEN-END:variables
}
