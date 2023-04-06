<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/emp" method="POST">

    <#if user.id == 0>
        姓名：<input name="name" id="name"><br>
        地址：<input name="addr" id="addr"><br>
        年龄：<input name="age" id="age"><br>
        <input type="submit">
    </#if>

    <#if user.id !=0 >
        <input type="hidden" name=_method value="put"/>
        <input type="hidden" id="id" name="id" value="${user.id}"><br>
        姓名：<input name="name" id="name" value="${user.name}"><br>
        地址：<input name="addr" id="addr" value="${user.addr}"><br>
        年龄：<input name="age" id="age" value="${user.age}"><br>
        <input type="submit">
    </#if>

</form>
</body>
</html>