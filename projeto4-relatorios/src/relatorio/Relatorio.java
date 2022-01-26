
package relatorio;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio {
    public Relatorio(String titulo, InputStream inputStream, Map parametros, Connection conexao) {
        
        try {
            JasperReport report = (JasperReport) JRLoader.loadObject(inputStream);
            JasperPrint print = JasperFillManager.fillReport(report, parametros, conexao);
            JasperViewer jrviewer = new JasperViewer(print, false);   
            jrviewer.setVisible(true);
            jrviewer.toFront();
        } catch (JRException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
