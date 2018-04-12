<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function jasondemo(){
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

</script>

<title>Insert title here</title>
</head>
<body>
<form action="./ajaxdemo" method="post">
    <input type="submit" value="submit">
    </form>

</body>
</html>