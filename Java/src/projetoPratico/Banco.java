package projetoPratico;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // metodos Personalizados

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t.equals("cc")){
            this.setSaldo(50);
        }else if (t.equals("cp")){
            this.setSaldo(150);
        }else {
            System.out.println("Valor invalido!");
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda tem saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta tem debitos pendentes!!!!");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de: " + this.getDono());
        }
        else {
            System.out.println("Impossivel depositar em CONTA FECHADA!!!!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }else {
            System.out.println("Impossivel sacar em CONTA FECHADA!!!!");
        }

    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo().equals("cc")){
            v = 12;
        } else if (this.getTipo().equals("cp")) {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso" + this.getDono());
        }else {
            System.out.println("Impossivel pagar mensalidade em conta fechada!!");
        }
    }

    public Banco(){
        this.setSaldo(0);
        this.setStatus(false);

    }

    public void showBanco(){
        System.out.println("----------------------------------");
        System.out.println("- Conta: " + getNumConta());
        System.out.println("- Tipo: " + getTipo());
        System.out.println("- Dono: " + getDono());
        System.out.println("- Saldo: " + getSaldo());
        System.out.println("- Status: " + getStatus());
        System.out.println("----------------------------------");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
