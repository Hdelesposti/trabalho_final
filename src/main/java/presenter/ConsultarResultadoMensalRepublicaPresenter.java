package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ConsultarResultadoMensalRepublicaView;

/**
 *
 * @author Heloiza
 */
public class ConsultarResultadoMensalRepublicaPresenter {

    private ConsultarResultadoMensalRepublicaView view;

    public ConsultarResultadoMensalRepublicaPresenter(ConsultarResultadoMensalRepublicaView view) {
        view = new ConsultarResultadoMensalRepublicaView();

        this.view.getBtnBuscar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnGrafico().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }

}
