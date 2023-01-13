var values = [20, 30, 40, 50];
values.push(10);
var names = new Set();
names.add('Harsh');
names.add('Mohit');
names.add('Kumar');
names.add('Harsh');
values.forEach(function (item) { return console.log(item); });
names.forEach(function (item) { return console.log(item); });
