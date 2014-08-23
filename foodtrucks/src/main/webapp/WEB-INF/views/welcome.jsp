<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="taglib.jsp" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.png">       <!-- Abiel: fix this -->

    <title>Food Trucks | SF</title>

    <!-- Bootstrap core CSS -->
    <link href='<spring:url value="/resources/css/bootstrap3/css/bootstrap.css" />' rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href='<spring:url value="/resources/css/carousel.css" />' rel="stylesheet">
    
    <style type="text/css">
      html { height: 100% }
      body { height: 100%; margin: 0; padding: 0 }
      #map-canvas { height: 100% }
      #foodTruckPanel {position:absolute; margin-right: 100px; top: 5%; left: 70%; width: 450px; padding-left:20px; padding-right:20px; z-index:100; background-color:gray;height: 800px !important; overflow: scroll;}
    </style>
    
    <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBX-yaWdHUBf09oEty4xSC3X22NsN7HleA">
    </script>
    
    <script type="text/javascript">
      var truckMarkers = [new google.maps.LatLng(37.7951490737255,-122.422248184604),
                          new google.maps.LatLng(37.7911490737255,-122.426268184604),
                          new google.maps.LatLng(37.7921990737255,-122.429278184604)];
      
      function loadTruckMarkers(currentMap){
    	  for(i=0; i<truckMarkers.length; i++){
    		  var marker = new google.maps.Marker({
    	            position: truckMarkers[i],
    	            map: currentMap,
    	            title: 'Hello World!'
    	        });
    	  }
      }
      
      function initialize() {
    	  
        var mapOptions = {
          center: new google.maps.LatLng(37.7901490737255,-122.422258184604),
          zoom: 15
        };
        var map = new google.maps.Map(document.getElementById("map-canvas"), mapOptions);
        loadTruckMarkers(map);
        
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
    
  </head>
  <body>
    <div id="map-canvas"></div>
    <div id="content">
  <div id="foodTruckPanel">
	<h2> &gt;&gt; Food Trucks </h2>
	
	<!-- Search and button -->
	<div class="input-group">
      <input type="text" class="form-control">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button">Search</button>
      </span>
    </div><!-- /input-group -->
    
    
	<div id="trial"> 
  	</div>
    <table id="myTable" class="table table-condensed">
  		<thead>
	    	<tr>
	      		<th>#</th>
	      		<th>Food Type | Name</th>
	    	</tr>
  		</thead>
	  	<tbody>
	      	<tr>
	        	<td>Starting</td>
	        	<td> </td>
	      	</tr>
	  	</tbody>
  	</table>
  </div>
</div>
  </body>
</html>