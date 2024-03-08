package Aula07;

import javax.swing.*;

public class Aula07 {
    public static void main(String[] args){



        Lutador l[] = new Lutador[6];
                l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,68.9f, 11,2,1);
                l[1] = new Lutador("Putscript" , "Brasil", 29, 1.68f, 57.8f, 14,2,3);

        l[0].apresentar();
        l[1].status();
        for(int i = 2; i < l.length; i++){
            l[i] = new Lutador(JOptionPane.showInputDialog(null,"nome"),JOptionPane.showInputDialog(null,"Pais"),
                    Integer.parseInt(JOptionPane.showInputDialog(null,"idade")),
                    Float.parseFloat(JOptionPane.showInputDialog(null,"Altura")),
                    Float.parseFloat(JOptionPane.showInputDialog(null,"Peso")),
                    Integer.parseInt(JOptionPane.showInputDialog(null,"vitoria")),
                    Integer.parseInt(JOptionPane.showInputDialog(null,"derrota")),
                    Integer.parseInt(JOptionPane.showInputDialog(null,"empate")));
        }

        for (int i = 0; i < l.length; i++){
            l[i].apresentar();
        }
    }
}
