package projetoPratico;

public class main {

    public static void main(String[] args){

        Banco p1 = new Banco();
        p1.setNumConta(1);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");

        Banco p2 = new Banco();
        p2.setNumConta(2);
        p2.setDono("Creuza");
        p2.abrirConta("cp");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();

        p1.showBanco();
        p2.showBanco();
    }

}
