<%-- 1, "Content-Type" ����Ϊ "text/event-stream" --%>
<%@ page contentType="text/event-stream; charset=UTF-8"%>
<%
    response.setHeader("Cache-Control", "no-cache");// 2���涨����ҳ����л���
	/*
	"retry:" �� "data:" ���ǹ̶���ʽ����β��Ҫ "\n\n" ��Ϊ�����ʶ��ı��
	*/
	out.print("retry: 1000\n\n");// 3��ÿ������ ms ����һ���¼�
    out.print("data: server Time" + new java.util.Date() +"\n\n");// 4��������͵���Ϣ
    out.flush();// 5������ҳˢ���������
%>