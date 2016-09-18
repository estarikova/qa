$(function() {
    $("#addition").click(function() {
    	var firstNum = $("#firstNum").val(),
        secondNum = $("#secondNum").val();
        $("#operation").append("<p>+</p>");
        addition(firstNum, secondNum);
    });

    $("#subtraction").click(function() {
    	var firstNum = $("#firstNum").val(),
        secondNum = $("#secondNum").val();
        $("#operation").append("<p>-</p>");
        sub(firstNum, secondNum);
    });

    $("#division").click(function() {
    	var firstNum = $("#firstNum").val(),
        secondNum = $("#secondNum").val();
        $("#operation").append("<p>:</p>");
        division(firstNum, secondNum);
    });

    $("#multiplication").click(function() {
    	var firstNum = $("#firstNum").val(),
        secondNum = $("#secondNum").val();
        $("#operation").append("<p>*</p>");
        mult(firstNum, secondNum);
    });

    $("#clean").click(function() {
        $("#operation p").remove();
        $("#resultBlock p").remove();
    });

    function addition(firstNum, secondNum) {
        var result = parseInt(firstNum) + parseInt(secondNum);
        $("#resultBlock").append("<p>" + result + "</p>");
    };

    function sub(firstNum, secondNum) {
        var result = parseInt(firstNum) - parseInt(secondNum);
        $("#resultBlock").append("<p>" + result + "</p>");
    };

    function mult(firstNum, secondNum) {
        var result = parseInt(firstNum) * parseInt(secondNum);
        $("#resultBlock").append("<p>" + result + "</p>");
    };

    function division(firstNum, secondNum) {
        var result = parseInt(firstNum) / parseInt(secondNum);
        $("#resultBlock").append("<p>" + result + "</p>");
    };
});
