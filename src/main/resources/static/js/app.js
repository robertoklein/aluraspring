var appCliente = angular.module("appCliente", ['ngRoute']);

appCliente.config(function($routeProvider){
	
	$routeProvider
	.when("/login",{templateUrl:'views/login.html',controller:'loginController'})
	.when("/cadastro",{templateUrl:'views/cadastro.html',controller:'usuarioController'})
	.otherwise({redirectTo:'/login'});
});