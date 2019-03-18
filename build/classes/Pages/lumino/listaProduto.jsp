<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Cadastrar Livro</title>
	<link href="./Pages/lumino/css/bootstrap.min.css" rel="stylesheet">
	<link href="./Pages/lumino/css/font-awesome.min.css" rel="stylesheet">
	<link href="./Pages/lumino/css/datepicker3.css" rel="stylesheet">
	<link href="./Pages/lumino/css/styles.css" rel="stylesheet">
	
	<!--Custom Font-->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse"><span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span></button>
				<a class="navbar-brand" href="#"><span>Alternativa</span>Admin</a>
			</div>
		</div><!-- /.container-fluid -->
	</nav>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<div class="profile-sidebar">
			<div class="profile-userpic">
				<img src="http://placehold.it/50/30a5ff/fff" class="img-responsive" alt="">
			</div>
			<div class="profile-usertitle">
				<div class="profile-usertitle-name">Username</div>
				<div class="profile-usertitle-status"><span class="indicator label-success"></span>Online</div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="divider"></div>
		<ul class="nav menu">
			<li class="active"><a href="index.html"><em class="fa fa-dashboard">&nbsp;</em> Relatório</a></li>
			<li class="parent "><a data-toggle="collapse" href="#sub-item-1">
					<em class="fa fa-calendar">&nbsp;</em> Gerenciar Clientes <span data-toggle="collapse" href="#sub-item-1" 
						class="icon pull-right"><em class="fa fa-plus"
					></em></span>
					</a>
					<ul class="children collapse" id="sub-item-1">
						<li><a class="" href="alterar-clientes.html">
							<span class="fa fa-arrow-right">&nbsp;</span> Alterar
						</a></li>
						<li><a class="" href="cadastrar-clientes.html">
								<span class="fa fa-arrow-right">&nbsp;</span> Cadastrar
							</a></li>
						<li><a class="" href="consultar-clientes.html">
							<span class="fa fa-arrow-right">&nbsp;</span> Consultar
						</a></li>
					</ul>
				</li>
			<li class="parent "><a data-toggle="collapse" href="#sub-item-2">
					<em class="fa fa-navicon">&nbsp;</em> Gerenciar Produtos <span data-toggle="collapse" href="#sub-item-2" 
						class="icon pull-right"><em class="fa fa-plus"
					></em></span>
					</a>
					<ul class="children collapse" id="sub-item-2">
						<li><a class="" href="cadastro-livro.html">
							<span class="fa fa-arrow-right">&nbsp;</span> Cadastrar
						</a></li>
						<li><a class="" href="consultar-livro.html">
							<span class="fa fa-arrow-right">&nbsp;</span> Consultar
						</a></li>
					</ul>
				</li>
				<li class="parent "><a data-toggle="collapse" href="#sub-item-3">
						<em class="fa fa-navicon">&nbsp;</em> Gerenciar Estoque <span data-toggle="collapse" href="#sub-item-3" 
							class="icon pull-right"><em class="fa fa-plus"
						></em></span>
						</a>
						<ul class="children collapse" id="sub-item-3">
							<li><a class="" href="alterar-estoque.html">
								<span class="fa fa-arrow-right">&nbsp;</span> Alterar
							</a></li>
							<li><a class="" href="cadastrar-estoque.html">
									<span class="fa fa-arrow-right">&nbsp;</span> Cadastrar
								</a></li>
							<li><a class="" href="consultar-estoque.html">
								<span class="fa fa-arrow-right">&nbsp;</span> Consultar
							</a></li>
						</ul>
					</li>
					<li class="parent "><a data-toggle="collapse" href="#sub-item-4">
						<em class="fa fa-navicon">&nbsp;</em> Gerenciar Pedidos <span data-toggle="collapse" href="#sub-item-4" 
					class="icon pull-right"><em class="fa fa-plus"></em></span>
				</a>
				<ul class="children collapse" id="sub-item-4">
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Em processamento
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Aprovado
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Reprovado
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Em trânsito
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Entregue
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Em troca
					</a></li>
					<li><a class="" href="#">
							<span class="fa fa-arrow-right">&nbsp;</span> Troca autorizada
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Trocado
					</a></li>
				</ul>
			</li>
			<li><a href="login.html"><em class="fa fa-power-off">&nbsp;</em> Logout</a></li>
		</ul>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#">
					<em class="fa fa-home"></em>
				</a></li>
				<li class="active">Gerenciar produtos</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Resultado da pesquisa</h1>
			</div>
		</div><!--/.row-->
				
				<div class="panel panel-default">
					<div class="panel-heading">Livros</div>
						<div class="panel-body">
							<div class="col-md-6">
							
							<form role="form" action="/livraria/AlterarProduto" method="POST">
								
								<div class="form-group">
								
								<c:forEach var="item" items="${resultado}">
									
									<input type="hidden" name="codigo" value="${item.id}" class="form-control" maxLength="5" >									
									<label>Título</label>
									<input name="titulo"  value="${item.titulo}" class="form-control" >
									<label>Autor:</label>
									<input name="autor" value="${item.autor}" class="form-control" >
									<label>Ano publicação:</label>
									<input name="ano" value="${item.ano}" class="form-control" >
									<label id="genero">Genero:</label>
									<c:forEach var="categoria" items="${item.categorias}">	
										<li> Genero: ${categoria.id} - ${categoria.descricao} </li><br>
									</c:forEach>
									
									<label id="genero">Alterar Genero:</label>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="1"> Administração
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="2"> Artes e fotografia
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="3">Autoajuda
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="4">Biografia
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="5">Contos e crônicas
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="6">Didáticos
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="7">Direito
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="8">Ficção fantasiosa
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="9">HQs
										</label>
									</div>
									<div class="checkbox">
										<label>
											<input  name="genero" type="checkbox" value="10">Poesia
										</label>
									</div>
									<div class="checkbox">
									
																	
									<label>Editora:</label>
									<input name="editora" value="${item.editora}" class="form-control" >
									<label>Edição:</label>
									<input name="edicao" value="${item.edicao}" class="form-control" >
									<label>ISBN:</label>
									<input name="isbn" value="${item.isbn}" class="form-control" maxlength="13" >
									<label>Sinopse:</label>
									<textarea name="sinopse" value="" class="form-control" rows="3" >
										${item.sinopse}
									</textarea>
									<label>Altura:</label>
									<input name="altura" value="${item.altura}" class="form-control" >
									<label>Largura:</label>
									<input name="largura" value="${item.largura}" class="form-control" >
									<label>Peso:</label>
									<input name="peso" value="${item.largura}" class="form-control" >
									<label>Profundidade:</label>
									<input name="profundidade" value="${item.profundidade}" class="form-control" >
									<label>Quantidade de páginas:</label>
									<input name="quantidadePaginas" value="${item.quantidadePaginas}" class="form-control" >
									<label>Código de barras:</label>
									<input name="codBarras" value="${item.codigoBarras}" class="form-control" >
									<div class="form-group checkbox">
										<label id="statusLivro" >
											<input id="status" name="ativo" type="checkbox">
											<script>
												const labelStatus = document.getElementById("statusLivro");
												const inputStatus = document.getElementById("status");
												if ('${item.ativo}') {
													labelStatus.innerHTML = "Ativo";
													inputStatus.checked = true;
												} else {								
													labelStatus.innerHTML = "Inativo";
													inputStatus.checked = false;
												}
												inputStatus.setAttribute("","")
												labelStatus.insertAdjacentElement("beforebegin",inputStatus);
											</script>										
										</label>
									</div>
									<div class="form-group">
										<label>Categoria de ativação</label>
										<li>Categoria ${item.categoriaAtivacao}</li>
										<select name="categoriaAtivacao" class="form-control" >
											<option value="1">Categoria 1</option>
											<option value="2">Categoria 2</option>
											<option value="3">Categoria 3</option>
											<option value="4">Categoria 4</option>
										</select>
									</div>
									<div class="form-group">
										<label>Justificativa ativação:</label>
										<input name="motivoAtivacao" value="${item.justificativaAtivacao}" class="form-control" >									
									</div>

									<div class="form-group">
										<button type="reset" class="btn btn-default">Cancelar</button>
										<button name="operacao" value="ALTERAR" type="submit" class="btn btn-primary">Alterar</button>
									</div>																
								</div>						
								</form>	
								</div>

								</c:forEach>							
							
							<c:if test="${ fn:length(resultado) < 1 }" >
								<div class="alert  alert-info" role="alert">
									A pesquisa não retornou nenhum resultado <br>
									Tente informar outros parâmetros para consulta.
								</div>																
							</c:if>
							
							<!--<c:forEach var="mensagem" items="${requestScope.sucesso}">
								<div class="alert alert-success" role="alert">
									${mensagem}
								</div>											
							</c:forEach> -->
								</div>			
							<c:forEach var="mensagem" items="${requestScope.erro}">
								<div class="alert alert-danger" role="alert">
									${mensagem}
								</div>											
							</c:forEach>
								</div>															
							</div>
						</div>
					</div>
				</div><!-- /.panel-->
			</div><!-- /.col-->
		</div><!-- /.row -->
	</div><!--/.main-->
	
<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/custom.js"></script>
	
</body>
</html>
