package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ManterMoradorView;
import view.ManterRepublicaView;
import static view.TelaInicial.Desktop;

/**
 *
 * @author Heloiza
 */
public class ManterRepublicaPresenter {
    private ManterRepublicaView view ;

    public ManterRepublicaPresenter(ManterRepublicaView view) {
        view = new ManterRepublicaView();
        
        
        this.view.getBtnEditar().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
        
        this.view.getBtnExcluir().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnManterMoradores().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                ManterMoradorView a = new ManterMoradorView();
                Desktop.add(a);
                a.setVisible(true);
                
            }    
        });
        
    }
    
    
    
}
