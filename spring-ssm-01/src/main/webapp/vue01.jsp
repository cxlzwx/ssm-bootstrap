<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2018/5/4
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个vue例子学习</title>
    <!-- 开发环境版本，包含了用帮助的命令行警告 -->
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
</head>
<body>
    <div id="app">
    </div>
    <!-- 下面两种绑定事件的效果相同 -->
    <div id="app2" v-on:click="clickTest">{{message}}</div>
    <div id="app3" @click="clickTest">{{message}}</div>
    <div id="app4" v-text="message"></div>
    <div id="app5" v-html="message"></div>
    <script type="text/javascript">
        var app = new Vue({
            el: '#app',
            template:'<h1>hello {{message}}</h1>',
            data: {
                message: 'Vue!',
                number:89
            }
        })
        var app2 = new Vue({
            el:'#app2',
            data:{
              message:'hello world'
            },
            methods:{
                clickTest:function(){
                    this.message = "haha"
                }
            }
        });
        var app3 = new Vue({
            el:'#app3',
            data:{
                message:'hello world'
            },
            methods:{
                clickTest:function(){
                    this.message = "haha"
                }
            }
        });
        var app4 = new Vue({
            el:'#app4',
            data:{
                message:'<h1>hello world</h1>'
            }
        });
        var app5 = new Vue({
            el:'#app5',
            data:{
                message:'<h1>hello world</h1>'
            }
        });
    </script>

</body>
</html>
