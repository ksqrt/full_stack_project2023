

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