var app = angular.module('register',[]);
app.controller('registerCtrl', function($scope, $http){
	$scope.user = {};
	
	$scope.submit = function(){
		if($scope.user.password === $scope.user.password1){
			
			$http({
				  method: 'POST',
				  url: '/StudentRegistration/rest/userRegistration',
				  data:$scope.user
				}).then(function successCallback(response) {
					alert("Success");
				}, function errorCallback(response) {
				    alert("Failure");
				  });
		}else{
			alert("password should match");
		}
	}
});

/**
 *
 $scope.user = {};
	$scope.submit = function(){
		console.log("submit");
		console.log($scope.user); 

		$http.post('http://localhost:8123/StudentRegistration/rest/userRegistration',$scope.user).
		then(success(), failure());
		function success(){
			console.log("Success");
		}
		function failure(){
			console.log("Failure");
		}
	}
 
 * 
 */
