import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String email;
    protected String senha;
    protected int celular;

    protected float avaliacao;

    public Pessoa(String nome, String email, String senha, int celular, float rating){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.celular = celular;
        this.avaliacao = rating;

    }

    public float avaliar(){
        System.out.println("Qual é a sua avaliação (1 a 5)? ");
        Scanner scanner6 = new Scanner(System.in);
        float rating = scanner6.nextFloat();
        setAvaliacao(rating);
        return rating;



    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public int getCelular(){
        return celular;
    }

    public float getAvaliacao(){
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
}
