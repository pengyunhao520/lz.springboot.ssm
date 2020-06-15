<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <base href="<%=basePath%>"/>
    <%@include file="/WEB-INF/view/common/common.jsp" %>

</head>
<script type="text/javascript" src="/static/js/doctor.js"></script>



<style type="text/css">
    .layui-table-cell{
        font-weight: bold;
    }
    #div11{
        border-left: 30px solid #0f88eb;
        border-right: 30px solid #0f88eb;
        height: 115%;
        width: 130%;

    }
    #title{
        position:fixed;
        width:100%;
        height: 60px;
        background-color: #0f88eb;
        text-align:center;
        font-size:50px;
        color: white;
        bottom: 0px;
        left: 0px;
        align-self: center;
        font-family: "仿宋";
    }
    title_img{
        margin-bottom: 5px;
    }
    #keshi{
        background-color: #0f88eb;
        height: 60px;
        width: 100%;
        font-size: 30px;
        text-align: center;
        font-family: "楷体";

    }
    #keshifont{
        margin: 0 auto;
        text-align: center;
        /*margin: 0 auto;*/
    
    }
    #keshi > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div{
        border: 0;
    }
    #keshi > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        height: 50px;
        font-size: 30px;
        text-align: center;
        font-family: "楷体";
        margin: 0 auto;
        /*background-color: #0f88eb;*/
        width: 100%;
        border: 10px;
    }
    #keshi > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        width: 1920px;
        text-align: center;
        background: #0f88eb;
        margin: 0 auto;
    }
    #keshi > div > div > div.layui-table-header{
        border: 0;
    }
    .layui-table-header{
        border: 0;
    }
    #line2{
        background-color: #0f88eb;
        width: 20px;
        margin-top: -5px;
        height: 100%;
        margin-left: 50%;
    }

    .doctorDiv{
        /*position:relative;*/
        width: 49%;
        height: auto;
        margin-top: -400px;
    }

    #doctorTableDiv{
        margin: 0 auto;
        margin-top: -140px;
        width: 400px;
    }

    .imageTableDiv{
        border: 0;
        margin: 0 auto;
        height: 350px;
        width: 200px;
        margin-top: 20px;
        margin-left: 250px;
    }
    .personDiv{
        position:relative;
        width: 49%;
        height: auto;
        margin-top: -600px;
        margin-left: 560px;
    }

    #jiuzhenhuanzhe{
        margin-left: 130px;
        width: 520px;
        height: 156px;
        border: 2px solid #0f88eb;
    }
    #jiuzhen{
        margin-left: -2px;
        text-align: center;
        background-color: #0f88eb;
        color: white;
        width: 150px;
        font-family: "楷体";
        font-size: 60px;
    }

    #dengdaijiuzhen{
        margin-left: 130px;
        margin-top: 30px;
        width: 520px;
        height: 156px;
        border: 2px solid #0f88eb;
    }
    #dengdai{
        font-family: "楷体";
        margin-left: -2px;
        text-align: center;
        background-color: #0f88eb;
        color: white;
        width: 170px;
        font-size: 60px;
    }
    #personTableDiv{
        border: 0;
        margin: 0 auto;
        width: 250px;
        margin-top: -140px;
        margin-left: 220px;

    }
    #personTableDiv2{
        font-size: 40px;
        margin: 0 auto;
        align-content: center;
        width: 250px;
        margin-top: -140px;
        margin-left: 220px;

    }
    #person2Table{
        align-content: center;
    }
    #imageTable{
        border: 0;
    }
    #div11 > div.doctorDiv > div.remarkTableDiv > div > div > div.layui-table-body.layui-table-main > table{
        border: 0;
    }
    #div11 > div.doctorDiv > div.remarkTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        border: 0;
    }
    #div11 > div.doctorDiv > div.remarkTableDiv{
        margin: 0 auto;
        width: 400px;
        border: 0;
        margin-top: 30px;
    }


    .layui-table-cell{
        height:auto;
        overflow:visible;
        text-overflow:inherit;
        white-space:normal;
    }
    #divT{
        position:fixed;
        bottom:18px;
        left: 40%;
        text-align:center;
        margin:0 auto;
        font-size: large;
    }

    #keshi > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        margin-left: 200px;
            border: 0px;
    }
    #keshi > div > div > div.layui-table-body.layui-table-main{
        text-align: center;
    }
    .imageTableDiv > div:nth-child(2){
        margin: 0 auto;
        width: 235px;
        border:0;
    }

    #div11 > div.doctorDiv > div.imageTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div{
        width: 230px;
        border: 0;
    }


   /* #personTableDiv > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1){
        !*width: 98.8px;*!
        width: auto;
    }
    #personTableDiv2 > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1){
        width: 98.5px;
    }*/
    #personTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div{
        font-size: 40px;
        color: #0f88eb;
        text-align: center;
    }
    #personTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        height: 100px;
    }
    #personTableDiv2 > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div{
        font-size: 40px;
        color: #0f88eb;
        text-align: center;
    }
    #personTableDiv2 > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        height: 100px;
    }
    #personTableDiv2 > div{
        border: 0px;
        width: 350px;
    }
    #personTableDiv > div{
        border: 0px;
        width: 350px;
    }
    #doctorTableDiv > div{
        border-color: #0f88eb;
    }
    #doctorTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td:nth-child(1){
        border-color: #0f88eb;
        font-size: 30px;
        color: #0f88eb;
        font-family: "楷体";
        width: 196px;
    }
    #doctorTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td:nth-child(2) > div{
        border-color: #0f88eb;
        color: #0f88eb;
        font-size: 30px;
        font-family: "楷体";
    }
    #doctorTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td:nth-child(1) > div{
        border-right: 2px solid #0f88eb;
    }
    #div11 > div.doctorDiv > div.remarkTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div{
        border-color: #0f88eb;
        font-size: 30px;
        font-family: "楷体";
        color: #0f88eb;
    }
    #div11 > div.doctorDiv > div.remarkTableDiv > div{
        border-color: #0f88eb;
        font-size: 30px;
        font-family: "楷体";
        color: #0f88eb;
    }
    #div11 > div.doctorDiv > div.imageTableDiv > div{
        border-color: #0f88eb;
    }
    #div11 > div.doctorDiv > div.imageTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div > img{
        border-color: #0f88eb;
    }
    #div11 > div.doctorDiv > div.imageTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div{
        border-color: #0f88eb;
    }
    #div11 > div.doctorDiv > div.imageTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td > div > div > img{
        border-color: #0f88eb;
    }

    #personTableDiv2 > div > div > div.layui-table-header{
        border: 0;
    }
    #personTableDiv > div > div > div.layui-table-header{
       border: 0;
    }
    #div11 > div.doctorDiv > div.imageTableDiv > div > div > div.layui-table-header{
      border: 0;
    }
    #imageTable{
      border: 0;
    }
    #keshi > div > div > div.layui-table-body.layui-table-main > div{
        border: 0;
    }
    #keshi > div{
        border: 0;
    }

    #div11 > div.doctorDiv > div.imageTableDiv > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        border: 0;
    }
    html,body{
        height: 104.5%;
        width: 100%;
    }

