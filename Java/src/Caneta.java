public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Esta tampada: " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não foi possivel rabiscar!! Caneta tampada");
        }
        else {
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
