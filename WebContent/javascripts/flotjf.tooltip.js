function showTooltip(x, y, contents) {
	$('<div id="tooltip">' + contents + '</div>').css({
		position : 'absolute',
		display : 'none',
		top : y + 5,
		left : x + 5,
		border : '1px solid #fdd',
		padding : '2px',
		'background-color' : '#fee',
		opacity : 0.80
	}).appendTo("body").fadeIn(200);
}

var previousPoint = null;
function useTooltip() {
	$("#placeholder").bind(
			"plothover",
			function(event, pos, item) {
				$("#x").text(pos.x.toFixed(2));
				$("#y").text(pos.y.toFixed(2));
	
				if (item) {
					if (previousPoint != item.dataIndex) {
						previousPoint = item.dataIndex;
	
						$("#tooltip").remove();
						var x = item.datapoint[0].toFixed(2), y = item.datapoint[1]
								.toFixed(2);
	
						showTooltip(item.pageX, item.pageY, item.series.label
								+ " of " + x + " = " + y);
					}
				} else {
					$("#tooltip").remove();
					previousPoint = null;
				}
		});
}