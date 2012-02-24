import flotjf.Chart;
import flotjf.data.PlotData;
import flotjf.options.Axis;
import flotjf.options.Grid;


public class ExampleGraph6 {

	public static String getGraphOptions() {
		Chart chart = new Chart();

		// Enable interaction with grid. (In this case for tooltip)
		Grid grid = new Grid();
		grid.setHoverable(true);
		chart.addGrid(grid);

		Axis yAxis = new Axis();
		chart.addYAxis(yAxis);

		Axis xAxis = new Axis();
		chart.addXAxis(xAxis);
	
		return chart.printChartOptions();
	}
	
	public static String getGraph() {
		PlotData sqrtPlot = new PlotData("sqrt(x)", null);
		PlotData sinPlot = new PlotData("sin(x)*2", null);
		PlotData cosPlot = new PlotData("cos(x)+5", null);

		// Flot use Line as default type. To change the type, just call the helper method use<Type>.
		sinPlot.setBarOptions();
		cosPlot.setPointOptions();

		int i = 0;
		while( i++ < 100 ) {
			sqrtPlot.addPoint(i, Math.sqrt(i));
			sinPlot.addPoint(i, Math.sin(i)*2);
			cosPlot.addPoint(i, Math.cos(i)+5);
		}
	
		Chart chart = new Chart();
		chart.addElements(sqrtPlot);
		chart.addElements(sinPlot);
		chart.addElements(cosPlot);

		return chart.printChart();
	}

}
