$("h1").css("color","red");
console.log($("h1").text());
console.log($("link").attr("href"));
$("h1").click(function(){
  $("h1").text("Hi");


});
$("body").keypress(function(e){
  $("h1").text(e.key);

});
