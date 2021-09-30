<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문의 작성</title>
	<link rel="stylesheet" type="text/css" href="/css/askPost.css">
</head>
<body>
	<header>
	
	</header>
	<main id="main">
        <div id="main-navi">
            <span>
                <ul class="subMenu">
                    <li>문의</li>
                    <li><a href="#">FAQ</a></li>
                </ul>
            </span>
        </div>
        <div id="main-contents">
            <div id="contents-header"><u><strong>문의</strong></u></div>
            <hr>

            <div id="contents">
                <br>
                <span class="contents-title">
                    <label for="subject"><strong>제목</strong></label>
                </span>
                <span class="contents_con">
                    <input type="text" name="subject" id="subject" placeholder="제목을 입력해주세요">
                </span>
                <br>
                <span class="contents-title" >
                    <label for="textarea"><strong>문의내용</strong></label>
                </span>
                <span class="contents_con">
                    <textarea name="textarea" id="contents" cols="100" rows="30" placeholder="내용을 입력해주세요"></textarea>
                </span>
                <br>
                <span class="contents-title">
                    <strong>공개여부</strong>
                </span>
                공개 <input type="checkbox" name="open" id="open" value="Y" checked>
                비공개 <input type="checkbox" name="close" id="close" value="N">
                <br>
                <button type="submit" id="btnJoin"> 문의작성 </button>
                
            </div>
        </div>
    </main>
</body>
</html>