<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".delete").click(function () {
                var href = $(this).attr("href");
                $("#deleteForm").attr("action", href).submit();
                return false;
            })

        });
    </script>
</head>
<body>

<form action="" method="POST" id="deleteForm">
    <input type="hidden" name="_method" value="DELETE">
</form>


<table border="1" cellpadding="10" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>addr</td>
        <td>age</td>
        <td>删除</td>
        <td>修改</td>
    </tr>


    <#list querys as emp>
        <tr>
            <td>${(emp.id) !"null"}</td>
            <td>${(emp.name) !"null"}</td>
            <td>${(emp.addr) !"null"}</td>
            <td>${(emp.age) !"null"}</td>

            <td><a class="delete" href="emp/${emp.id}">删除</a></td>
            <td><a href="emp/${emp.id}">修改</a></td>
        </tr>
    </#list>
</table>

<br>


<a href="emp">添加</a>


</body>
</html>