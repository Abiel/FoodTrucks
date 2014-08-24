<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="taglib.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../assets/ico/favicon.png">
<link href='http://fonts.googleapis.com/css?family=Lato:100' rel='stylesheet' type='text/css'>

<title>Food Trucks | SF</title>

<!-- Bootstrap core CSS -->
<link
	href='<spring:url value="/resources/css/bootstrap3/css/bootstrap.css" />'
	rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href='<spring:url value="/resources/css/carousel.css" />'
	rel="stylesheet">

<style type="text/css">
html {
	height: 100%
}

body {
	height: 100%;
	margin: 0;
	padding: 0
}

#map-canvas {
	height: 100%
}

#foodTruckPanel {
	left: 70%;
	width: 450px;
	position: absolute;
	margin-right: 100px;
	top: 5%;
	background-color: gray;
	height: 700px !important;
	padding-left: 20px;
	padding-right: 20px;
	z-index: 100;
	overflow: scroll;
}
</style>

<script type="text/javascript"
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBX-yaWdHUBf09oEty4xSC3X22NsN7HleA">
	
</script>

<script type="text/javascript">
	var truckMarkers = new Array();
	<c:forEach var="truck" varStatus="status" items="${truckList}" >
	truckMarkers[<c:out value="${status.index}" />] = new google.maps.LatLng(
			<c:out value="${truck.latitude}" />,
			<c:out value="${truck.longitude}" />);
	</c:forEach>

	function loadTruckMarkers(currentMap) {
		for (i = 0; i < truckMarkers.length; i++) {
			var marker = new google.maps.Marker({
				position : truckMarkers[i],
				map : currentMap,
				title : 'Truck: '
			});
		}
	}

	function loadAddressMarker(currentMap) {
		var marker = new google.maps.Marker({
			map : currentMap,
			position : new google.maps.LatLng(
					<c:out value="${address.latitude}" />,
					<c:out value="${address.longitude}" />),
			title : 'You are here.'
		});

		// Add circle overlay and bind to marker
		var circle = new google.maps.Circle({
			map : currentMap,
			radius : 360, // 0.003 degrees in metres (assuming 1'=111km)
			fillColor : '#0000AA',
			strokeColor : '#7777EE',
			strokeWeight : 2,
			strokeOpacity : 0.5
		});
		circle.bindTo('center', marker, 'position');
	}

	function initialize() {

		var mapOptions = {
			center : new google.maps.LatLng(37.7801490737255, -122.422258184604),
			zoom : 14
		};
		var map = new google.maps.Map(document.getElementById("map-canvas"),
				mapOptions);
		loadTruckMarkers(map);
		loadAddressMarker(map);
	}
	google.maps.event.addDomListener(window, 'load', initialize);
</script>

</head>
<body>
	<div id="map-canvas"></div>
	<div id="content" style="opacity: 0.96;filter: alpha(opacity=96);">
		<div id="foodTruckPanel">
			<div style="font-family: 'Lato', sans-serif; font-size: 70px; color:#ffffff; text-shadow: 4px 4px 4px #111;"> Food Trucks</div>

			<!-- Search Form -->
			<form:form method="POST" action="welcome.htm">
				<div class="input-group">
					<input name="address" type="text" class="form-control"> <span
						class="input-group-btn">
						<button class="btn btn-default" type="submit">Search</button>
					</span>
				</div>
				<!-- /input-group -->
			</form:form>

			<table id="myTable" class="table table-condensed">
				<thead>
					<tr>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="truck" varStatus="status" items="${truckList}">
						<tr style="color:#ffffff; font-size: 17px;">
							<td><c:out value="${truck.fooditems}" /> <br />
								<b>Catered by:</b> <c:out value="${truck.applicant}" />
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>