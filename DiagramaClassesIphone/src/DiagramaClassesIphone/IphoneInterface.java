package DiagramaClassesIphone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IphoneInterface {

    private static iPhone meuIPhone = new iPhone();

    public static void main(String[] args) {
        // Cria a janela principal
        JFrame frame = new JFrame("iPhone Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Cria o painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));

        // Botões para as funções
        JButton ligarButton = new JButton("Ligar");
        JButton desligarButton = new JButton("Desligar");
        JButton tocarButton = new JButton("Tocar Música");
        JButton pausarButton = new JButton("Pausar Música");
        JButton selecionarMusicaButton = new JButton("Selecionar Música");
        JButton atenderButton = new JButton("Atender Ligação");
        JButton iniciarCorreioVozButton = new JButton("Correio de Voz");
        JButton exibirPaginaButton = new JButton("Exibir Página");
        JButton adicionarNovaAbaButton = new JButton("Nova Aba");
        JButton atualizarPaginaButton = new JButton("Atualizar Página");

        // Adiciona os botões ao painel
        panel.add(ligarButton);
        panel.add(desligarButton);
        panel.add(tocarButton);
        panel.add(pausarButton);
        panel.add(selecionarMusicaButton);
        panel.add(atenderButton);
        panel.add(iniciarCorreioVozButton);
        panel.add(exibirPaginaButton);
        panel.add(adicionarNovaAbaButton);
        panel.add(atualizarPaginaButton);

        // Adiciona o painel à janela
        frame.add(panel);

        // Adiciona ação aos botões
        ligarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.ligar();
            }
        });

        desligarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.desligar();
            }
        });

        tocarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.tocar();
            }
        });

        pausarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.pausar();
            }
        });

        selecionarMusicaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.selecionarMusica();
            }
        });

        atenderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.atender();
            }
        });

        iniciarCorreioVozButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.iniciarCorreioVoz();
            }
        });

        exibirPaginaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.exibirPagina();
            }
        });

        adicionarNovaAbaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.adicionarNovaAba();
            }
        });

        atualizarPaginaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                meuIPhone.atualizarPagina();
            }
        });

        // Torna a janela visível
        frame.setVisible(true);
    }
}
