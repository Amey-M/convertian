<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<title>Convertian-The coversion web</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Convertian</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">About us</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
						</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled"></a>
					</li>
				</ul>
				<form class="d-flex">

					<a class="btn btn-outline-light"
						href="http://localhost:8080/convertian/signin" role="button">SignIn</a>
				</form>
			</div>
		</div>
	</nav>
	<br>
	<br>
	<div class="container">

		<div class="d-grid gap-3">
			<a class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/currency" role="button"><h3>CURRENCY</h3>
				<h6>convert your currencies</h6></a> <a
				class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/length" role="button"><h3>LENGTH</h3>
				<h6>convert from different length units</h6></a> <a class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/area" role="button"><h3>AREA</h3>
				<h6>convert from different area units</h6></a> <a class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/volume" role="button"><h3>VOLUME</h3>
				<h6>convert from different volume units</h6></a> <a class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/temperature" role="button"><h3>TEMPERATURE</h3>
				<h6>convert from different temperature units</h6></a> <a
				class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/pressure" role="button"><h3>PRESSURE</h3>
				<h6>convert from different Pressure units</h6></a> <a
				class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/numbersystems" role="button"><h3>NUMBER
					SYSTEMS</h3>
				<h6>convert from different Number-Systems</h6></a> <a
				class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/power" role="button"><h3>POWER</h3>
				<h6>convert from different Power units</h6></a> <a
				class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/angle" role="button"><h3>ANGLE</h3>
				<h6>convert from different angle units</h6></a> <a class="btn btn-outline-dark btn-lg"
				href="http://localhost:8080/convertian/weight" role="button"><h3>WEIGHT</h3>
				<h6>convert from different Weight units</h6></a>
		</div>
	</div>
	<br>


</body>
</html>