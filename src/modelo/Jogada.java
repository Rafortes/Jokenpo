/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafor
 */
public class Jogada {
    
    public static List<String> jogadas = new ArrayList<>();

    public Jogada() {
        preencherJogadas();
    }

    public void preencherJogadas(){
        jogadas.add("Pedra");
        jogadas.add("Papel");
        jogadas.add("Tesoura");
    }
    
    public List<String> getJogadas() {
        return jogadas;
    }
    
}
