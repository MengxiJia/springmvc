<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript" src="/hellomaven/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function jsondemo(){
	var json_string={uname:"sspu",upassword:"abc"};
	$.ajax({
		type:"POST",
		url:"./ajaxdemo",
		data:JSON.stringify(json_string),
		contentType:"application/json;charset=utf-8",
		success:function(data){
			alert(data.uname);
			alert(data.upassword);
			alert("this");
		},
		error:function(r){
			alert("error");
		}
	})
}

	function jsondemo2(){
	$.ajax({
		type:"GET",
		url:"./ajaxdemo2",
		data:"myname="+"shisis",
		dataType:'text',
		contentType:"charset=utf-8",
		success:function(data){
			alert(data);
			
		},
		error:function(r){
			alert("error");
		}
	})
}

</script>

<title>Insert title here</title>
</head>
<body>
<button onclick="jsondemo()" >点我1</button>
<button onclick="jsondemo2()" >点我2</button>

</body>
</html>