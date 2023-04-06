<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/emp" method="POST" modelAttribute="user" enctype="multipart/form-data">
    <input type="hidden" id="id" name="id" value="${user.id}">
    <input name="name" id="name" value="${user.name}"><br>
    <input type="submit">
</form>
</body>
</html>