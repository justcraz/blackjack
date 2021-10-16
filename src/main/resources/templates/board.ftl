<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/main.css">
    <title>Title</title>
</head>
<body>
<button><a href="/ui/board/all/shuffle">shuffle</a></button>
<div class="board">
    <#list cards as card>
        <img src="${card.image}" alt="" id="card${card.id}">
    </#list>
</div>

</body>
</html>