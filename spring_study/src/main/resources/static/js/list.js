// 목록
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


// 검색
$('#searchBtn').click(function(){
    if($('#keyword').val() == ''){
        alert('검색어를 입력하세요')
    }
    else{
        $.ajax({
            type : 'post',
            url : '/user/search',
            data : $("#searchForm").serialize(),
            dataType : 'json',
            success: function (data) {
                console.log(JSON.stringify(data));
            },
            error: function (err) {
                console.log(err)
            }
        })
    }
})