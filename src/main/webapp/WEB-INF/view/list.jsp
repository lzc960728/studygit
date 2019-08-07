<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<%--  <c:if test="fn">checked</c:if> --%>
<!-- onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'createTime\')}'})" -->



<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/WdatePicker.js"></script>
</head>
<body>
	<script type="text/javascript">
	
	</script>
	<table>
		<tr>
			<td><input type="checkbox" id="qx" >全选/反选</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>市场</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${pg.list}" var="l">
		<tr>
			<td><input type="checkbox" class="cb" value="${l.mid}"></td>
			<td>${l.mid}</td>
			<td>${l.mname}</td>
			<td>${l.actor}</td>
			<td>${l.price}</td>
			<td>${l.uptime}</td>
			<td>${l.longs}</td>
			<td>${l.types}</td>
			<td>${l.years}</td>
			<td>${l.qy}</td>
			<td>${l.zt}</td>
			<td>详情</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>