<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url: "k.weather.get",
			success: function(www) {
				let ar = [];
				let hourTh= $("<th></th>").text("시간");
				let tempTh= $("<th></th>").text("기온");
				let wfKorTh= $("<th></th>").text("날씨");
				
				let trr = $("<tr></tr>").append(hourTh, tempTh, wfKorTh);
				
				$("table").append(trr);
				
				$(www).find("data").each(function(i, d) {
					let hour = $(d).find("hour").text();
					let temp = $(d).find("temp").text();
					let wfKor = $(d).find("wfKor").text();
					
					let td1 = $("<td></td>").text(hour);
					let td2 = $("<td></td>").text(temp);
					let td3 = $("<td></td>").text(wfKor);
					
					let tr = $("<tr></tr>").append(td1, td2, td3);
					
					$("table").append(tr);
					
					ar[i] = {label: hour , y: temp * 1};
				});
				var chart = new CanvasJS.Chart("chartContainer", {
					animationEnabled: true,
					theme: "light2",
					title:{
						text: "Simple Line Chart"
					},
					data: [{        
						type: "line",
				      	indexLabelFontSize: 16,
						dataPoints: ar
					}]
				});
				chart.render();
				
			}
		});
	
	});
</script>
</head>
<body>
	<div id="chartContainer" style="height: 370px; width: 100%;"></div>
	<hr>
	<table border="1"></table>
</body>
</html>































