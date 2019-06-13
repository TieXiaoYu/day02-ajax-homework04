<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>评论</title>
    <script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
    <style>
        .hh { display: inline; }
    </style>
    <style type="text/css">
        thead {
            background-color:black;
            color: white;
        }
        tbody tr:nth-child(odd) {
            background-color:#adadad ;
        }
        tbody tr:nth-child(even) {
            background-color: rgba(255, 0, 0, 0.2);
        }
    </style>
    <style>
        .table{
            border:1px solid;
            border-collapse: collapse;
        }
        .table th,td{
            border:1px solid;
        }
    </style>
</head>
<center>
<body>
<h1 class="hh">评论列表</h1><button onclick="returnNews()">返回新闻列表</button>

<br />
<table width="1000" style="text-align: center;border-collapse: collapse">
    <thead>
        <tr>
            <th>评论编号</th>
            <th>评论内容</th>
            <th>评论人</th>
            <th>评论时间</th>
        </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<script type="text/javascript">
    function returnNews() {
        if(confirm("确定要返回新闻列表吗？")) {
            location.href="list.html"
        }
    }
</script>
<script type="text/javascript">
    $(function(){
        searchDiscuss(1);
    })
</script>
<script type="text/javascript">
    function searchDiscuss(page){
        $.ajax({
            type:"get",
            url:"dis/all",
            data:{page:page,limit:5,id:${param.id}},
            dataType:"json",
            success:function(data){
                if(data.code == 1){
                    $("tbody").empty();
                    var infos = data.info.list;
                    for(var i = 0; i < infos.length; i++){
                        var html = '<tr>\n' +
                            '            <td>' + infos[i].id + '</td>\n' +
                            '            <td>' + infos[i].discuss_content + '</td>\n' +
                            '            <td>' + infos[i].person + '</td>\n' +
                            '            <td>' + infos[i].discuss_time + '</td>\n' +
                            '        </tr>';
                        $("tbody").append($(html));
                    }
                    var html = '<tr><td colspan="6"><a href="javascript:searchDiscuss(1)">首页</a>|\n' +
                        '                <a href="javascript:searchDiscuss(' + (data.info.currentPage - 1) + ')">上一页</a>|\n' +
                        '                <a href="javascript:searchDiscuss(' + (data.info.currentPage + 1) + ')">下一页</a>|\n' +
                        '                <a href="javascript:searchDiscuss(' + data.info.totalPage + ')">末页</a>\n' +
                        '                第' + data.info.currentPage + '页/共' + data.info.totalPage + '页\n' +
                        '                （' + data.info.count + '条记录）</td></tr>';
                    $("tbody").append($(html));
                }
            }


        })
    }

</script>
</body>
</center>
</html>