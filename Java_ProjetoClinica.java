/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.ArrayList;
import java.util.List;

class Paciente
{
    private String nome;
    private int idade;
    private String sintomas;
    
    public Paciente(String nome, int idade, String sintomas)
    {
        this.nome = nome;
        this.idade = idade;
        this.sintomas = sintomas;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    public String getSintomas()
    {
        return sintomas;
    }
    
    @Override
    public String toString()
    {
        return "Paciente: " + nome + ", Idade: " + idade + ", Sintomas: " + sintomas;
    }
    
}


class Medico
{
    private String nome;
    private String especialidade;
    
    public Medico(String nome, String especialidade)
    {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getEspecialidade()
    {
        return especialidade;
    }
    
    @Override
    public String toString()
    {
        return "Médico: " + nome + ", especialidade: " + especialidade;
    }
    
}

class Clinica
{
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    
    public Clinica()
    {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
    }
    
    public void adicionarPaciente(Paciente paciente)
    {
        pacientes.add(paciente);
    }
    
    public void adicionarMedico(Medico medico)
    {
        medicos.add(medico);
    }
    
    public void listarPacientes()
    {
        System.out.println("Pacientes na clínica: ");
        for (Paciente paciente: pacientes)
        {
            System.out.println(paciente);
        }
            
    }
    
    public void listarMedicos()
    {
        System.out.println("Médicos na clínica: ");
        for (Medico medico: medicos)
        {
            System.out.println(medico);
        }
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
		
		Clinica clinica = new Clinica();
		
		Paciente paciente1 = new Paciente("Maria", 30, "Febre e dor de garganta");
		Paciente paciente2 = new Paciente("João", 25, "Pressão alta");
		Medico medico1 = new Medico("Dr. Silva", "Cardiologista");
		Medico medico2 = new Medico("Dra. Flavia", "Clínica Geral");
		
		clinica.adicionarPaciente(paciente1);
		clinica.adicionarPaciente(paciente2);
		
		clinica.adicionarMedico(medico1);
		clinica.adicionarMedico(medico2);
		
		clinica.listarPacientes();
		clinica.listarMedicos();
		
		
	}
}
