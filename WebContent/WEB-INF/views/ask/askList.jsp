<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문의게시판</title>
<link rel="stylesheet" type="text/css" href="/css/askList.css">
</head>
<body>
<header></header>
	
	<main>
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
            <div id="top">
                <span class="search">
                    <select>
                        <option value="subject">제목</option>
                    </select>
                    <input type="text" name="searchWord" id="searchWord">
                    <input type="submit" value="검색">
                </span>
                <span class="inquiry">
                    <input type="submit" value="문의하기">
                </span>
            </div>
            <div >
                <table border="1px">
                    <tr>
                        <th class="inquiryNo">글 번호</th>
                        <th class="title">제목</th>
                        <th class="disclosure">공개여부</th>
                        <th class="writer">작성자</th>
                        <th class="status">문의상태</th>
                        <th class="enrollDate">작성일</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                    </tr>

                </table>
            </div>
        </div>
    </main>
</body>
</html>