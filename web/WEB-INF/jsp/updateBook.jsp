<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/5/18
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<%--BootStrap 美化界面--%>
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${books.bookID}">
        <div class="form-group">
            <label for="bkname">书籍名称:</label>
            <input type="text" name="bookName" value="${books.bookName}" class="form-group" id="bkname" required>
        </div>
        <div class="form-group">
            <label for="bkCounts">书籍数量:</label>
            <input type="text" name="bookCounts" value="${books.bookCounts}" class="form-group" id="bkCounts" required>
        </div>
        <div class="form-group">
            <label for="bkDetail">书籍描述:</label>
            <input type="text"name="detail"value="${books.detail}"  class="form-group" id="bkDetail" required>
        </div>
        <div class="form-group">

            <input type="submit"value="修改">
        </div>
    </form>


</div>
</body>
</html>
