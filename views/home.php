<!DOCTYPE html>
<html lang="en">
<head>
	<title></title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../styles/home_student.css">
</head>

<body>
	<?php
		require_once("../sessions/user_logged.php");
	?>
	<div class = "container">
		<div id="head_menu" class="row">
			<nav class="navbar navbar-default" role="navigation">
			  <!-- El logotipo y el icono que despliega el menú se agrupan
				   para mostrarlos mejor en los dispositivos móviles -->
			  <div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-ex1-collapse">
				  <span class="sr-only">Desplegar navegación</span>
				  <span class="icon-bar"></span>
				  <span class="icon-bar"></span>
				  <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">
					<img class="img-responsive" src="../images/escom.png" alt="person" width="80" height="80">
				</a>
			  </div>
			 
			  <!-- Agrupar los enlaces de navegación, los formularios y cualquier
				   otro elemento que se pueda ocultar al minimizar la barra -->
			  <div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a class="content_cleaner" href="#">Examenes Inscritos</a></li>
					<li><a class="content_cleaner" href="#">Calificaciones</a></li>
					<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					  Gestión <b class="caret"></b>
					</a>
					<ul class="dropdown-menu">
					  <li><a class="content_cleaner" href="#">Inscribir</a></li>
					  <li><a class="content_cleaner" href="#">Dar de baja</a></li>
					</ul>
				  </li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a class="content_cleaner" href="../sessions/user_logout.php">Logout</a></li>
				</ul>
			  </div>
			</nav>
		</div>
		<div id="content" class="row">
			<div id="student_info" class="col-xs-6 col-sm-3">
				<div id="photo">
					<img class="img-responsive" src="../images/person-flat.png" alt="person" width="100" height="100">
					<h1>John Doe</h1>
				</div>
				<div class="personal_info">
					<p>johndoe@gmail.com</p>
					<p>2008600448</p>
				</div>
			</div>
			<div id="display" class="col-xs-6 col-sm-9">
				<h3>Hola mundo</h3>
			</div>
		</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
	<script src = "../engiene/javascript/cleaner.js"></script>
</body>