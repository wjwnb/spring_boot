$(function () {
    $.post({
        url:'user/getAll',
        success:function (data) {

            for (var i=0;i<data.length;i++){
                var text="<tr>\n" +
                    "                    <td>"+data[i].uid+"</td>\n" +
                    "                    <td>"+data[i].uname+"</td>\n" +
                    "                    <td>"+data[i].sex+"</td>\n" +
                    "                    <td>"+data[i].createtime+"</td>\n" +
                    "                    <td>"+data[i].type+"</td>\n" +
                    "                    <td>\n" +
                    "                        <a href=\"user/delById?uid="+data[i].uid+"\" class=\"btn btn-danger\">删除</a>\n" +
                    "                        <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "                    </td>\n" +
                    "                </tr>"
                var obj=$(".pool");
                obj.append(text);
                console.log(text)
            }

        }
    });
});