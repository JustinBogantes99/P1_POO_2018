
package proyecto1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Manuel Arias Medina
 */
public class GraficoBarras extends JFrame{
    JPanel panel;
    public GraficoBarras(){
        setTitle("Grafico de top 5 Choferes");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }

    private void init() {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(8, "Chofer", "chofer 1");
        dataset.setValue(9, "Chofer", "chofer 2");
        dataset.setValue(4, "Chofer", "chofer 3");
        dataset.setValue(8, "Chofer", "chofer 4");
        dataset.setValue(7, "Chofer", "chofer 5");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart
        ("Top 5 Choferes","Choferes", "Cantidad de Viajes", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setRangeGridlinePaint(Color.red); 
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    
    public static void main(String args[]){
        new GraficoBarras().setVisible(true);
    }
}
