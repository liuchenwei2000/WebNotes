<%-- 1, "Content-Type" 设置为 "text/event-stream" --%>
<%@ page contentType="text/event-stream; charset=UTF-8"%>
<%
    response.setHeader("Cache-Control", "no-cache");// 2，规定不对页面进行缓存
	/*
	"retry:" 和 "data:" 都是固定格式，结尾需要 "\n\n" 作为浏览器识别的标记
	*/
	out.print("retry: 1000\n\n");// 3，每隔多少 ms 发送一次事件
    out.print("data: server Time" + new java.util.Date() +"\n\n");// 4，输出发送的信息
    out.flush();// 5，向网页刷新输出数据
%>