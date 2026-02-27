package telas;
import javax.swing.*;
import java.awt.*;

//A "TelaCafeteira" é extensão de Jframe, ou seja, uma janela
public class TelaCafeteira extends JFrame {
    public TelaCafeteira(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBounds(400,100,1000,900);
        this.setLayout(null);

        //Botões de café
        JButton espressoB = new JButton("Espresso");
        espressoB.setBounds(350,50,100,60);

        JButton cafeLeite = new JButton("Café com Leite");
        cafeLeite.setBounds(450,50,100,60);

        JButton mochaB = new JButton("Mocha");
        mochaB.setBounds(350,120,100,60);

        JButton capuccinoB = new JButton("Cappucino");
        capuccinoB.setBounds(450,120,100,60);

        JButton latteB = new JButton("Latte");
        latteB.setBounds(350,190,100,60);

        //Ficou faltando espaço pra um café que eu não adicionei ainda, 
        JButton outroCafe = new JButton("Café");
        outroCafe.setBounds(450,190,100,60);

/*antes eu tinha feito essa tela no arquivo Main, e estava definido um método Jframe chamado Cafeteira, que para adicionar os botões, estava cafeteira.add(espressoB)
como foi criado um objeto do tipo TelaCafeteira, foi necessário a troca para o this, indicando que é dentro do objeto, TelaCafeteira, que os métodos devem ser
adicionados.*/    
        this.add(espressoB);
        this.add(cafeLeite);
        this.add(mochaB);
        this.add(capuccinoB);
        this.add(latteB);
        this.add(outroCafe);
        
    }
}
