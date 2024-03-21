<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Diagnostika BTG</title>
</head>
<body>
<h1>Registration</h1>

<form method="POST" th:action="@{/register}" id="registerForm">

    <label for="username">Username: </label>
    <input type="text" name="username"/><br/>

    <label for="password">Password: </label>
    <input type="password" name="password"/><br/>

    <label for="confirm">Confirm password: </label>
    <input type="password" name="confirm"/><br/>

    <label for="name">name: </label>
    <input type="text" name="name"/><br/>

    <label for="surname">Surname: </label>
    <input type="text" name="surname"/><br/>

    <label for="workEmail">Email: </label>
    <input type="text" name="workEmail"/><br/>

    <input type="submit" value="Register"/>
</form>
</body>
</html>