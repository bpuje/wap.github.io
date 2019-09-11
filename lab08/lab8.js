
// Exercise 1
function ex1() {
    String.prototype.filter = function (names) {
        let strArr = this.toString().split(" ");
        for (let i = 0; i < strArr.length; i++) {
            for (let j = 0; j < names.length; j++) {
                if (strArr[i] === names[j]) {
                    for (let k = i; k < strArr.length; k++) {
                        strArr[k] = strArr[k + 1];
                    }
                    i--;
                }
            }
        }
        let resArr = [];
        for (let i = 0; i < strArr.length; i++) {
            if (strArr[i] != undefined) {
                resArr[i] = strArr[i];
            }
        }
        return resArr.join(" ");
    };
    console.log("This house is not nice!".filter(['not', 'is']));
}

//Exercise 2
function ex2() {
    let bSrt = [6, 4, 0, 3, -2, 1];
    let swap;

    function bubbleSort(arr) {
        swap = false;
        let end = arr.length - 1;
        for (let i = 0; i < end; i++) {
            for (let j = 1; j < end; j++) {
                if (arr[i] > arr[j]) {
                    swap = true;
                    [arr[i], arr[j]] = [arr[j], arr[i]];
                }
            }
        }
        end--;
    }

    do {
        bubbleSort(unsortedArr);
    } while (swap);
    console.log(unsortedArr);
}

//version 2
function bubbleSS(arr) {
    var bSrt = [6, 4, 0, 3, -2, 1];
    var swapped = true;

    while(swapped){
        swapped = false;
        for(var i=0; i<arr.length; i++){
            if(arr[i] > arr[i+1]){
                var temp = arr[i+1];
                arr[i+1] = arr[i+1];
                arr[i] = temp;
                swapped = true;
            }
        }
    }
    return arr;
}

//version 3
var arr = [6, 4, 0, 3, -2, 1];

function bubbleSort(arr) {
    var a, b, temp;
    temp = arr.length;
    while(temp--){
        for(a=0, b=1; a<temp; a++, b++)
            if(arr[a] > arr[b]){
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
    }
    return arr;
}
console.log(bubbleSort(arr));

// Exercise 3
var person = (function () {
    let name;
    let subject;

    // private functions and getter
    let getName = function () {
        return name;
    };
    let getSubject = function () {
        return subject;
    };

    // public functions and setter
    let setName = function (personName) {
        name = personName;
    };

    let setSubject = function (personSubject) {
        subject = personSubject;
    };

    return {
        'setName': setName,
        'setSubject': setSubject,
        'teach': function () {
            return getName() + " is now teaching " + getSubject();
        }
    };
})();
let teacher = Object.create(person);
teacher.setName('Tina Xing');
teacher.setSubject('WAP');
console.log(teacher.teach());

person.setName('Purevdemberel');
person.setSubject("WAP");
console.log(teacher.teach());


// Exercise 4

class Person{
    constructor(name){
        this.name = name;
    }
    greet(){
        console.log('Greetings, My name is ' + this.name + ' and I am ' + this.age + ' years old.');
    }
}

class Student extends Person {
    constructor(age, major){
        super('Purevdemberel');
        this.age = age;
        this.major = major;
    }
    greet() {
        console.log('Good morning!, and in case I dont see you good afternoon, good evening and good night!');
    }

    greetTwice(){
        super.greet();

    }

    greetMajor(){
        console.log('Hey, my name is ' + this.name + ' and I am studying ' + this.major);
    }
}

class Professor extends Person {
    constructor(dept) {
        super('Puje');
        this.dept = dept;
    }

    greetDepartment(){
        console.log('Good day, My name is ' + this.name + ' and I am in the ' + this.dept + 'department.');
    }

}

let student = new Student(29);
student.greetTwice();
student.greet();

let stMajor = new Student(29, 'Software Engineer');
stMajor.greetMajor()


let department = new Professor('Computer Science ');
department.greetDepartment();


let professor = new Professor('MBA');
let student2 = new Student(25, "Data science");
professor.greetDepartment();
student2.greetTwice();

let person2 = new Person('Bob');
console.log(person2.__proto__=== Person.prototype);
console.log(professor.__proto__=== Professor.prototype);
