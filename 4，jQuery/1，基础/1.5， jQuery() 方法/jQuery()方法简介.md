
jQuery() 函数有三种语法：

* 1，接受一个字符串，其中包含了用于匹配元素集合的 CSS 选择器：
jQuery(selector, [context])

* 2，使用原始 HTML 的字符串来创建 DOM 元素：
jQuery(html,[ownerDocument])

* 3，绑定一个在 DOM 文档载入完成后执行的函数：
jQuery( callback )

默认情况下，jQuery()方法使用 $ 符号简化调用，即 $(selector, [context])、$(html,[ownerDocument])、$( callback )。
