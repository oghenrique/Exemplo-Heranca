package br.senai.sp.jandira;

import br.senai.sp.jandira.Model.Jogador;

public class App {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.cadastrarJogador();
        jogador.andar();
    }
}
