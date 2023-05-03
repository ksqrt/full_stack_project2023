$('#uploadBtn').click(function(){
	var formData = new FormData($('#uploadForm')[0]);
	
	$.ajax({
		type: 'post',
		url: '/user/upload',
		enctype: 'multipart/form-data',
		processData: false,
		contentType: false,
		data: formData,
		success: function(data){
			alert(data);
		},
		error: function(err){
			console.log(err);
		}
		
	});
});

$(function(){
	var reader = new FileReader();
	$.ajax({
		type: 'post',
		url: '/user/getUploadForm_AJax_list',
		success: function(data){
			alert('gd');
			$.each(data, function(index, items){
				$('<tr/>').append($('<td/>', {
					align: 'center',
					text: items.seq
				})).append($('<td/>', {
					align: 'center',
					//text: items.image1 //이미지는 실제 폴더에 들어있다. 
									  // 이미지의 주소는 가상폴더를 적어주어야 한다.
				}).append($('<img/>',{
					src: '../storage/' + items.image1,
					style: 'width:70px; height:70px;'
				}))).append($('<td/>', {
					align: 'center',
					text: items.imageName
				})).appendTo($('#userImageListTable'));
			}); //each
		},
		error: function(){
			console.log(err);
		}
	});
});

/*
processData
 - 기본값은 true
 - 기본적으로 Query String으로 변환해서 보내진다('변수=값&변수=값')
 - 파일 전송시에는 반드시 false로 해야 한다.(formData를 문자열로 변환하지 않는다)
 
contentType
  - 기본적으로 "application/x-www-form-urlencoded; charset=UTF-8"
  - 파일 전송시에는 'multipart/form-data'로 전송이 될 수 있도록 false로 설정한다
*/