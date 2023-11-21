
import java.util.ArrayList;

    class Aluno
    {
        private String nome;
        private int idade;
        
        //Construtor
        public Aluno(String nome, int idade)
        {
            this.nome = nome;
            this.idade = idade;
        }
        
        public String getNome()
        {
            return nome;
        }
        
        public void setNome(String nome)
        {
            this.nome = nome;
        }
        
        public int getIdade()
        {
            return idade;
        }
        
        public void setIdade(int idade)
        {
            this.idade = idade;
        }

    }
    
class Main 
{
    
    public static void main(String[] args) // método
    {
        //Criando objetos Aluno
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);
        
        //Criado ArrayList para armazenar objetos Aluno
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        
        for(Aluno aluno : listaAlunos)
        {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
        
        // Criando array de objetos Aluno
        Aluno[] arrayAlunos = new Aluno[2];
        
        arrayAlunos[0] = new Aluno("Carlos", 32);
        arrayAlunos[1] = new Aluno("Ana", 25);
        
        for(Aluno aluno : arrayAlunos)
        {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
    }
    
    
}
