<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息显示</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/jquery-1.4.2.min.js"></script>
<link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-4">
				<h1>SSM练手项目-CRUD</h1>
			</div>
		</div>
		<!-- 操作按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary">新增</button>
				<button class="btn btn-danger">删除</button>
			</div>
		</div>
		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<thead>
					<tr>
					<th>#</th>
							<th>empName</th>
							<th>email</th>
							<th>gender</th>
							<th>deptName</th>
							<th>Option</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${pageInfo.list}" var="tblEmp">
							<tr>
								<th>${tblEmp.empId}</th>
								<th>${tblEmp.empName}</th>
								<th>${tblEmp.email }</th>
								<th>${tblEmp.gender=="M"?"男":"女" }</th>
								<th>${tblEmp.tblDept.deptName}</th>
								<th>
									<button class="btn btn-info btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										编辑
									</button>
									<button class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</th>
							</tr>
						</c:forEach>

					</tbody>
				</table>

			</div>

		</div>

		<!-- 分页信息 -->
		<div class="row">
			<div class="col-md-6">
				当前第${pageInfo.pageNum}页，共有${pageInfo.pages}页，总共${pageInfo.total}条记录数
			</div>

			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="${pageContext.request.contextPath}/emp/list?pageNo=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage}">
						<li><a
							href="${pageContext.request.contextPath}/emp/list?pageNo=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>

					<!--如果是当前页码，就激活-->
					<c:forEach items="${pageInfo.navigatepageNums }" var="pageNo">
						<c:if test="${pageNo==pageInfo.pageNum}">
							<li class="active"><a
								href="${pageContext.request.contextPath}/emp/list?pageNo=${pageNo}">${pageNo}</a></li>
						</c:if>
						<c:if test="${pageNo!=pageInfo.pageNum}">
							<li><a href="${pageContext.request.contextPath}/emp/list?pageNo=${pageNo}">${pageNo}</a></li>
						</c:if>
					</c:forEach>

					<c:if test="${pageInfo.hasNextPage}">
						<li><a
							href="${pageContext.request.contextPath}/emp/list?pageNo=${pageInfo.pageNum+1}"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${pageContext.request.contextPath}/emp/list?pageNo=${pageInfo.pages}">末页</a>
					</li>
				</ul>
				</nav>
			</div>
		</div>

	</div>

</body>
</html>