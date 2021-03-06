<%
String exampleId = request.getParameter("id");
String poll = request.getParameter("poll");
String tooltip = request.getParameter("tooltip");
if (exampleId == null) {
	exampleId = "1";
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FlotJF Example <%=exampleId %></title>
<link rel="stylesheet" media="screen" href="stylesheets/main.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!--[if lte IE 8]><script src="javascripts/flot/excanvas.min.js" type="text/javascript" charset="UTF-8"></script><![endif]-->
<script src="javascripts/flot/jquery.flot.js" type="text/javascript" charset="UTF-8"></script>
<script src="javascripts/flotjf.tooltip.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body id="example">
<h2>Example <%=exampleId %></h2>
<div id="placeholder" style="width:95%;height:400px;" ></div>
<script type="text/javascript">
<!--
   <% if (tooltip != null) { %>
	useTooltip();
   <% } %>
   var data = [], totalPoints = 300;
	    function getGraph() {
	    	$.post('GetGraph',{example: <%=exampleId %>},
	    			function(response) {
	    				data = response
	    				} )
	    	return data;
	    }

    // setup plot
    var options = [];
    var updateInterval = 3000;

	$.ajaxSetup({async:false});
    $.post('GetGraphOptions',{example: <%=exampleId %>},
			function(response) {
    			options = response
				} )
    
	var plot = $.plot($("#placeholder"), getGraph(), options);
    function update() {
        plot.setData(getGraph());
        plot.setupGrid();
        plot.draw();
        
        <% if (poll != null) { %>
        setTimeout(update, updateInterval);
        <% } %>
    }

    update();
    $.ajaxSetup({async:true});

//-->
</script>
</body>
</html>