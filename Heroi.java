package Desafio6tres;

public class Heroi {

    private String nome;
    private int idade;
    private String classificação;

    public Heroi(String nome, int idade, String classificação) {
        this.nome = nome;
        this.idade = idade;
        this.classificação = classificação;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getClassificação() {
        return classificação;
    }

    public void setClassificação(String classificação) {
        this.classificação = classificação;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", Idade: " + idade + ", Classificação: " + classificação;
    }
}
