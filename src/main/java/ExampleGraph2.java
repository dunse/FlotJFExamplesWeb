import flotjf.Chart;
import flotjf.data.PlotData;
import flotjf.options.Axis;


public class ExampleGraph2 {

	public static String getGraphOptions() {
		Chart chart = new Chart();
	
		Axis yAxis = new Axis();
		chart.addYAxis(yAxis);

		Axis yAxisRight = new Axis();
		yAxisRight.setPosition("right");
		chart.addYAxis(yAxisRight);

		Axis xAxis = new Axis();
		chart.addXAxis(xAxis);
	
		return chart.printChartOptions();
	}
	
	public static String getGraph() {
		PlotData sinPlot = new PlotData("sin(x)", null);
		PlotData cosPlot = new PlotData("cos(x)+5", null);
		// TODO
		cosPlot.setRightYAxis();

		int i = 0;
		while( i++ < 100 ) {
			sinPlot.addPoint(i, Math.sin(i));
			cosPlot.addPoint(i, Math.cos(i)+5);
		}
	
		Chart chart = new Chart();
		chart.addElements(sinPlot);
		chart.addElements(cosPlot);

		return chart.printChart();
	}

}
