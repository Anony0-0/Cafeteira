package telas;
import enums.TiposCafes;
import saboresCafes.Cafes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.Timer;

public class TelaCafeteira extends JFrame {
    public TelaCafeteira(){
        this.setTitle("Cafeteira");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(1000,900); this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);

        JLabel selecaoCafe = new JLabel("Selecione seu café de preferência");
        selecaoCafe.setBounds(400,0,250,60);
        selecaoCafe.setToolTipText("Só para teste");

        JPanel terminal = new JPanel();
        terminal.setBackground(Color.black);
        terminal.setBounds(125,305,750,90);
        terminal.setLayout(new BorderLayout());

        JLabel textoTerminal = new JLabel("Escolha um café");
        textoTerminal.setForeground(Color.white);
        textoTerminal.setHorizontalAlignment(JLabel.CENTER);

        terminal.add(textoTerminal);

        JLabel teste = new JLabel("café");
        teste.setVerticalAlignment(JLabel.CENTER);
        teste.setHorizontalAlignment(JLabel.CENTER);

        JPanel xicaraCafe = new JPanel();
        xicaraCafe.setLayout(new BorderLayout());
        xicaraCafe.setBackground(Color.orange);
        xicaraCafe.setBounds(330,510,340,340);
        xicaraCafe.add(teste, BorderLayout.CENTER);

        JPanel cafes = new JPanel();
        cafes.setLayout(new GridLayout(3,2));
        cafes.setBounds(530,120,300,150);
        cafes.setBackground(Color.green);

        this.add(terminal);
        this.add(xicaraCafe);
        this.add(cafes);
        this.add(selecaoCafe);

        JButton espressoB = new JButton("Espresso");
        espressoB.setBounds(350,50,100,60);
        espressoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cafes cafeEspresso = new Cafes();
                List<String> passos = cafeEspresso.prepararBase(TiposCafes.ESPRESSO);
                animarTerminal(passos,textoTerminal);
            }
        });

        JButton cafeLeite = new JButton("Café com Leite");
        cafeLeite.setBounds(450,50,100,60);
        cafeLeite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cafes cafeComLeite = new Cafes();
                List<String> passos = cafeComLeite.prepararBase(TiposCafes.CAFECOMLEITE);
                animarTerminal(passos,textoTerminal);
            }
        });

        JButton mochaB = new JButton("Mocha");
        mochaB.setBounds(350,120,100,60);
        mochaB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cafes mocha = new Cafes();
                List<String> passos = mocha.prepararBase(TiposCafes.MOCHA);
                animarTerminal(passos,textoTerminal);
            }
        });

        JButton capuccinoB = new JButton("Cappucino");
        capuccinoB.setBounds(450,120,100,60);
        capuccinoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cafes capuccino = new Cafes();
                List<String> passos = capuccino.prepararBase(TiposCafes.CAPPUCINO);
                animarTerminal(passos,textoTerminal);
            }
        });

        JButton latteB = new JButton("Latte");
        latteB.setBounds(350,190,100,60);
        latteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cafes latte = new Cafes();
                List<String> passos = latte.prepararBase(TiposCafes.LATTE);
                animarTerminal(passos,textoTerminal);
            }
        });

        JButton outroCafe = new JButton("Café");
        outroCafe.setBounds(450,190,100,60);
        outroCafe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cafes cafeEspresso = new Cafes();
                textoTerminal.setText("Opção a adicionar");
            }
        });

        cafes.add(espressoB);
        cafes.add(cafeLeite);
        cafes.add(mochaB);
        cafes.add(capuccinoB);
        cafes.add(latteB);
        cafes.add(outroCafe);

        JPanel fundo = new JPanel();
        fundo.setBackground(Color.darkGray); fundo.setBounds(0,0,1000,900);
        this.add(fundo);
        this.setVisible(true);
    }

    private void animarTerminal(List<String> passos, JLabel textoTerminal){
        final int [] indiceFrase = {0};
        final int [] pontinhos = {0};

        Timer timer = new Timer(350, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (indiceFrase[0] >= passos.size()){
                    ((Timer)e.getSource()).stop();
                    return;
                }

                String fraseAtual = passos.get(indiceFrase[0]);

                if (indiceFrase[0] == passos.size() - 1) {
                    textoTerminal.setText(fraseAtual);
                    indiceFrase[0]++;
                    return;
                }

                if (pontinhos[0] == 0) {
                    textoTerminal.setText(fraseAtual);
                    pontinhos[0]++;
                } else if (pontinhos[0] <= 3) {
                    textoTerminal.setText(textoTerminal.getText() + " .");
                    pontinhos[0]++;
                } else {
                    pontinhos[0] = 0;
                    indiceFrase[0]++;
                }
            }
        });
        timer.start();
    }
}



