<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FullLife</title>
<link rel="stylesheet" href="/m_css/m_ask_answer.css">
</head>
<body>
   <header>
        <div id="logo">
            <a href="#"><img src="/img/fulllife로고3 (1).png" alt=""></a>
        </div>
        <div id="logout">
            <button>로그아웃</button>
        </div>
    </header>
    <aside id="left-aside">
        <div id="main-ul">
            <ul>
                <li class="main-li"><a href="/manager/m_member_list">&nbsp;회원 정보 관리</a></li>
                <li class="main-li"><a href="/manager/m_order_list">&nbsp;주문 관리</a></li>
                <li class="serv-li" id="choice">
                    <a href="/manager/m_support_list">&nbsp;게시판 관리</a>
                    <div class="board-class">
                        <ul>
                            <li><a href="/manager/m_support_list">후원 게시판</a></li>
                            <li><a href="/manager/m_apply_list">신청 게시판</a></li>
                            <li><a href="/manager/m_ask_list">문의 게시판</a></li>
                            <li><a href="/manager/m_result_list">검사 결과 관리</a></li>
                        </ul>
                    </div>
                </li>
            </ul>
        </div>
    </aside>
    <div id="main-div">
        <div id="title">
            문의 게시판 관리
        </div>
        <div id="line-div"></div>
        <div id="main-contents">
            <form action="">

                <div id="contents">
                    <br>
                    <span class="contents-title">
                        <label for="subject"><strong>제목</strong></label>
                    </span>
                    <span class="contents_con">
                        <input type="text" name="subject" id="subject" placeholder="제목을 입력해주세요" value="제목도 자동으로!">
                    </span>
                    <br>
                    <span class="contents-title" >
                        <label for="textarea">
                            <strong>문의내용</strong>
                        </label>
                    </span>
                    <span class="contents_con">
                        <textarea name="textarea" id="textarea" cols="100" rows="30" placeholder="내용을 입력해주세요">
                            여기에는 문의 내용이 자동으로 입력되어있습니다.
                        </textarea>
                    </span>
                    <br>
                    <span class="contents-title">
                        <strong>공개 여부</strong>
                    </span>
                    공개 <input type="checkbox" name="open" id="open">
                    비공개 <input type="checkbox" name="close" id="close">
                    <br>
                    <span class="contents-select">
                        <strong>답변 여부</strong>
                    </span>
                    완료 <input type="checkbox" name="yes" id="yes">
                    <br>
                    <button type="submit" id="btnJoin">답변완료</button>
                    
                </div>
            </form>
        </div>
    </div>

    </div>
</body>
</html>