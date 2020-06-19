/*$(function() {
    var video = document.getElementById("img");
    video.src = /hospital/video;
    video.play();
});*/

$(function () {
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#keshifont'
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
                {field:'specialty',width: 'full-200',align:'center'},

                /* {field:'doctorImage',title: '头像',align:'center',template: function (action) {
                     return "<img src='"data:image/png;base64,""+action+"'>";
                     }},*/

            ]]
            // 数据渲染完的回调
            ,done: function (res, curr, count) {
                $(".layui-table-cell").css("border", "0");
            }


        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
        // /*$('th').css({'background-color': '#5792c6', 'color': '#fff','font-weight':'bold'}) 表头的样式 */
        $('th').hide();//表头隐藏的样式
    });
})

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
                {field:'name',title: '医生姓名', width: 'full-200',align:'center'},
                {field:'jobName',title: '职称',width: 'full-200',align:'center'},

               /* {field:'doctorImage',title: '头像',align:'center',template: function (action) {
                    return "<img src='"data:image/png;base64,""+action+"'>";
                    }},*/

            ]]



        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
        // /*$('th').css({'background-color': '#5792c6', 'color': '#fff','font-weight':'bold'}) 表头的样式 */
         $('th').hide();//表头隐藏的样式
    });
})

//显示医生图片
$(function () {
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#imageTable'
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
                {field:'doctorImage',align:'center',templet: function (action) {
                      /*  var base64="data:image/jpg;base64,";
                        return "<div><img width='80px' src='"+base64+action.doctorImg+"'></div>";*/
                        // return "<div><img src='"+action.doctorImg+"' width='80px'></div>";
                        // return "<div><img src='"+action.doctorImage+"' style='width: 150px;'></div>";
                        return "<div><img src='"+"/image/"+action.doctorImage+"' ></div>";
                    }},
            ]]
          /*  ,cols: [[
                {field:'doctorImage',align:'center',templet:
                "<div ><img style=width: 140px;' src='{{d.doctorImage}}'></div>"},
            ]]*/



        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
        $('th').hide();//表头隐藏的样式
    });
})

//显示医生简介
$(function () {
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#remarkTable'
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
               {field:'remark',title:'信息简介',width: 'full-200',align:'center'},
            ]]



        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
         $('th').hide();//表头隐藏的样式
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
         $('th').hide();//表头隐藏的样式
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
                {field:'Patient_name',title: '正在就诊', width: 'full-200',align:'center'},
            ]]
        });
        // $('.layui-table .layui-table-cell > span').css({pading: 0});//表头字体样式
        // /*$('th').css({'background-color': '#5792c6', 'color': '#fff','font-weight':'bold'}) 表头的样式 */
         $('th').hide();//表头隐藏的样式
    });
})

function getByClass(parent, cls){
    if(parent.getElementsByClassName){
        return parent.getElementsByClassName(cls);
    }else{
        var res = [];
        var reg = new RegExp(' ' + cls + ' ', 'i')
        var ele = parent.getElementsByTagName('*');
        for(var i = 0; i < ele.length; i++){
            if(reg.test(' ' + ele[i].className + ' ')){
                res.push(ele[i]);
            }
        }
        return res;
    }
    var a =document.getElementsByClassName("layui-table-header");
    with(a.style){
        border = 0;
    }
}