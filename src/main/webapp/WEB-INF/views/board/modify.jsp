<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="../includes/header.jsp"%>

<style type="text/css">
 form{
 display:inline
 }
</style>

<div class="row">
	<div class="col-lg-12">

		<h1 class="page-header">Modify/Delete</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Board Modify, Delete</div>
			<!-- /.panel-heading -->
			<div class="panel-body">


				<!-- /.row -->
				<div class="row">
					<div class="col-lg-12">
						<form role="form" action="/board/modify" method="post">
							<input type='hidden' name='bno' value='${board.bno}'>
							<div class="form-group">
								<label>Title</label> <input class="form-control" name='title'
									value='<c:out value="${board.title}"/>'>
							</div>
							<div class="form-group">
								<label>Writer</label> <input class="form-control" name='writer'
									value='<c:out value="${board.writer}"/>'>
							</div>
							<div class="form-group">
								<label>Text area</label>
								<textarea class="form-control" name='content' rows="3"><c:out
										value="${board.content}" /></textarea>
							</div>
           
                        
							<div class="form-group">
								<button type="submit" class="btn btn-primary">수정하기</button>
							</div>
						</form>
						<form role="form" action="/board/list" method="get">
							<input type='hidden' name='page' value='${pageObj.page}'>
							<button type="submit" class="btn btn-default">목록보기</button>
						</form>
						<form role="form" action="/board/remove" method="post">
							<input type='hidden' name='page' value='${pageObj.page}'>
							<input type='hidden' name='bno' value='${pageObj.bno}'>
							<button type="submit" class="btn btn-danger">삭제하기</button>
						</form>

					</div>
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
	</div>
</div>



</body>
</html>