<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FullLife</title>
    <link rel="stylesheet" href="/css/HSheader.css">
</head>
<body>
<header>
        <div id="logo">
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:WebContent/html/header.html
<<<<<<< HEAD

=======
<<<<<<< HEAD:WebContent/HeaderNFooterJSP/Header.jsp
>>>>>>> origin/JaeWon
            <img src="../img/HSfulllife로고3 (1).png" alt="">
=======
            <img src="/img/HSfulllife로고3 (1).png" alt="">
<<<<<<< HEAD
>>>>>>> fb2d342018278e195e30e9ae35a700719bf9a968
=======
            <img src="../img/HSfulllife로고3 (1).png" alt="">
>>>>>>> 2fca2955899cce15ea944de7047abec963bed8ed:WebContent/HeaderNFooterJSP/Header.jsp
=======
            <img src="/img/HSfulllife로고3 (1).png" alt="">
>>>>>>> origin/stitchkang
=======
<<<<<<< HEAD
<<<<<<< HEAD:WebContent/HeaderNFooterJSP/Header.jsp
            <img src="../img/HSfulllife로고3 (1).png" alt="">
=======
            <img src="/img/HSfulllife로고3 (1).png" alt="">
>>>>>>> fa09d816ebb29d3ab02cb7c2d92341a7b82c8fa6:WebContent/html/header.html
>>>>>>> origin/JaeWon
=======
            <img src="/img/HSfulllife로고3 (1).png" alt="">
>>>>>>> origin/Hyunseok
>>>>>>> origin/mooooo
=======
            <img src="/img/HSfulllife로고3 (1).png" alt="">
>>>>>>> origin/JaeWon
=======
>>>>>>> fa09d816ebb29d3ab02cb7c2d92341a7b82c8fa6:WebContent/html/header.html
>>>>>>> origin/JaeWon
=======
            <img src="/img/HSfulllife로고3 (1).png" alt="">
>>>>>>> origin/stitchkang
        </div>
        <div id="blank"></div>
        <div id="header-menu">
            <ul>
                <li class="main-menu"><a href="#">장기이식</a></li>
                <li class="main-menu">
                    <a href="#">후원</a>
                    <ul class="serv-menu">
                        <li><a href="#">후원</a></li>
                        <li><a href="#">후원게시판</a></li>
                        <li><a href="#">신청게시판</a></li>
                    </ul>
                </li>
                <li class="main-menu">
                    <a href="#">상담</a> 
                    <ul class="serv-menu">
                        <li><a href="#">FAQ</a></li>
                        <li><a href="#">문의하기</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div id="btn-div">
           <c:if test="${sessionScope.userId eq null }">
               <button><a href="/member/login">LOGIN</a></button>
            </c:if>
            <c:if test="${sessionScope.userId ne null }">
               <button style="width:90px;"><a href="/member/myInfo?userId=${sessionScope.userId }" style="font-weight: 800;">
               MYPAGE</a></button>
            </c:if>
        </div>
    </header>
</body>
</html>