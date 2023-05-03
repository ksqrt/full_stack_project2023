$(function(){
	
	$('#searchIdBtn').click(function(){
		$('#resultDiv').empty();
		if($('#searchId').val() == '') {
			$('#resultDiv').text('아이디를 입력해주세요');
		}
		else {
			$.ajax({
				type: 'post',
				url: '/user/getUser',
				data: 'id=' + $('#searchId').val(),
				//dataType: 'json', //아이디가 있으면 UserDTO가 JSON으로 바뀌어서 들어온다.
				//아이디가 없으면 JSON으로 오지 못한다.
				//데이터를 받지 못하면 에러가 생기는데 데이터타입을 정의하지 않으면 스프링이 알아서 데이터를 받는다.
				//그래서 dataType를 생략한다.
				success: function(data){
					console.log(JSON.stringify(data));
					
					if(data == '') {
						$('#updateDiv').hide();
						$('#resultDiv').text('찾는 아이디가 없습니다.');
						$('#resultDiv').css('color', 'red').css('font-weight', 'bold');
					}
					else {
						if(confirm('삭제하시겠습니까?')) {
							$.ajax({
								type: 'post',
								url: '/user/delete',
								data: 'id=' + $('#searchId').val(),
								success: function(){
									alert('삭제하였습니다.');
									location.href='/user/list';
								}, //success
								error: function(err){
									console.log(err);
								}	
							});
						}
						
					}
				},
			});
		}
	}); //#searchIdBtn.click
});