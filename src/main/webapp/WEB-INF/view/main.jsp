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
    #div11{
        border-left: 30px solid #0f88eb;
        border-right: 30px solid #0f88eb;
        height: 115%;
        width: 130%;

    }
    #title{
        position:fixed;
        width:100%;
        height: 80px;
        background-color: #0f88eb;
        text-align:center;
        font-size:50px;
        color: white;
        bottom: 0px;
        left: 0px;
        font-family: "仿宋";
        padding-top: 10px;

    }

    #keshi{
        background-color: #0f88eb;
        height: 80px;
        width: 100%;
        font-family: "楷体";
        color: white;


    }
    #keshifont{
        margin: 0 auto;
        text-align: center;
    }

    #keshi > div > div > div.layui-table-body.layui-table-main > table > tbody > tr > td{
        height: 50px;
        font-size: 50px;
        text-align: center;
        color: white;
        font-family: "楷体";
        margin: 0 auto;
        width: 100%;


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
    #keshi > div > div > div.layui-table-body.layui-table-main{
        border: 0;
        padding-bottom: 10px;
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
        margin-top: -400px;
    }

    #doctorTableDiv{
        margin: 0 auto;
        width: 400px;
        margin-top: 30px;

    }

    .imageTableDiv{
        border: 0;
        margin: 0 auto;
        width: 120px;

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
        margin-top: 63px;
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


    .layui-table-cell{
        /*height:auto;*/
        font-weight: bold;
        overflow:visible;
        text-overflow:inherit;
        white-space:normal;
        height: auto !important;
    }

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
    #div11 > div.doctorDiv > div.remarkTableDiv > div{
        margin: 0 auto;
        border-color: #0f88eb;
        font-size: 30px;
        font-family: "楷体";
        color: #0f88eb;
        height: 100px;
        width: 400px;
        margin-top: 30px;
    }
    #div11 > div.doctorDiv > div.imageTableDiv > div{
        border: 0;
        /*border-color: #0f88eb;*/
    }

    #personTableDiv2 > div > div > div.layui-table-header{
        border: 0;
    }
    #personTableDiv > div > div > div.layui-table-header{
       border: 0;
    }

    #keshi > div{
        border: 0;
    }

    /*#kehshihead{*/
    /*    margin-bottom: -10px;*/
    /*    height: 2px;*/
    /*    background-color: red;*/
    /*}*/
    #hospitalImage{
        width: 70px;
        margin-top: -8px;
        margin-right: -20px;
    }
    html,body{
        height: 104.5%;
        width: 100%;
    }

</style>



<body >
    <%--<div class="layui-row">--%>
    <div id="div11">
        <div id="kehshihead"></div>
        <div id="keshi">
            <table class="layui-table-cell" id="keshifont">
            </table>
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
                <img id="hospitalImage" src="static/images/hospital.jpg" >
                <span>石首市中医医院</span>
            </div>
        </div>
    </div>


</body>


</html>