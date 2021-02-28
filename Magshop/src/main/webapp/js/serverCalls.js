$("button.createMagazine")
		.click(
				function() {
					
					var magazine_name = $("form.createMagazine input.magazine_name").val();
					var magazine_pages = $("form.createMagazine input.magazine_pages").val();
					var magazine_price = $("form.createMagazine input.magazine_price").val();
				
						var magazine = {
								magazine_name : magazine_name,
								magazine_pages : magazine_pages,
								magazine_price : magazine_price
						};

						$.post("Magazine", magazine,
								function(data) {
									if (data == 'Success') {
										alert('Success');
									}
								});
					
				});