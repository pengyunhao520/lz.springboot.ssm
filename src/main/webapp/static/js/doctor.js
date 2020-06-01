/*$(function() {
    var video = document.getElementById("img");
    video.src = /hospital/video;
    video.play();
});*/

$(function () {
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#doctorTable'
            ,url:'/hospital/doctorAll'
            ,skin: 'nob' //行边框风格
            ,parseData:function (res) {
                return{
                    "code":0,
                    "msg":"",
                    "count":1,
                    "data":res
                }
            }
            ,cols: [[
               /* {field:'doctorImage',title: '头像',align:'center',templet: function (action) {
                        var base64="data:image/gif;base64,";
                        console.debug("base64")
                        console.debug(base64)
                        console.debug(action)
                        return "<img src='"+base64+action.doctorImage+"'>";
                    }},*/
                {field:'name',title: '医生姓名', width: 100,align:'center'},
                {field:'specialty',title: '所在科室',width: 120,align:'center'},

               /* {field:'doctorImage',title: '头像',align:'center',template: function (action) {
                    return "<img src='"data:image/png;base64,""+action+"'>";
                    }},*/

            ]]



        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
        // /*$('th').css({'background-color': '#5792c6', 'color': '#fff','font-weight':'bold'}) 表头的样式 */
        // $('th').hide();//表头隐藏的样式
    });
})

$(function () {
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#imageTable'
            //,height:'100px'
            ,url:'/hospital/doctorAll'
            ,backgroundColor:'lightblue'
            ,parseData:function (res) {
                return{
                    "code":0,
                    "msg":"",
                    "count":1,
                    "data":res,
                }
            }

            ,cols: [[
                {field:'doctorImg',width:'140px',style:'background-color: lightblue; color: #fff;',templet: function (action) {
                        var base64="data:image/jpg;base64,";
                        return "<img height='130px' width='110px' src='"+base64+action.doctorImg+"'>";
                    }},
                {field:'remark',title:'信息简介',width: 'full-200',align:'center'},
            ]]



        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
         //$('th').hide();//表头隐藏的样式
    });
})


//显示当前就诊患者和等待患者
$(function () {
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#personTable'
            ,url:'/hospital/patientAll'
            ,skin: 'nob' //行边框风格
            ,parseData:function (res) {
                return{
                    "code":0,
                    "msg":"",
                    "count":1,
                    "data":res
                }
            }
            ,cols: [[
                {field:'Patient_name',title: '正在就诊', width: 'full-200',align:'center'},
            ]]
        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
        // /*$('th').css({'background-color': '#5792c6', 'color': '#fff','font-weight':'bold'}) 表头的样式 */
        // $('th').hide();//表头隐藏的样式
    });
})

//显示当前就诊患者和等待患者
$(function () {
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#person2Table'
            ,url:'/hospital/patient'
            ,skin: 'nob' //行边框风格
            ,parseData:function (res) {
                return{
                    "code":0,
                    "msg":"",
                    "count":1,
                    "data":res
                }
            }
            ,cols: [[
                {field:'Patient_name',title: '等待就诊', width: 'full-200',align:'center'},
            ]]
        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
        // /*$('th').css({'background-color': '#5792c6', 'color': '#fff','font-weight':'bold'}) 表头的样式 */
        // $('th').hide();//表头隐藏的样式
    });
})

//显示当前时间
function getCurDate()
{
    var d = new Date();
    var week;
    switch (d.getDay()){
        case 1: week="星期一"; break;
        case 2: week="星期二"; break;
        case 3: week="星期三"; break;
        case 4: week="星期四"; break;
        case 5: week="星期五"; break;
        case 6: week="星期六"; break;
        default: week="星期天";
    }
    var years = d.getFullYear();
    var month = add_zero(d.getMonth()+1);
    var days = add_zero(d.getDate());
    var hours = add_zero(d.getHours());
    var minutes = add_zero(d.getMinutes());
    var seconds=add_zero(d.getSeconds());
    var ndate = years+"年"+month+"月"+days+"日 "+hours+":"+minutes+":"+seconds+" "+week;
    divT.innerHTML= ndate;
}

function add_zero(temp)
{
    if(temp<10) return "0"+temp;
    else return temp;
}

setInterval("getCurDate()",100);