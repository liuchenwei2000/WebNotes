var i = 0;

function timedCount() {
	i = i + 1;
	postMessage(i);// ������ HTML ҳ�洫��һ����Ϣ
	setTimeout("timedCount()", 500);
}

timedCount();