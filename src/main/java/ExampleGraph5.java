import flotjf.Chart;
import flotjf.data.PlotData;
import flotjf.options.Axis;
import flotjf.options.graphseries.Colors;
import flotjf.options.graphseries.color.Gradient;


public class ExampleGraph5 {

	public static String getGraphOptions() {
		Chart chart = new Chart();
	
		Axis yAxis = new Axis();
		chart.addYAxis(yAxis);

		Axis xAxis = new Axis();
		chart.addXAxis(xAxis);

		return chart.printChartOptions();
	}
	
	public static String getGraph() {
		PlotData sqrtPlot = new PlotData("sqrt(x)", null);

		// Flot use Line as default type. To change the type, just call the helper method use<Type>.
		sqrtPlot.setBarOptions();
		sqrtPlot.getBars().setBarWidth(0.8);
		sqrtPlot.getBars().setLineWidth(0);
		Colors colors = new Colors("#afefef", "#ff5522","#afefef");
		colors.setColors(new Gradient(0.8,null), new Gradient(0.1, null));
		sqrtPlot.getBars().setFillColor(colors);

		int i = 0;
		while( i++ < 10 ) {
			sqrtPlot.addPoint(i, Math.sqrt(i));
		}
	
		Chart chart = new Chart();
		chart.addElements(sqrtPlot);

		return chart.printChart();
	}

}
