<#import "spring.ftl" as spring/>
<html>
    <head>
        <title>注册成功</title>
    </head>
    <body>
        <table>
            <#list userList as user>
                <tr>
                    <td>${user.name}</td>
                    <td>
                        <@spring.message "user.name"/>
                    </td>
                    <td>
                        <a href="<@spring.url "/user/${user.name}.html"/>">打开${user.name}的个人主页</a>
                    </td>
                </tr>
            </#list>
        </table>
    </body>
</html>