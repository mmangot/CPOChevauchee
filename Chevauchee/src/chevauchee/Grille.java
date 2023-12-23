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
     * Initialise une nouvelle grille de jeu avec le nombre spécifié de lignes et de colonnes.
     *
     * @param p_nbLignes   nombre de lignes souhaité
     * @param p_nbColonnes nombre de colonnes souhaité
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
            matriceCellules[1][2].activerCellule();}
        if (niveau == 1) {
            matriceCellules[1][2].activerCellule();
            matriceCellules[2][0].activerCellule();
        }
        if (niveau == 2) {
            matriceCellules[0][2].activerCellule();
            matriceCellules[2][1].activerCellule();
            matriceCellules[2][3].activerCellule();
    }
        if (niveau == 3) {
            matriceCellules[1][2].activerCellule();
            matriceCellules[2][2].activerCellule();
            matriceCellules[2][4].activerCellule();
            matriceCellules[4][1].activerCellule();
            matriceCellules[4][3].activerCellule();
    }
        if (niveau == 4) {
            matriceCellules[0][2].activerCellule();
            matriceCellules[1][4].activerCellule();
            matriceCellules[2][1].activerCellule();
            matriceCellules[2][2].activerCellule();
            matriceCellules[3][0].activerCellule();
            matriceCellules[3][4].activerCellule();
            matriceCellules[4][2].activerCellule();
    }
        if (niveau ==5) {
            matriceCellules[0][2].activerCellule();
            matriceCellules[0][4].activerCellule();
            matriceCellules[2][1].activerCellule();
            matriceCellules[2][3].activerCellule();
            matriceCellules[2][5].activerCellule();
            matriceCellules[3][3].activerCellule();
            matriceCellules[4][1].activerCellule();
            matriceCellules[4][5].activerCellule();
            matriceCellules[5][3].activerCellule();
    }
        if (niveau == 6) {
            matriceCellules[0][5].activerCellule();
            matriceCellules[1][2].activerCellule();
            matriceCellules[2][2].activerCellule();
            matriceCellules[2][5].activerCellule();
            matriceCellules[3][1].activerCellule();
            matriceCellules[4][3].activerCellule();
            matriceCellules[4][4].activerCellule();
            matriceCellules[5][0].activerCellule();
            matriceCellules[5][2].activerCellule();
            matriceCellules[6][2].activerCellule();
    }
        if (niveau == 7) {
            matriceCellules[0][2].activerCellule();
            matriceCellules[1][5].activerCellule();
            matriceCellules[2][1].activerCellule();
            matriceCellules[2][3].activerCellule();
            matriceCellules[3][0].activerCellule();
            matriceCellules[3][4].activerCellule();
            matriceCellules[3][6].activerCellule();
            matriceCellules[4][2].activerCellule();
            matriceCellules[5][1].activerCellule();
            matriceCellules[5][3].activerCellule();
            matriceCellules[5][5].activerCellule();
            matriceCellules[6][1].activerCellule();
    }
        if (niveau == 8) {
            matriceCellules[0][4].activerCellule();
            matriceCellules[0][6].activerCellule();
            matriceCellules[1][2].activerCellule();
            matriceCellules[1][8].activerCellule();
            matriceCellules[2][0].activerCellule();
            matriceCellules[2][3].activerCellule();
            matriceCellules[2][5].activerCellule();
            matriceCellules[3][2].activerCellule();
            matriceCellules[3][7].activerCellule();
            matriceCellules[4][4].activerCellule();
            matriceCellules[4][5].activerCellule();
            matriceCellules[5][2].activerCellule();
            matriceCellules[5][8].activerCellule();
            matriceCellules[6][4].activerCellule();
            matriceCellules[6][6].activerCellule();
    }
        }

    /**
     * Parcours toutes les cellules de la grille pour les éteindre (à l'aide de la méthode : eteindreCellule)
     */
    public void eteindreToutesLesCases() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCase();
            }
        }
    }
    
 
    /**
     * Vérifie que toutes les cellules sont éteintes
     *
     * @return true si toutes les cellules sont éteintes, false sinon
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
