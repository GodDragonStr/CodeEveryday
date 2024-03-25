// alert("Welcome to JavaScript");
window.alert("window hello javascript")
document.write("document hello javascript")
console.log("console hello javascript")

var jsonstr = '{"name": "harry", "age": 999, "addr": ["Peiking", "Shanghai"]}';
var jsonobj = JSON.parse(jsonstr);

alert(JSON.parse(jsonstr).name);
alert(JSON.stringify(jsonobj));

h1s = window.document.getElementsByTagName('h1');
alert(h1s.length);

// for( var i = 0; i < h1s.length; i++) {
//     alert(h1s[i].textContent);
// }