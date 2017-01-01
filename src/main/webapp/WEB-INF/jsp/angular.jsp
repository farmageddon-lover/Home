<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html ng-app="store">
  <head>
    <spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" var="bootstrapCss" />
    <spring:url value="/resources/bower_components/angular/angular.min.js" var="angularJs" />
    <spring:url value="/resources/modules/angularModule.js" var="angularModule" />

    <link href="${bootstrapCss}" rel="stylesheet">
  </head>
  <body ng-controller="StoreController as store">
    <div class="list-group">
      <div class="list-group-item" ng-repeat="product in store.products">
        <div ng-hide="product.soldOut || !product.canPurchase">
          <h1> {{product.name}} </h1>
          <h2> {{product.price}} </h2>
          <p> {{product.description}} </p>
          <button ng-show="product.canPurchase"> Add to cart </button>
        </div>
      </div>
    </div>

    <script src="${angularJs}"></script>
    <script src="${angularModule}"></script>
  </body>
</html>