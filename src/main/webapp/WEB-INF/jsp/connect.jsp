<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/wangxiao/css/layui.css"  media="all">
    <link href="/wangxiao/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend>联系我们</legend>
</fieldset>

<div class="layui-carousel col-md-offset-2" id="test1" lay-filter="test1">
    <div carousel-item="">
        <div><img src="/wangxiao/images/connect/connect4.png"/></div>
        <div><img src="/wangxiao/images/connect/connect5.png"/></div>
        <div><img src="/wangxiao/images/connect/connect6.png"/></div>
        <!--<div>条目4</div>-->
        <!--<div>条目5</div>-->
    </div>
</div>

<div class="col-md-offset-6">
    <h4>联系电话：187xxxx5752</h4>
    <h4>QQ：5941xxx36</h4>
</div>

<!--<div class="layui-carousel" id="test2" style="margin-top: 15px;">-->
    <!--<div carousel-item="">-->
        <!--<div>条目1</div>-->
        <!--<div>条目2</div>-->
    <!--</div>-->
<!--</div>-->
<!--<div>-->
<!--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">-->
    <!--<legend>设定各种参数</legend>-->
<!--</fieldset>-->
<!--<div class="layui-form">-->
    <!--<div class="layui-form-item">-->
        <!--<div class="layui-inline">-->
            <!--<label class="layui-form-label">宽高</label>-->
            <!--<div class="layui-input-inline" style="width: 98px;">-->
                <!--<input type="tel" name="width" value="380" autocomplete="off" placeholder="width" class="layui-input demoSet">-->
            <!--</div>-->
            <!--<div class="layui-input-inline" style="width: 98px;">-->
                <!--<input type="tel" name="height" value="310" autocomplete="off" placeholder="height" class="layui-input demoSet">-->
            <!--</div>-->
        <!--</div>-->
    <!--</div>-->

    <!--<div class="layui-form-item">-->
        <!--<label class="layui-form-label">动画类型</label>-->
        <!--<div class="layui-input-block">-->
            <!--<div class="layui-btn-group demoTest" style="margin-top: 5px;">-->
                <!--<button class="layui-btn layui-btn-sm" style="background-color: #5FB878;" data-type="set" data-key="anim" data-value="default">左右切换</button>-->
                <!--<button class="layui-btn layui-btn-sm" data-type="set" data-key="anim" data-value="updown">上下切换</button>-->
                <!--<button class="layui-btn layui-btn-sm" data-type="set" data-key="anim" data-value="fade">渐隐渐显</button>-->
            <!--</div>-->
        <!--</div>-->
    <!--</div>-->

    <!--<div class="layui-form-item">-->
        <!--<label class="layui-form-label">箭头状态</label>-->
        <!--<div class="layui-input-block">-->
            <!--<div class="layui-btn-group demoTest" style="margin-top: 5px;">-->
                <!--<button class="layui-btn layui-btn-sm" style="background-color: #5FB878;" data-type="set" data-key="arrow" data-value="hover">悬停显示</button>-->
                <!--<button class="layui-btn layui-btn-sm" data-type="set" data-key="arrow" data-value="always">始终显示</button>-->
                <!--<button class="layui-btn layui-btn-sm" data-type="set" data-key="arrow" data-value="none">不显示</button>-->
            <!--</div>-->
        <!--</div>-->
    <!--</div>-->

    <!--<div class="layui-form-item">-->
        <!--<label class="layui-form-label">指示器位置</label>-->
        <!--<div class="layui-input-block">-->
            <!--<div class="layui-btn-group demoTest" style="margin-top: 5px;">-->
                <!--<button class="layui-btn layui-btn-sm" style="background-color: #5FB878;" data-key="indicator" data-type="set" data-value="inside">容器内部</button>-->
                <!--<button class="layui-btn layui-btn-sm" data-type="set" data-key="indicator" data-value="outside">容器外部</button>-->
                <!--<button class="layui-btn layui-btn-sm" data-type="set" data-key="indicator" data-value="none">不显示</button>-->
            <!--</div>-->
        <!--</div>-->
    <!--</div>-->

    <!--<div class="layui-form-item">-->
        <!--<div class="layui-inline">-->
            <!--<label class="layui-form-label">自动切换</label>-->
            <!--<div class="layui-input-block">-->
                <!--<input type="checkbox" name="switch" lay-skin="switch" checked="" lay-text="ON|OFF" lay-filter="autoplay">-->
            <!--</div>-->
        <!--</div>-->
        <!--<div class="layui-inline">-->
            <!--<label class="layui-form-label" style="width: auto;">时间间隔</label>-->
            <!--<div class="layui-input-inline" style="width: 120px;">-->
                <!--<input type="tel" name="interval" value="3000" autocomplete="off" placeholder="毫秒" class="layui-input demoSet">-->
            <!--</div>-->
        <!--</div>-->
    <!--</div>-->
