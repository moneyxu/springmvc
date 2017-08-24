<html>
    <head>
        <title>注册成功</title>
    </head>
    <body>
        <table>
            <#list userList as user>
                <tr>
                    <td>${user.name}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>