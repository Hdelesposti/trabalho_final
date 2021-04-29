package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ListarReceitasView;

/**
 *
 * @author Heloiza
 */
public class ListarSugestaoPresenter {

    private ListarReceitasView view;
    
    public ListarSugestaoPresenter(ListarReceitasView view) {
        view = new ListarReceitasView();
        
        this.view.getBtnEditar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnEstorno().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }            
        });
        
        this.view.getBtnInformacoes().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }            
        });
        
        this.view.getBtnNovaReceita().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }            
        });
    }
    
}
