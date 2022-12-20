import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.io.Serial;

import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class GraphComponent extends ApplicationFrame
{
    @Serial
    private static final long serialVersionUID = 4L;
    String title;

    // Собст-но рисование графиков
    public GraphComponent(final String title, int type, boolean flag) {
        super(title);
        this.title = title;
        if (type == 1) {
            final CategoryDataset dataset = Dataset.createDatasetArraylistMed();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
        else if (type == 2) {
            final CategoryDataset dataset = Dataset.createDatasetArraylistSum();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
        else if (type == 3) {
            final CategoryDataset dataset = Dataset.createDatasetHashmapMed();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
        else if (type == 4) {
            final CategoryDataset dataset = Dataset.createDatasetHashmapSum();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
    }
    private JFreeChart createChart(final CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createLineChart(
                 title,
                null,
                "Значение",
                 dataset,
                 PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        chart.setBackgroundPaint(Color.white);
        final CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.darkGray);
        plot.setRangeGridlinePaint(Color.black);

        // customise the range axis...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setAutoRangeIncludesZero(true);

        // customise the renderer...
        final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();

        renderer.setSeriesStroke(
                0, new BasicStroke(
                        2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                        1.0f, new float[] {10.0f, 6.0f}, 0.0f
                )
        );
        renderer.setSeriesStroke(
                1, new BasicStroke(
                        2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                        1.0f, new float[] {6.0f, 6.0f}, 0.0f
                )
        );
        return chart;
    }
}
