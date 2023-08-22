/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import javax.swing.*;

public class Main
{
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Exemplo de Interface Gráfica");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Criar um botão
		JButton button = new JButton("Clique aqui");
		
		// Adicionar o botão à janela
		frame.getContentPane().add(button);
		
		// Configurar o tamanho da janela
		frame.setSize(300, 200);
		
		// Exibir a janela
		frame.setVisible(true);
		
		
	}
}
