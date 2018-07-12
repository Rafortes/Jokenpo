/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Jogada;
import static org.hamcrest.CoreMatchers.hasItems;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafor
 */
public class JogadaDAOTest {
    
    JogadaDAO jDAO;
    Jogada j;
    
    public JogadaDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jDAO = new JogadaDAO();
        j = new Jogada();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of jogadaNpc method, of class JogadaDAO.
     */
    @Test
    public void testJogadaNpc() {
        String npc = jDAO.jogadaNpc();
        assertThat(j.getJogadas(), hasItems(npc));
    }

    /**
     * Test of validarJogada method, of class JogadaDAO.
     */
    @Test
    public void testValidarJogada() {
        assertTrue(jDAO.validarJogada(2));
        assertFalse(jDAO.validarJogada(4));
        assertFalse(jDAO.validarJogada(-1));
    }

    /**
     * Test of jogar method, of class JogadaDAO.
     */
    @Test
    public void testJogar() {
        String teste = jDAO.jogar(1);
        if(teste.equals("Empate")){
            assertEquals("Empate", teste);
        }else if(teste.equals("Venceu")){
            assertEquals("Venceu", teste);
        }else{
            assertEquals("Perdeu", teste);
        }
    }
    
}
