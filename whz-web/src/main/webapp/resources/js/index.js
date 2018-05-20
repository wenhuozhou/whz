var Index ={
	
	/**
	 * 初始化系统菜单
	 */	
	initMenuTree:function(){
		$('#main_menu').tree({    
		    url: "menu/listById",
		    onClick:function(node){
		    	if(node.menuType == MenuConstant.MENU){
		    		Index.addTab(node.text, node.url);
		    	}
		    }
		});  
	},
	
	/**
	 * 添加tabs标签页
	 * @param menuName
	 * @param menuUrl
	 */
	addTab:function(menuName,menuUrl){		
		var flag = $('#main_context').tabs('exists',menuName);
		if(!flag){
			$('#main_context').tabs('add',{    
			    title: menuName,    
			    href: menuUrl,    
			    closable: true  
			}); 
		}else{
			$('#main_context').tabs('select',menuName);
		}
	}
		
};

$(function(){ 
	//左边菜单实例化
	Index.initMenuTree();
	
	
});