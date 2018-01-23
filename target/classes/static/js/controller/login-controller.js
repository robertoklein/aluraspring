appCliente.controller("loginController", function($scope,$http,$location){

	$scope.usuario={};

	$scope.autenticar=function(){
		$http.post("/autenticar", $scope.usuario).then(function(response){
			console.log("sucesso " + response.data);
			$location.path("/cadastro");
		} , function(response){
			console.log("falha " + response);
		});
	 }	
});
