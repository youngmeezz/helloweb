<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String col = request.getParameter("c");
	String row = request.getParameter("r");

	int nCol = Integer.parseInt(col);
	int nRow = Integer.parseInt(row);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href='/helloweb'>홈 가기</a>
	</br>
	</br>
	<table border='1' cellspacing='0' cellpadding='2'>
		<%
			for(int i=0; i < nRow; i++){
		%>
		<tr>
		<%
			for(int j=0;j<nCol;j++){
		%>
		
			<td>cell(<%=i %>,<%=j %>)</td>
		<%
			}
		%>
		<%
			}
		%>
	</table>
</body>
</html>