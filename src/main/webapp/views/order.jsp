<%--  Created by IntelliJ IDEA.  User: Administrator  Date: 2019/4/9  Time: 10:24  To change this template use File | Settings | File Templates.--%><%    String path = request.getContextPath();    String basePath = request.getScheme() + "://"            + request.getServerName() + ":" + request.getServerPort()            + path + "/";%><%@ page contentType="text/html;charset=UTF-8" language="java" %><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库--><%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> <!--数据格式化标签库--><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%> <!--数据库相关标签库--><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%> <!--常用函数标签库--><%@ page isELIgnored="false"%> <!--支持EL表达式，不设的话，EL表达式不会解析--><html><head>    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    <title>南航售票系统</title>    <link rel="stylesheet" href="<%=basePath %>static/css/orders.css">    <link rel="stylesheet" href="<%=basePath %>static/bootstrap-3.3.5-dist/css/bootstrap.min.css"></head><body><div class="contain">    <div class="toptext">            <span>                客服热线：110110&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;在线客服&nbsp;&nbsp;&nbsp;                |&nbsp;&nbsp;&nbsp;航班意见反馈<a style="color: red" class="glyphicon">❀❀&nbsp;欢迎您！&nbsp;${sessionScope.user.uname}</a></span>    </div>    <hr>    <div class="search">        <div class="tag">            <ul class="nav nav-pills  nav-stacked" style="padding-left:66px"><br><br>                <li role="presentation" ><a href="${pageContext.request.contextPath}/flight/queryfly.do">航班查询</a></li><br>                <li role="presentation"><a href="#"  style="color: red">我的订单</a></li><br>                <li role="presentation"><a href="#">个人资料</a></li><br>                <li role="presentation"><a href="#">暂未完善</a></li><br>                <li role="presentation"><a href="#">暂未完善</a></li><br>                <li role="presentation"><a href="#">暂未完善</a></li><br>                <li role="presentation"><a href="#">暂未完善</a></li><br>            </ul>        </div>        <div>            <div class="ordercontain">                <h4 style="color: red; font-weight: bold; ">我的订单</h4>                <hr>                <c:forEach items="${orders}" varStatus="i" var="order">                    <c:forEach items="${order.flights}" var="flight">                        <div class="tickets" style="background-image: url('<%=basePath %>static/image/bg3.jpg')">                            <div class="ticketsid">                                No: ${order.oid}<br>                                航班: ${flight.fid}                            </div>                            <span class="h">                           <h4>${flight.fbegin}</h4> <h4> >>> </h4>                           <h4>${flight.fend}</h4>                        </span>                            <span class="riqi">                                <h5>下单时间: <fmt:formatDate value="${order.otime}" type="date" pattern="yyyy-MM-dd HH:mm"/></h5>                                <h5><fmt:formatDate value="${flight.stime}" type="date" pattern="yyyy-MM-dd HH:mm"/>开</h5>                        </span>                            <span class="ren">                                <h5>${sessionScope.user.uname}</h5>                                <h5>证件类型: 居民身份证</h5>                        </span>                            <div class="unsubscribe">                                <a href="${pageContext.request.contextPath}/orders/deleteOrder.do?oid=${order.oid}&fid=${flight.fid}">退&nbsp;订</a>                            </div>                        </div>                    </c:forEach>                </c:forEach>            </div>        </div>    </div></div><script src="<%=basePath %>static/js/jquery-1.11.0.js"></script><script src="<%=basePath %>static/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script></body></html>