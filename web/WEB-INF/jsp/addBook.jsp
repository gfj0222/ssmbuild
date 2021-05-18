<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <%--BootStrap 美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bkname">书籍名称:</label>
            <input type="text" name="bookName" class="form-group" id="bkname" required>
        </div>
        <div class="form-group">
            <label for="bkCounts">书籍数量:</label>
            <input type="text" name="bookCounts" class="form-group" id="bkCounts" required>
        </div>
        <div class="form-group">
            <label for="bkDetail">书籍描述:</label>
            <input type="text"name="detail" class="form-group" id="bkDetail" required>
        </div>
        <div class="form-group">

            <input type="submit"value="提交">
        </div>
    </form>


    </div>
</body>
</html>
