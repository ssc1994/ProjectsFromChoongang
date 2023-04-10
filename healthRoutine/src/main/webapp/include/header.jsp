<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html lang="en">

  <head>
  <style>
  	.tabstyle{
	color: white; 
	background-color: black; 
	opacity:0.5;
  	}
  </style>
  

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

    <title>JaeWon Studio</title>

    <!-- Additional CSS Files -->
    <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="../assets/css/font-awesome.css">

    <link rel="stylesheet" href="../assets/css/templatemo-training-studio.css">

    </head>
    
    <body>
    
    <!-- ***** Preloader Start ***** -->
    <div id="js-preloader" class="js-preloader">
      <div class="preloader-inner">
        <span class="dot"></span>
        <div class="dots">
          <span></span>
          <span></span>
          <span></span>
        </div>
      </div>
    </div>
    <!-- ***** Preloader End ***** -->
    
    
    <!-- ***** Header Area Start ***** -->
    <header class="header-area header-sticky">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <nav class="main-nav">
                        <!-- ***** Logo Start ***** -->
                        <a href="${pageContext.request.contextPath }/index.index" class="logo">JaeWon's<em> Studio</em></a>
                        <!-- ***** Logo End ***** -->
                        <!-- ***** Menu Start ***** -->
                        <ul class="nav">
                        
                        
                        <c:if test="${sessionScope.id == null }">
							<li class="scroll-to-section"><a href="${pageContext.request.contextPath }/index.index" class="active">Home</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/routine/routine_info.routine">Exercise</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/board/board_list.board">BOARD</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/exerciseinfo/Exerciseinfo_page.ExerciseInfo">Schedules</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/user/user_login.user">Login</a></li> 
                            <li class="main-button"><a href="${pageContext.request.contextPath }/user/user_join.user" >Sign Up</a></li>
						</c:if>
					
						<c:if test="${sessionScope.id != null }">
							<li class="scroll-to-section"><a href="${pageContext.request.contextPath }/index.index" class="active">Home</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/routine/routine_info.routine">Exercise</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/board/board_list.board">BOARD</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/exerciseinfo/Exerciseinfo_page.ExerciseInfo">Schedules</a></li>
                            <li class="scroll-to-section"><a href="${pageContext.request.contextPath }/user/user_logout.user">Logout</a></li> 
                            <li class="main-button"><a href="${pageContext.request.contextPath }/user/user_mypage.user">my page</a></li>
						</c:if>
                        </ul>        
                        <a class='menu-trigger'>
                            <span>Menu</span>
                        </a>
                        <!-- ***** Menu End ***** -->
                    </nav>
                </div>
            </div>
        </div>
    </header>
    </body>
    <div><!-- 
    <h3>d</h3>
    <h3>d</h3>
    <h3>d</h3> -->
    </div>
    <body>
    <!-- ***** Header Area End ***** -->

    <!-- ***** Main Banner Area Start ***** -->
    <div class="main-banner" id="top">
        <video autoplay muted loop id="bg-video">
            <source src="../assets/images/gym-video.mp4" type="video/mp4" />
        </video>

        <div class="video-overlay header-text">
            <div class="caption">
                <!-- <h6>work harder, get stronger</h6>
                <h2>easy with our <em>gym</em></h2> -->
           <!--      <div class="main-button scroll-to-section"> -->
               <%--      <a href="${pageContext.request.contextPath }/user/user_join.user">Become a member</a> --%>
                
    <!-- ***** Main Banner Area End ***** -->