<!--</div>-->
<!--</div>-->
<!--<div class="layui-carousel" id="test3" lay-filter="test4">-->
    <!--<div carousel-item="">-->
        <!--<div><img src="images/connect/connect1.png"/></div>-->
        <!--<div><img src="images/connect/connect2.png"/></div>-->
        <!--<div><img src="images/connect/connect3.png"/></div>-->
        <!--<div>条目4</div>-->
        <!--<div>条目5</div>-->
    <!--</div>-->
<!--&lt;!&ndash;</div>&ndash;&gt;-->

<!--&lt;!&ndash;<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">&ndash;&gt;-->
    <!--&lt;!&ndash;<legend>填充轮播元素 - 以图片为例</legend>&ndash;&gt;-->
<!--&lt;!&ndash;</fieldset>&ndash;&gt;-->

<!--&lt;!&ndash;<div class="layui-carousel" id="test10">&ndash;&gt;-->
    <!--&lt;!&ndash;<div carousel-item="">&ndash;&gt;-->
        <!--&lt;!&ndash;<div><img src="//res.layui.com/images/layui/demo/1.png"></div>&ndash;&gt;-->
        <!--&lt;!&ndash;<div><img src="//res.layui.com/images/layui/demo/2.png"></div>&ndash;&gt;-->
        <!--&lt;!&ndash;<div><img src="//res.layui.com/images/layui/demo/3.png"></div>&ndash;&gt;-->
        <!--&lt;!&ndash;<div><img src="//res.layui.com/images/layui/demo/4.png"></div>&ndash;&gt;-->
        <!--&lt;!&ndash;<div><img src="//res.layui.com/images/layui/demo/5.png"></div>&ndash;&gt;-->
        <!--&lt;!&ndash;<div><img src="//res.layui.com/images/layui/demo/6.png"></div>&ndash;&gt;-->
        <!--&lt;!&ndash;<div><img src="//res.layui.com/images/layui/demo/7.png"></div>&ndash;&gt;-->
    <!--&lt;!&ndash;</div>&ndash;&gt;-->
<!--</div>-->


<script src="/wangxiao/js/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['carousel', 'form'], function(){
        var carousel = layui.carousel
            ,form = layui.form;

        //常规轮播
        carousel.render({
            elem: '#test1'
            ,arrow: 'always'
        });

        //改变下时间间隔、动画类型、高度
        carousel.render({
            elem: '#test2'
            ,interval: 1800
            ,anim: 'fade'
            ,height: '120px'
        });

        //设定各种参数
        var ins3 = carousel.render({
            elem: '#test3'
        });
        //图片轮播
        carousel.render({
            elem: '#test10'
            ,width: '778px'
            ,height: '440px'
            ,interval: 5000
        });

        //事件
        carousel.on('change(test4)', function(res){
            console.log(res)
        });

        var $ = layui.$, active = {
            set: function(othis){
                var THIS = 'layui-bg-normal'
                    ,key = othis.data('key')
                    ,options = {};

                othis.css('background-color', '#5FB878').siblings().removeAttr('style');
                options[key] = othis.data('value');
                ins3.reload(options);
            }
        };

        //监听开关
        form.on('switch(autoplay)', function(){
            ins3.reload({
                autoplay: this.checked
            });
        });

        $('.demoSet').on('keyup', function(){
            var value = this.value
                ,options = {};
            if(!/^\d+$/.test(value)) return;

            options[this.name] = value;
            ins3.reload(options);
        });

        //其它示例
        $('.demoTest .layui-btn').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });
    });
</script>
</body>
</html>