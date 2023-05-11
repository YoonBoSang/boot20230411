$("#button1").click(function() {
	$.ajax("/sub35/link1", { method: "post" });
});

$("#button2").click(function() {
	$.ajax("/sub35/link2", { method: "post" });
});

$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method: "post",
		data: "name=손"
	});
});

$("#button4").click(function() {
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=inchoen&price=99.53"
	});
});

$("#button5").click(function() {
	$.ajax("/sub35/link5",
		{
			method: "post",
			data: "name=발&score=35.24&email=ehnui@rag"
		});
});

$("#button6").click(function() {
	$.ajax("/sub35/link6", {
		method: "post",
		data: "address=inchoen&product=seaFood&price=24.25"
	});
});


$("#button7").click(function() {
	const obj = { name: "son" };
	$.ajax("/sub35/link7", {
		method: "post",
		//		data: '{"name": "son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	});
});

$("#button8").click(function() {
	const obj = { address: "inchoen", name: "sony" };
	$.ajax("/sub35/link8", {
		method: "post",
		//		data: '{"address" : "inchoen", "name" : "sony"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	});
});

$("#button9").click(function() {
	const obj = {
		age: 25,
		name: "infoam",
		married: true
	};
	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		//		data: '{"age" : 25, "name" : "infoam", "married" : true}'
		data: JSON.stringify(obj)
	});
});

$("#button10").click(function() {
	const obj = {
		address : null,
		age : 30,
		name : "손흥민"
	};
	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "applitcation/json",
//		data: `{"address" : null, "age" : 30, "name" : "손흥민"}`
		data: JSON.stringify(obj)
	});
});

$("#button11").click(function() {
	const obj = {
		book : {title : "java", price : 300},
		address : "seoul"
	};
	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
//		data: '{"book" : {"title" : "java", "price" : 300}, "address": "seoul"}'
		data: JSON.stringify(obj)
	});
});

$("#button12").click(function() {
	const obj = {
		food : ["pizza", "coke", "coffee"],
		store : "pizza school"
	};
	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
//		data: '{"food" : ["pizza", "coke", "coffee"], "store": "pizza school"}'
		data: JSON.stringify(obj)
	});
});

$("#button13").click(function() {
	const obj = [
		"pizza", "coke", "coffee"
	];
	$.ajax("/sub35/link13", {
		method: "post",
		contentType: "application/json",
//		data: '["pizza", "coke", "coffe"]'
		data: JSON.stringify(obj)
	});
});
$("#button14").click(function() {
	const obj = [
		{name : "강백호", pos : "파포"},
		{name : "서태웅", pos : "스포"}
	];
	$.ajax("/sub35/link14", {
		method: "post",
		contentType: "application/json",
//		data: '[{"name":"강백호", "pos":"파포"}, {"name":"서태웅","pos":"스포"}]'
		data: JSON.stringify(obj)
	});
});

