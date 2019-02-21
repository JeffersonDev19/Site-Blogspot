var xinzhao = document.querySelectorAll('#xinzhao');
for (var x = 0; x < xinzhao.length; x++) {
	xinzhao[x].onmouseenter = function() {

		this.querySelector('span').style.display = 'inline-block';

	}

	xinzhao[x].onmouseleave = function() {

		this.querySelector('span').style.display = 'none';

	}
}

var jarvan = document.querySelectorAll('#jarvan');
for (var x = 0; x < jarvan.length; x++) {
	jarvan[x].onmouseenter = function() {

		this.querySelector('span').style.display = 'inline-block';

	}

	jarvan[x].onmouseleave = function() {

		this.querySelector('span').style.display = 'none';

	}
}


document.getElementById("xinzhao").addEventListener("click", function() {
	alert("Xin Zhao diz: Nao clica em mim nao, se nao te ULTO!!! Por Demacia");
	jarvanvisible();
}, false);

function jarvanvisible() {
		document.getElementById("jarvan").style.display = "block";
}

function jarvaninvisible() {
	document.getElementById("jarvan").style.display = "none";
}

document
		.getElementById("jarvan")
		.addEventListener(
				"click",
				function() {
					alert("Jarvan diz: A briga esta mais feia que o esperado, irei para outro reino");
					jarvaninvisible();
				}, false);

$(function Change() {
	$("#button")
			.click(
					function() {
						$("#mid-body")
								.css('background-image',
										'url("http://localhost:8080/EducaMais/img/fundo_after_click.png")');
						$("#button").hide();
						$("#bonecoLol").hide();
						$("#mid-form")
								.html(
										"</br>"
												+ "</br>"
												+ "</br>"
												+ "<form action='ControllerRegister' method='post' Style='padding-left: 10px; padding-right: 10px; padding-top: 10px; padding-bottom: 10px; background-color: white; opacity: 0.9; border-radius: 5px;'>"
												+ "<div class='form-row'>"
												+ "<div class='form-group col-6 col-sm-6 col-md-6 col-lg-6'>"
												+ "<label for='lbl_nome'>Nome</label> <input type='text'"
												+ "class='form-control' id='nome' name='nome' placeholder='Nome'>"
												+ "</div>"
												+ "<div class='form-group col-6 col-sm-6 col-md-6 col-lg-6'>"
												+ "<label for='lbl_apelido'>Apelido</label> <input type='text' class='form-control' id='apelido' name='apelido' placeholder='Apelido'>"
												+ "</div>"
												+ "</div>"
												+ "<div class='form-group'>"
												+ "<label for='lbl_email'>Email</label> <input type='text'"
												+ "class='form-control' id='email' name='email'"
												+ "placeholder='example@example.com.br'>"
												+ "</div>"
												+ "<div class='form-group'>"
												+ "<label for='lbl_senha'>Senha</label> <input type='password'"
												+ "class='form-control' id='senha' name='senha'"
												+ "placeholder='Senha'>"
												+ "</div>"
												+ "<div class='form-row'>"
												+ "<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>"
												+ "<button type='submit' class='btn btn-primary col-md-2'>Cadastrar"
												+ "</button>"
												+ "<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>"
												+ "</div>" + "</form>");
					});
});