
package Graficos;

import java.util.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Manuel Arias Medina
 */

public class Grafico {
    
    
    public void GenerarGrafico(List<datoGrafico> entrada){
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        /*data.setValue("C", 40);
        data.setValue("Java", 45);
        data.setValue("Python", 15);*/
        
        for(datoGrafico temp : entrada){
            data.setValue(temp.getInfo(), temp.getNumero());
        }
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Ejemplo Rapido de Grafico en un ChartFrame", 
         data, 
         true, 
         true, 
         false);
 
        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("JFreeChart", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
