console.log("---Example các kiểu dữ liệu cơ bản");
let number1: number = 5;
let number2: number = 2.8;
let phrase: string = 'Result is '
let permit: boolean = true;

const result = number1 + number2;
if(permit){
    console.log(phrase + result);
}else{
    console.log("Not show result")
}

console.log("Example Oject");
var person : {
    name: string,
    age: number
}

person = {
    name: 'Typescript',
    age: 11
}
console.log(person.name);

console.log('Example array');
// Cách 1: Sử dụng cặp ngoặc vuông
let hobbie: string[] = ['Sports','Cooking'];
// Cách 2: Sử dụng kiểu generic array
let hobbies: Array<string> = ['Sports','Cooking']

console.log('Example  tuple');
let employee: [number, string, boolean];
employee = [2, 'Sports', true];
employee.push('Cooking');
console.log('Output tuple: ' + employee);

console.log('---- Example any');
let examAny: any;
examAny = 2;
examAny = 'Cooking';

console.log('---Example union');
let examUnion: string|number;
examUnion = 2;
examUnion = 'Cooking';

console.log('---Example Enum');
enum examEnum {
    A,
    B,
    C = 4,
    D,
    E = 8,
    F,
}
console.log(examEnum.A, examEnum.B, examEnum.C, examEnum.D, examEnum.E, examEnum.F);
//[0, 1, 4, 5, 8, 9]


