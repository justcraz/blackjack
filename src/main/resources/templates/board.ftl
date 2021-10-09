<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<ul>
    <#list cards as card>
        <li><img src="${card.image}" alt=""></li>
    </#list>
</ul>
</body>
</html>