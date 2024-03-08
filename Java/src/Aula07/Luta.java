package Aula07;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.isAprovada()){
            System.out.println("#### DESAFIADO ####");
            this.desafiado.apresentar();
            System.out.println("#### DESAFIATE ####");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            switch (vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLutar();
                    this.desafiante.empatarLutar();
                    break;
                case 1:
                    System.out.println("Vitoria de " + this.getDesafiado());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria de " + this.getDesafiante());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        }else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
