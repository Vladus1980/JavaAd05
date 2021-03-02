$('button.buy-magazine').click(function() {
	var magazine_id = jQuery(this).attr('magazine_id');
	
	$.post('subscription', {'magazine_id': magazine_id},
			function(data) {
				if (data == 'Success') {
//					$('[data-dismiss=modal]').trigger({type: 'click'});
					$('#buyMagazineModal').hide();
					$('.modal-backdrop').remove();
					alert('Журнал доданий у кошик!');
				}
			});
});