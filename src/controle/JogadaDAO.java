/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Random;
import modelo.Jogada;

/**
 *
 * @author rafor
 */
public class JogadaDAO {
    
    Jogada j = new Jogada();
    
    public String jogadaNpc(){
        Random r = new Random();
        int index = r.nextInt(j.getJogadas().size());
        String jogada = j.getJogadas().get(index);
        return jogada;
    }
    
    public boolean validarJogada(int jogada){
        if(jogada > 2 || jogada < 0){
            return false;
        }
        return true;
    }
    
    public String jogar(int jogada){
        String jogadaJogador = j.getJogadas().get(jogada);
        String jogadaNpc = jogadaNpc();
        if(jogadaJogador.equals(jogadaNpc)){
            System.out.println("Empate"
                    + "\nJogador: "+jogadaJogador
                    + "\nComputador: "+jogadaNpc+"\n");
            return "Empate";
        }else if(jogadaJogador.equals("Pedra") && jogadaNpc.equals("Tesoura") 
                || jogadaJogador.equals("Papel") && jogadaNpc.equals("Pedra")
                || jogadaJogador.equals("Tesoura") && jogadaNpc.equals("Papel")){
            System.out.println("Você venceu!!"
                    + "\nJogador: "+jogadaJogador
                    + "\nComputador: "+jogadaNpc+"\n");
            return "Venceu";
        }else{
            System.out.println("Você perdeu!!"
                    + "\nJogador: "+jogadaJogador
                    + "\nComputador: "+jogadaNpc+"\n");
            return "Perdeu";
        }
    }
}
