/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchee;

/**
 *
 * @author manon
 */
public class Grille {
    Case[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    
public int getLignes(){
    return nbLignes;
}

public int getColonnes(){
    return nbColonnes;
}

public void setLignes(int nbLignes){
    this.nbLignes=nbLignes;
}

public void setColonnes(int nbColonnes){
    this.nbColonnes=nbColonnes;
}
    /**
     * Initialise une nouvelle grille de jeu avec le nombre sp�cifi� de lignes et de colonnes.
     *
     * @param p_nbLignes   nombre de lignes souhait�
     * @param p_nbColonnes nombre de colonnes souhait�
     */
    public Grille(int p_nbLignes, int p_nbColonnes,int niv) {
//        niveau=niv;
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        int niveau=niv;
        matriceCellules = new Case[nbLignes][nbColonnes];
        
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new Case();
                matriceCellules[i][j].eteindreCase();
            }
        }
        if (niveau == 0) {
            matriceCellules[0][3].activerCellule();}
        if (niveau == 1) {
            matriceCellules[0][3].activerCellule();
            matriceCellules[2][2].activerCellule();
            matriceCellules[3][0].activerCellule();
        }
        if (niveau == 2) {
            matriceCellules[3][9].activerCellule();
            matriceCellules[2][7].activerCellule();
            matriceCellules[3][5].activerCellule();
            matriceCellules[5][5].activerCellule();
            matriceCellules[4][7].activerCellule();
    }
        }

    /**
     * Parcours toutes les cellules de la grille pour les �teindre (� l'aide de la m�thode : eteindreCellule)
     */
    public void eteindreToutesLesCases() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCase();
            }
        }
    }
    
 
    /**
     * V�rifie que toutes les cellules sont �teintes
     *
     * @return true si toutes les cellules sont �teintes, false sinon
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }



    Case lireCellule(int x, int y) {
        return matriceCellules[x][y];
    }
}
