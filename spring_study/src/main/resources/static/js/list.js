$(function(){
    console.log("js 실행");
    $.ajax({
        type:'post',
        url : '/user/getUserList',
        dataType : 'json',
        success: function(data){
            console.log("ajax")
            console.log(JSON.stringify(data));
            $.each(data,function(index,item){
                var result = `<tr> +
                    <td align="center">${item.name}</td>
                    <td align="center">${item.id}</td>
                    <td align="center">${item.pwd}</td>
                    <tr>`

                $('#userTable').append(result)
            })


        },
        error : function(err){
            console.log(err)
        }

    })
})



