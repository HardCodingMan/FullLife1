<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="/css/supportnotice.css">
</head>
<body>
	<header>
        <jsp:include page="/html/header.html"></jsp:include>
    </header>
    <main>
        <div class="wrapper">
        <section>
            <div id="supportnotice-header">
                <h2>후원 게시판</h2>
            </div>
        </section>
        <section id="notice-section">
            <div class="notice">
                <ul>
                    <li>
                        <a href="/Notice/Support/SupportContents" class="notice-link">
                        <div class="list">
                            <div class="list-img">
                                <img src="img/newsofa.jpg" alt="후원1" class="list-img">
                            </div>
                            <div class="list-text">
                                <p class="notice-title">우리 동생이 아파요</p>
                            </div>
                            <div>
                                <p>조회수 : 1200</p>
                            </div>
                            <div class="list-percent">                      
                               	 달성률 : 
                                <div class="prog">
                                    <div class="progs" id="progressing">80%</div>
                                </div>
                            </div>
                            <div class="list-btn">
                                <button>자세히보기</button>
                            </div>
                        </div>
                        </a>
                    </li>
                    
                </ul>
            </div>
            <div id="page">1 2 3 4 5</div>
        </section>
        </div>
    </main>
    <footer>
        <jsp:include page="/html/footer.html"></jsp:include>
    </footer>
</body>
</html>