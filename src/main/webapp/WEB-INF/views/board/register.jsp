<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="../includes/header.jsp"%>


<div class="row">
	<div class="col-lg-12">

		<h1 class="page-header">Register</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Board Register</div>
			<!-- /.panel-heading -->
			<div class="panel-body">


				<!-- /.row -->
				<div class="row">
					<div class="col-lg-12">
						<form role="form" action="/board/register" method="post">
							<div class="form-group">
								<label>Title</label> <input class="form-control" name='title'
									placeholder='제목'>
							</div>
							<div class="form-group">
								<label>Writer</label> <input class="form-control" name='writer'
									placeholder='작성자'>
							</div>
							<div class="form-group">
								<label>Text area</label>
								<textarea class="form-control" name='content' placeholder='내용' rows="20"></textarea>
							</div>
							<button type="submit" class="btn btn-default" style="position: absolute; right:0;">작성완료</button>
						</form>
					</div>
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
	</div>
</div>



<%@include file="../includes/footer.jsp"%>
</body>

</html>