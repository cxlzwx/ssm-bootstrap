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
    <title>第二个vue例子学习</title>
    <!-- 开发环境版本，包含了用帮助的命令行警告 -->
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
</head>
<body>

        <!-- 下面这两种写法同样v-bind:和：-->
        <div id="app" v-bind:title="title">
            <h2>hello world</h2>
        </div>
        <!-- 数据的双向绑定，input框中的值改变，对应的div中的值跟着改变，反之亦然 -->
        <div id="app2">
            <div :title="title">hello world</div>
            <input v-model="content">
            <div>{{content}}</div>
        </div>
        <script>
            var app = new Vue({
                el: '#app',
                data: {
                    title: "this is hello world"
                }
            });
            var app2 = new Vue({
                el: '#app2',
                data: {
                    title:"this is hello world",
                    content:"this is a content"
                }
            });
        </script>

</body>
</html>
