var Utils ={
	
	/**
     * ajax封装
     * url 发送请求的地址
     * data 发送到服务器的数据，数组存储，如：{"username": "张三", "password": 123456}
     * suceessCallback 成功回调函数
     * errorCallback 错误回调函数
     * 
     */
	ajax: function(url, data, suceessCallback, errorCallback){
		$.ajax({
			url: url,
			type: "POST",
			data: data,
			dataType: "json",
			success: function(res){
				if(res.success){
					Utils.info(res.message);
				}else{
					Utils.error(res.message);
				}
				if(suceessCallback){
					suceessCallback(res);
				}
			},
			error: function(err){
				if(errorCallback){
					errorCallback(err);
				}else{
					Utils.error(err.message);
				}
			}
		});	
	},
	
	
	confirm : function(message,callback){
		$.messager.confirm("请确认！",message,function(r){
			if(r){
				callback(r);
			}
		});
	},
	
	
	info:function(message){
		$.messager.alert("提示",message,"info");
	},
	
	error:function(message){
		$.messager.alert("错误",message,"error");
	},
	
	warning:function(message){
		$.messager.alert("警告",message,"warning");
	}
};