function ajaxError(data) {
    if (data.status == "404") {
        alert('404错误的时候返回内容：'+data);
        alert('请求地址出错！错误代码：404');
    } else if (data.status == "302") {
        alert('连接网页出错! 错误代码：302');
    } else if (data.status == "timeout") {
        alert("请求超时!");
    } else if (data.status == "200") {
        alert("200!");
    } else {
        alert('请求未响应!请检查网络或VPN连接');
    }
}