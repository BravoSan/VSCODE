import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui1 extends JFrame {
    private static final long serialVersionUID = 1L;

    public gui1() {
        super("Cálculadora Proporcional");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        ImageIcon icon = new ImageIcon("");
        JLabel labelImage = new JLabel(icon);
        getContentPane().add(labelImage);

        getContentPane().add(new JLabel("Valor da mensalidade:"));
        final JTextField cpf = new JTextField(20);
        getContentPane().add(cpf);

        getContentPane().add(new JLabel("Dias do mês:"));
        final JTextField nome = new JTextField(20);
        getContentPane().add(nome);

        getContentPane().add(new JLabel("Dias utilizados:"));
        final JTextField idade = new JTextField(20);
        getContentPane().add(idade);

        JTextArea info = new JTextArea(5, 20);
        info.setEditable(false);
        info.setLineWrap(true);
        info.setWrapStyleWord(true);

        JPanel panel = new JPanel(new FlowLayout());

        final JButton btCadastrar = new JButton("Calcular");
        btCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                info.setText(
                        nome.getText() +
                                ", com CPF numero " +
                                cpf.getText() +
                                ", com " +
                                idade.getText() +
                                " anos, se encontra devidamente matriculado no curso ");
            }
        });
        panel.add(btCadastrar);

        final JButton btCancelar = new JButton("Cancelar");
        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cpf.setText("");
                nome.setText("");
                idade.setText("");
                info.setText("");
            }
        });
        panel.add(btCancelar);

        getContentPane().add(panel);

        getContentPane().add(new JScrollPane(info));

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new gui1();
    }
}
