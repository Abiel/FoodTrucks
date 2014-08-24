<!DOCTYPE html>

<%@ include file="../taglib.jsp" %>

<html lang="en">
<head>
	<title>Xtremes Enterprises</title>
	<link type="text/css" href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
	<link type="text/css" href='<spring:url value="/resources/jquery/css/redmond/jquery-ui-1.8.21.custom.css"/>' rel="stylesheet" />	
	<script type="text/javascript" src='<spring:url value="/resources/jquery/js/jquery-1.7.2.min.js"/>'></script>
	<script type="text/javascript" src='<spring:url value="/resources/jquery/js/jquery-ui-1.8.21.custom.min.js"/>'></script>
	<script>
	$(function() {
		
	});
	</script>
	
		
</head>
<body>

<div align="center">
<div class="site">
	<table class="tbl">
		<tbody>		  
		 <tr>
		 	<td colspan="2" class="header" >
		 		<span id="siteLogo">iCarpool skeleton project</span>
		 	</td>
		 </tr>	
		 
		 <tr>
		    <td valign="top" colspan="2">
		    	<tiles:insertAttribute name="bodyContent"/>
		    </td>
		 </tr>
		 <tr class="footer" height="25">
	    	<td colspan="2">
	    		<a class="link" href="http://boiling-retreat-5982.herokuapp.com/" target="_blank">
					http://boiling-retreat-5982.herokuapp.com/
				</a>
	   		 </td>
		 </tr>
		</tbody>
	</table>	
</div>
</div>
</body>
</html>