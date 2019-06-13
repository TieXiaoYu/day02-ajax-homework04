<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>评论</title>
    <script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
</head>
<body>

<form onsubmit="return false;">

    评论内容<textarea name="discuss_content"></textarea><br />
    评论人<input type="text" name="person" /><br />
    <input type="submit" value="保存" />
</form>
<script>
    $("form").submit(function () {
        $.ajax({
            type:"post",
            url:"dis/add?id=${param.id}",
            dataType:"json",
            data:$("form").serialize(),
            success:function (data) {
                if(data.code==1){
                    alert("添加成功")
                    location.href="list.html"
                }else{
                    alert(data.info)
                }
            }
        })
    })
</script>
</body>
</html>