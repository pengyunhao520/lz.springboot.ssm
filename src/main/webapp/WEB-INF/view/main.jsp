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
    #title{
        width:100%;
        text-align:center;
        font-size:30px;
        margin-top:2px;
        margin-bottom:3px;
    }

    .line1{
        height: 3px;
        background-color:blue;
        width: 100%;
    }


    .doctorDiv{
        position:relative;
        width: 49%;
        height: auto;
        margin-top: -400px;
    }

    #doctorTableDiv{
        margin: 0 auto;
        height: 130px;
        width: 221px;
    }

    #line2{
        width: 3px;
        height: 450px;
        align-content: center;
        margin-left: 50%;
        margin-top: -492px;
    }
    #line3{
        width: 100%;
        margin-top: -10px;
    }

    .imageTableDiv{
        margin: 0 auto;
        height: 350px;
        width: auto;
        margin-left: 3px;
    }
    .personDiv{
        position:relative;
        width: 49%;
        height: auto;
        margin-left: auto;
    }
    #personTableDiv{
        margin: 0 auto;
        width: 100px;
        margin-left: 130px;
    }
  /* #personTable{
       align-content: center;
   }*/

    #personTableDiv2{
        margin-top: -96px;
        width: 100px;
        margin-left: 230px;
    }
    #person2Table{
        align-content: center;
    }
    #imageTable{
        background-color: lightblue;
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
    #body{
        background-color: lightblue;
    }
    #img{
        width: 400px;
        height: 300px;
        margin:0 auto;
        margin-left: 30px;
    }
    .imageTableDiv > div:nth-child(2){
        margin: 0 auto;
        width: 300px;
    }
    #personTableDiv > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1){
        width: 98.8px;
    }
    #personTableDiv2 > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1){
        width: 98.5px;
    }
</style>



<body id="body">
    <%--<div class="layui-row">--%>
    <div>
        <div class="layui-col-md9" id="title">
            <img src="static/images/logo.jpg" width="60" >
            石首中医院
        </div>
        <hr class="line1"/>

        <%--当前就诊和等会患者--%>
        <div class="personDiv">
            <div id="personTableDiv">
                <table class="layui-table-cell" id="personTable"></table>
            </div>
            <div id="personTableDiv2">
                <table class="layui-table-cell" id="person2Table"></table>
            </div>
            <div>
                <%--<img src="static/images/hospitl.jpg" id="img">--%>
                    <video id="img" muted="muted" autoplay="autoplay" loop controls="controls"
                           src="${pageContext.request.contextPath}/hospital/video">
                    </video>


                   <%-- <video
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
                    </video>--%>
            </div>
        </div>

        <!-- 当前就诊医生 -->
        <div class="doctorDiv">
            <div id="doctorTableDiv">
                <table class="layui-table-cell" id="doctorTable">
                </table>
            </div>
            <div class="imageTableDiv">
                <table class="layui-table-cell" id="imageTable">
                </table>
            </div>
        </div>

        <hr id="line2" class="line1"/>
        <hr id="line3" class="line1"/>
        <div id="divT"></div>
    </div>


</body>


</html>