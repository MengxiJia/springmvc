<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/hellomaven/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function jsonticket(){
	$.ajax({
		type:"POST",
		url:"./po",
		data:"",
		contentType:"text/plain;charset=utf-8",
		success:function(data){
			var list = "<table><tr><th>Tid</th><th>departure_add</th><th>destination_add</th><th>departure_time</th><th>arrival_time</th><th>price</th><th>uname_code</th></tr>";
			for(var i = 0;i<data.length;i++){
				var listAdd ="<tr><td>"+data[i].tid+"</td><td>"+data[i].departure_add+"</td><td>"+data[i].destination_add+"</td><td>"+data[i].departure_time+"</td><td>"+data[i].arrival_time+"</td><td>"+data[i].price+"</td><td>"+data[i].uname_code+"</td></tr>";
				list = list+listAdd;
			}
			list = list+"</table>";
			$("#listDiv").html(list);
			//这是选择器
			
			
		},
		error:function(r){
			alert("error");
		}
	})

}

</script>
<title>showticket</title>
</head>
<body>
<div id="showme">
	<button id="press" onclick="jsonticket()">showlist</button>
</div>
<div id="listDiv"></div>

</body>
</html>