/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author William
 */
public class CPU {
    Random random = new Random();
    String[] opcoesDeJogada = {"Pedra", "Papel", "Tesoura"};
    String cpuHand;
    int numMao;

    public int getNumMao() {
        return numMao;
    }

    public void setNumMao(int numMao) {
        this.numMao = numMao;
    }

    
    
    public String getCpuHand() {
        return cpuHand;
    }

    public void setCpuHand(String cpuHand) {
        this.cpuHand = cpuHand;
    }
    
    public String escolherMao(){
        setNumMao(random.nextInt(99)%3);
        setCpuHand(opcoesDeJogada[getNumMao()]);
        return getCpuHand();
    }
    
    public String defCPU(String caminho){
        if(escolherMao() == "Pedra"){
            caminho = "C:\\Users\\William\\Desktop\\IFSP\\2 Semestre\\LP2 - Linguagem de Programação 2\\Programas em Java\\Jokenpo\\src\\Imagens\\Pedra.png";
        }
        else if(escolherMao() == "Papel"){
            caminho = "C:\\Users\\William\\Desktop\\IFSP\\2 Semestre\\LP2 - Linguagem de Programação 2\\Programas em Java\\Jokenpo\\src\\Imagens\\Papel.png";
        }
        else{
            caminho = "C:\\Users\\William\\Desktop\\IFSP\\2 Semestre\\LP2 - Linguagem de Programação 2\\Programas em Java\\Jokenpo\\src\\Imagens\\Tesoura.png";
        }
        return caminho;
    }
    
}