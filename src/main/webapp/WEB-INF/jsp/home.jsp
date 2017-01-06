<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" var="bootstrapCss" />
    <spring:url value="/resources/css/jumbotron.css" var="jumbotronCss" />
    <spring:url value="/resources/images/tank.ico" var="favIcon" />
    <spring:url value="/resources/images/tiger_2.jpg" var="tiger2" />
    <spring:url value="/resources/images/Michael_Wittmann.jpg" var="wittmann" />
    <spring:url value="/resources/bower_components/jquery/dist/jquery.min.js" var="jqueryJs" />
    <spring:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js" var="bootstrapJs" />

    <link rel="icon" href="${favIcon}">

    <title>Panzerfest</title>

    <!-- Bootstrap core CSS -->
    <link href="${bootstrapCss}" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${jumbotronCss}" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
      .glowing-border {
          border: 2px solid #ff0000;
          border-radius: 7px;
      }

      .glowing-border:focus {
          outline: none;
          border-color: #ed9e9e;
          box-shadow: 0 0 10px #ed9e9e;
      }
    </style>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="<c:url value='/home' />">Project Panzer</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <c:choose>
            <c:when test="${pageContext.request.userPrincipal.name != null}">
              <form class="navbar-form navbar-right" action="<c:url value='/j_spring_security_logout' />" method="POST">
                <p class="navbar-text">Signed in as ${pageContext.request.userPrincipal.name}</p>
                <button id="signOutBtn" name="submit" type="submit" value="submit" class="btn btn-warning red-tooltip navbar-btn" data-toggle="tooltip" data-placement="bottom">Logout</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
              </form>
            </c:when>
            <c:otherwise>
              <form class="navbar-form navbar-right" name="loginForm" action="<c:url value='/j_spring_security_check' />" method="POST" autocomplete="off">
                <input style="display:none">
                <input type="password" style="display:none">
                <div class="form-group">
                  <input id="usernameInputField" type="text" name="j_username" placeholder="Username" class="form-control" autocomplete="off"/>
                </div>
                <div class="form-group">
                  <input id="passwordInputField" type="password" name="j_password" placeholder="Password" class="form-control" autocomplete="off"/>
                </div>
                <button id="signInBtn" name="submit" type="submit" value="submit" class="btn btn-success red-tooltip" data-toggle="tooltip" data-placement="bottom">Sign in</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
              </form>
            </c:otherwise>
          </c:choose>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Willkommen Panzer Enthusiasten!</h1>
        <p>Victory in the ground war of World War 2 could be decided through various means but it was the tank that ultimately took center stage.</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Subscribe to Newsletter &raquo;</a></p>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-3">
          <h2>Why are tanks called tanks?</h2>
          <p>The first tanks were used by the British during World War I as a way of attacking enemy trenches. They were called tanks to trick the Germans into thinking they were water carriers for areas where water was hard to move or find in large amounts. </p>
          <p><a class="btn btn-default" href="#" role="button">Read further &raquo;</a></p>
        </div>
        <div class="col-md-3">
          <h2>Tiger II</h2>
          <img src="${tiger2}" class="img-thumbnail" alt="Tiger II" height="236">
          <p style="padding-top: 10px;">The Tiger II was the successor to the Tiger I, combining the latter's thick armor with the armor sloping used on the Panther medium tank. The tank weighed almost 70 metric tons, and was protected by 100 to 180 mm (3.9 to 7.1 in) of armor to the front. It was armed with the long barreled 8.8 cm KwK 43 L/71 gun. The chassis was also the basis for the Jagdtiger turretless tank destroyer. </p>
          <p><a class="btn btn-default" href="#" role="button">Read führer &raquo;</a></p>
        </div>
        <div class="col-md-3">
          <h2>Michael Wittmann</h2>
          <img src="${wittmann}" class="img-thumbnail" alt="Michael Wittmann">
          <p style="padding-top: 10px;">Wittmann is known for his ambush of elements of the British 7th Armoured Division, during the Battle of Villers-Bocage on 13 June 1944. While in command of a Tiger I tank, he destroyed up to fourteen tanks and fifteen personnel carriers, along with two anti-tank guns, within the space of fifteen minutes. The news was picked up and disseminated by the Nazi propaganda machine and added to Wittmann's stature in Germany. </p>
          <p><a class="btn btn-default" href="#" role="button">Read führer &raquo;</a></p>
        </div>
        <div class="col-md-3">
          <h2>Suicide Dog Bombers</h2>
          <p>The Soviet Red Army once trained dogs to destroy enemy tanks. The dogs were trained to associate the underside of tanks with food and were fitted with a 26lb explosive device strapped to their backs. Once the dogs crawled under the tanks, the device was triggered and exploded destroying the tank (and of course the dog). Unfortunately this didn't always work as planned as the dogs were trained using Soviet tanks so were more likely to run under these than the German tanks. As many as 25 German tanks were put out of action this way during the battles for Stalingrad and Kursk.</p>
          <p><a class="btn btn-default" href="#" role="button">Read further &raquo;</a></p>
        </div>
      </div>

      <hr>

      <footer class="footer">
        <div class="container">
          <p class="text-muted">${applicationName} | Version: ${applicationVersion}</p>
        </div>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${jqueryJs}"></script>
    <script src="${bootstrapJs}"></script>
    <script type="text/javascript">
      $( document ).ready(function() {
          if ('${error}' != '')
          {
            $("#signInBtn").tooltip({
              title: '${error}'
            });
            $("#signInBtn").tooltip('show');
            $("#usernameInputField").addClass("glowing-border");
            $("#passwordInputField").addClass("glowing-border");
          }
          else if ('${msg}' != '')
          {
            $("#signOutBtn").tooltip({
              title: '${msg}'
            });
            $("#signOutBtn").tooltip('show');
          }
          else
          {
            $("#signInBtn").tooltip({
              title: 'Sign into your account'
            });
          }
      });
    </script>
  </body>
</html>