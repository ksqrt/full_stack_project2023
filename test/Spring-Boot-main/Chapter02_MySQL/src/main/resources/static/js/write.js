//등록
$('#writeBtn').click(function(){
	$('#nameDiv').empty();
	$('#idDiv').empty();
	$('#pwdDiv').empty();
	
	if( $('#name').val() == ''){
		$('#nameDiv').text('이름을 입력해주세요');
	}
	else if($('#id').val()=='') {
		$('#idDiv').text('아이디를 입력해주세요');
	}
	else if($('#pwd').val()=='') {
		$('#pwdDiv').text('패스워드를 입력해주세요');
	}
	else {
		$.ajax({
			type: "post",
			url: '/user/write',
			data: $('#writeForm').serialize(),
			success: function(){
				alert('회원가입을 축하합니다.');
				location.href='/user/list';
			},
			error: function(err){
				console.log(err);
			}
		});
	}
});

//아이디 중복체크 focusout가 나오면 사용가능 or 불가능
$('#id').focusout(function(){
	if($('#id').val() == '') {
		$('#idDiv').text('아이디를 입력해주세요');
	} //if
	else {
		$.ajax({
			type: 'post',
			url: '/user/isExistId',
			data: 'id=' + $('#id').val(),
			dataType: 'text', // 서버로부터 받는 데이터 형, text, json, xml
			success: function(data){
				//아이디가 있으면 "exist", 아이디가 없으면 "non_exist"
				if(data == 'exist') {
					$('#idDiv').text('사용불가');
				}
				else if(data == 'non_exist') {
					$('#idDiv').text('사용가능');
					$('#idDiv').css('color', 'blue');
				}
				
			},
			error: function(err){
				console.log(err)
			}
		});
	} //else
	
});

