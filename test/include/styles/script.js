;
(function($, window, document, undefined){
	var pluginName = 'calculate'
	// ,defaults = {
	// 		defaultOperation = 
	// 	}
		;
	function Calculate(element, options){
		this.element = element;
        this.config = $.extend({}, defaults, options);
        this.defaults = defaults;
        this.name = pluginName;
        this.init();
	};
	Calculate.prototype.init = function{
		var firstNum=$("#firstNum"),
			secondNum=$("secondNum"),
			add=$("#addition"),
			subtrack=$("subtraction"),
			divide=$("#division"),
			multiply=$("#multiplication"),
			operation=$("#operation");

		setOperation(add, subtrack, divide, multiply);

	};
	Calculate.prototype.setOperation = function(add, subtrack, divide, multiply){
		$(add).click(function(){
			alert("hi");
		});
	};


	$.fn[pluginName] = function(options) {
        return this.each(function() {
            if (!$.data(this, 'plugin' + pluginName)) {
                $.data(this, 'plugin' + pluginName,
                    new Calculate(this, options));
            }
        });
    };

})(jQuery);