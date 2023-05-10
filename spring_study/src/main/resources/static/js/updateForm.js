$(function(){
    console.log('js')
    $('#updateDiv').hide();

    $('#searchIdBtn').click(function(){
        $('#resultDiv').empty();

        $.ajax({
            type:'post',
            url : '/user/getUser',
            data : 'id='+$('#search-input').val(),
            success: function (data) {
                console.log(JSON.stringify(data));

            },
            error: function (err) {
                console.log(err)
            }

        })
    })
})