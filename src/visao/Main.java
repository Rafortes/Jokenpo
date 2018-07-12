package visao;

import controle.JogadaDAO;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        JogadaDAO jDAO = new JogadaDAO();
        
        int op;
        
        do{
            System.out.println("Menu"
                    + "\n1 - Jogar"
                    + "\n2 - Sair");
            op = teclado.nextInt();
            switch(op){
                case 1:
                    System.out.println("Selecione sua jogada"
                            + "\n1 - Pedra"
                            + "\n2 - Papel"
                            + "\n3 - Tesoura");
                    int jogada = teclado.nextInt();
                    
                    if(jDAO.validarJogada(jogada-1)){
                        jDAO.jogar(jogada-1);
                    }else{
                        System.out.println("Essa jogada não existe");
                    }
                break;
                case 2:
                break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
        }while(op != 2);
    }
}
