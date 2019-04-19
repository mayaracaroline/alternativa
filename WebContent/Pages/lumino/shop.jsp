<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Livros | Alternativa</title>
    <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/css/font-awesome.min.css" />" rel="stylesheet">
    <link href="<c:url value="/css/prettyPhoto.css" />" rel="stylesheet">
    <link href="<c:url value="/css/price-range.css" />" rel="stylesheet">    
    <link href="<c:url value="/css/animate.css" />" rel="stylesheet">  
    <link href="<c:url value="/css/main.css" />" rel="stylesheet">  
    <link href="<c:url value="/css/responsive.css" />" rel="stylesheet"> 
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>
	<header id="header"><!--header-->
		
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-md-4 clearfix">
						<div class="logo pull-left">
							<a href="index.html"><img src="images/home/logo.png" alt="" /></a>
						</div>
						<div class="btn-group pull-right clearfix">
						</div>
					</div>
					<div class="col-md-8 clearfix">
						<div class="shop-menu clearfix pull-right">
							<ul class="nav navbar-nav">
								<li><a href="../../area-do-cliente/lumino/meus-pedidos.html"><i class="fa fa-user"></i> Minha conta</a></li>
								<li><a href="cart.html"><i class="fa fa-shopping-cart"></i> Meu carrinho</a></li>
								<li><a href="login.html"><i class="fa fa-lock"></i> Login</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-middle-->
	
		<div class="header-bottom"><!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="index.html">Home</a></li>
								
                <li><a href="shop.html" class="active">Produtos</a></li>
                                
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="search_box pull-right">
							<input type="text" placeholder="Search"/>
						</div>
					</div>
				</div>
				</div>
			</div>
	</header>
	
	<section>
		<div class="container">
			<div class="row">
					<div class="col-sm-3">
							<div class="left-sidebar">
								<h2>Categoria</h2>
								<div class="panel-group category-products" id="accordian"><!--category-productsr-->
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
												<a data-toggle="collapse" data-parent="#accordian" href="#mens">
													AdministraÃ§Ã£o
												</a>
											<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>						
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
												<a href="#womens">Artes e Fotografia</a>
											<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">Autoajuda</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">Biografia</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">Contos e crÃ´nicas</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">DidÃ¡ticos</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">Direito</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">FicÃ§Ã£o Fantasiosa</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">FicÃ§Ã£o CientÃ­fica</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">HQs</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">Poesia</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a href="#">Romance</a>
												<input type="checkbox" name="" id="">
											</h4>
										</div>
									</div>
								</div><!--/category-products-->
					
								<div class="brands_products"><!--brands_products-->
									<h2>Autores</h2>
									<div class="brands-name">
										<ul class="nav nav-pills nav-stacked">
											<li>
												<a href="#"> J.K.Howlling
													<input type="checkbox" name="" id="">											
												</a>
											</li>
											<li>
												<a href="#"> Jojo Moyes
													<input type="checkbox" name="" id="">
												</a>
											</li>
											<li>
												<a href="#"> 
													Dan Brown
													<input type="checkbox" name="" id="">
												</a></li>
											<li>
												<a href="#"> Jenny Han
												<input type="checkbox" name="" id="">

												</a>
											</li>
											<li><a href="#"> George Orwell
													<input type="checkbox" name="" id="">
												
											</a></li>
										</ul>
									</div>
								</div>
						
						
					</div>
				</div>
				
				<div class="col-sm-9 padding-right">
					<form action="livraria/Pages/lumino/CadastraProduto" method="post"></form>
					<div class="features_items"><!--features_items-->
						<h2 class="title text-center">Produtos</h2>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/shop/product12.jpg" alt="" />										
										<h3>Farenheint 451</h3>
										<h2>R$56,00</h2>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Visualizar</a>
									</div>									
								</div>
							</div>
						</div>
						<!-- <ul class="pagination">
							<li class="active"><a href="">1</a></li>
							<li><a href="">2</a></li>
							<li><a href="">3</a></li>
							<li><a href="">&raquo;</a></li>
						</ul> -->
					</div><!--features_items-->
				</div>
			</div>
		</div>
	</section>
	
  <jsp:include page= "./footer.jsp" />
  <jsp:include page= "./scripts.jsp" />

</body>
</html>