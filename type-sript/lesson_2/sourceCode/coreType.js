console.log("---Example các kiểu dữ liệu cơ bản");
var number1 = 5;
var number2 = 2.8;
var phrase = 'Result is ';
var permit = true;
var result = number1 + number2;
if (permit) {
    console.log(phrase + result);
}
else {
    console.log("Not show result");
}
console.log("Example Oject");
var person;
person = {
    name: 'Typescript',
    age: 11
};
console.log(person.name);
console.log('Example array');
// Cách 1: Sử dụng cặp ngoặc vuông
var hobbie = ['Sports', 'Cooking'];
// Cách 2: Sử dụng kiểu generic array
var hobbies = ['Sports', 'Cooking'];
console.log('Example  tuple');
var employee;
employee = [2, 'Sports', true];
employee.push('Cooking');
console.log('Output tuple: ' + employee);
