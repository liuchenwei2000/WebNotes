$(document).ready(function() {
	// 按钮被点击时触发事件
	$("button").click(function() {
		$("#p1").hide();
	});
	// 按钮被双击时触发事件
	$("button").dblclick(function() {
		$("#p2").hide();
	});
	// 按钮获取焦点时触发事件
	$("button").focus(function() {
		$("#p3").hide();
	});
	// 按钮在鼠标悬停时触发事件
	$("button").mouseover(function() {
		$("#p4").hide();
	});
});