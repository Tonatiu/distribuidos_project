<?php

class Client{
	private $cliente;
	
	function __construct($wsdl){
		$this->cliente = new SoapClient($wsdl);
	}
	
	function sumar($param_1, $param_2){
		$responce = $this->cliente->suma(array('a'=>2, 'b'=>3));
		echo "<div class=\"alert alert-success\">".
				"<a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>".
				"<strong> The result is: ".$responce->return."</strong>".
			"</div>";
	}
}

$cliente = new Client("http://localhost:8080/PruebaWebService?wsdl");

?>