

// 등록

$("#writeBtn").click(function(){
    console.log("클릭")
    $.ajax({
        type : 'post',
        url : '/user/write',
        data : $('#writeForm').serialize(),
        success : function(){
            alert("등록완료")
        },
        error : function (err){
            console.log(err)
        }
        
    })
})

// 아이디 중복 체크

// id 에서 포커스 아웃이 발생했을시
$('#id').focusout(function(){

    $('#idDiv').empty();
    if (  $('#id').val() == '' ){
        $('#idDiv').text('먼저 아이디를 입력')
        $('#id').focus();
    }
    else {
        $.ajax({
            type: 'post',
            url: '/user/isExistId',
            data: 'id=' + $('#id').val(),
            dataType: 'text',
            success: function (data) {
                if (data == 'exist') {
                    $('#idDiv').text('사용불가능')
                    $('#idDiv').css('color', 'red')
                } else {
                    $('#idDiv').text('사용가능')
                    $('#idDiv').css('color', 'blue')
                }

            },
            error: function (err) {
                console.log(err)
            }
        })
    }
})