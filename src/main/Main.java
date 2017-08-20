package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import compilador.ASTDisplay;
import compilador.ASTPrinter;
import compilador.node.Start;
import compilador.parser.Parser;
import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.Token;


class Main {
	
	public static void main(String args[]) {
		String arquivo = "";
		if (args.length == 0)
			arquivo = System.getProperty("user.dir") + "/teste/progTest3";
		else
			arquivo = args[0];
		
		BufferedReader br = null;		
		
		try {						
			br = new BufferedReader(new FileReader(arquivo));
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		Lexer l = new Lexer(new PushbackReader(br));
		Token t = null;
		String erros = "";
		
		System.out.println("Analise Lexica:");
		
		while (true){
			try{
				t = l.next();
			} catch (LexerException e){
				erros += e+"\n";
				continue;
			} catch (IOException e) {
				erros += e+"\n";
				continue;
			}
			
			// sai do loop
			if (t.getText().equals(""))
				break;
			
			Integer lenId = t.getClass().toString().split(" ")[1].split("\\.").length-1;
			String id = t.getClass().toString().split(" ")[1].split("\\.")[lenId];

		
			if(id.equals("TIdentacao"))
				System.out.print(t.getText());
			else if(id.equals("TEspaco"))
				System.out.print(" ");
			else if(id.equals("TQuebra"))
				System.out.println();
			else if(id.equals("TCharIgnored"))
				System.out.print("");
			else
				System.out.print(id + "("+t.getText()+")");
			
			// dá um 'enter'
			//if (id.equals("TQuebra"))
				//System.out.println();
			
		}
		
		System.out.println("\n\nAnalise Sintatica:");
		Parser p =
				new Parser(
						new Lexer(
								new PushbackReader(  
										new FileReader(arquivo), 1024))); 
		
		Start tree = p.parse();
		tree.apply(new ASTDisplay());
		tree.apply(new ASTPrinter());
		
		
		System.out.println("");
		if (!erros.trim().isEmpty())
			System.out.println(erros);
		
	 }
}
