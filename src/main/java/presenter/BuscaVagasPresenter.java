package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaVagasView;

/**
 *
 * @author Heloiza
 */
public class BuscaVagasPresenter {

    private BuscaVagasView view;

    public BuscaVagasPresenter(BuscaVagasView view) {
        view = new BuscaVagasView();

        this.view.getBtnInformacoes().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnSolicitarMoradia().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }

}
