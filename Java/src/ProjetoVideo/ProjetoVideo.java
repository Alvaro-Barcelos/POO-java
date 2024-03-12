package ProjetoVideo;

public class ProjetoVideo {
    public static void main(String[] args){

        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 10 de PHP");
        v[2] = new Video("Aula 07 de Java");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu" , 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza" , 23, "F", "creuzita");

        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(g[0], v[2]);
        visu[0].avaliar();
        System.out.println(visu[0].toString());

        visu[1] = new Visualizacao(g[0], v[1]);
        System.out.println(visu[1].toString());

        System.out.println(v[0].toString());
        System.out.println(g[1].toString());
    }
}