</style>



<body >
    <%--<div class="layui-row">--%>
    <div id="div11">
        <div id="keshi">
            <table class="layui-table-cell" id="keshifont"></table>
<%--            <span id="keshifont">科室</span>--%>
        </div>
        <hr id="line2" class="line1"/>
        <%--<hr id="lineleft" class="line1"/>--%>
        <%--<hr id="lineright" class="line1"/>--%>
        <%--当前就诊和等会患者--%>
        <div class="personDiv">
            <div id="jiuzhenhuanzhe">
                <div id="jiuzhen">正在就诊</div>
                <div id="personTableDiv">
                    <table class="layui-table-cell" id="personTable"></table>
                </div>
            </div>
            <div id="dengdaijiuzhen">
                <div id="dengdai">等待就诊</div>
                <div id="personTableDiv2">
                    <table class="layui-table-cell" id="person2Table"></table>
                </div>
            </div>


           <%-- <div>
                &lt;%&ndash;<img src="static/images/hospitl.jpg" id="img">&ndash;%&gt;
                    <video id="img" muted="muted" autoplay="autoplay" loop controls="controls"
                           src="${pageContext.request.contextPath}/hospital/video">
                    </video>


                   &lt;%&ndash; <video
                            id="video"
                            preload="auto"
                            autobufer="true"
                            webkit-playsinline playsinline
                            x5-video-player-type="h5"
                            x5-video-orientation="portraint"
                            x5-video-player-fullscreen="true"
                            x-webkit-airplay="allow"
                            style="object-fit:fill;position: absolute; width: 70%; height: 70%; top: 15%; left: 15%;"
                            src="http://qn.media.epub360.com/materials/video/75d5c1fe97ac5d6af2f4ff3d851353b0.mp4_origin.mp4"
                            poster="http://qn.media.epub360.com/materials/video/75d5c1fe97ac5d6af2f4ff3d851353b0.mp4_video0.png">
                    </video>&ndash;%&gt;
            </div>--%>
        </div>

        <!-- 当前就诊医生 -->
        <div class="doctorDiv">
            <div class="imageTableDiv">
                <table class="layui-table-cell" id="imageTable">
                </table>
            </div>
            <div id="doctorTableDiv">
                <table class="layui-table-cell" id="doctorTable">
                </table>
            </div>
            <div class="remarkTableDiv">
                <table class="layui-table-cell" id="remarkTable">
                </table>
            </div>
        </div>



        <div class="layui-col-md9" id="title">
            <div id="title_img">
                <img src="static/images/logo.jpg" width="60"  >
                石首市中医医院
            </div>
        </div>
    </div>


</body>


</html>