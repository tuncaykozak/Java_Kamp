//var,let,const

let sayi1 = 10;
sayi1 = "Engin Demirog";
let student = { id: 1, name: "Engin" };
//console.log(student);

function save(puan = 10, ogrenci) {
    console.log(ogrenci.name + " : " + puan);
}

//save(undefined, student);

let students = ["Engin Demirog", "Halit", "Engin Toprak", "Busra"];
//console.log(students);

let students2 = [
    student,
    { id: 2, name: "Halit" },
    "Ankara",
    { city: "Istanbul" },
];
//console.log(students2);

//rest (geriye kalanlar)-params-varArgs

let showProducts = function(id, ...products) {
    console.log(id);
    console.log(products);
};

//console.log(typeof showProducts); // function

//showProducts(10, ["Elma", "Armut", "Karpuz"]);

//spread (ayristirma)

let points = [1, 2, 3, 4, 50, 4, 60, 14];
console.log(...points);
console.log(Math.max(...points));
console.log(...
    "ABC", "D", ...
    "EFG", "H"); // A B C D E F G H

//destructuring

let populations = [10000, 20000, 30000, [40000, 100000]];
let [small, medium, high, [veryHigh, maximum]] = populations;
console.log(small);
console.log(medium);
console.log(high);
console.log(veryHigh);
console.log(maximum);

function someFunction([small1], number) {
    console.log(small1);
}

someFunction(populations);

let category = { id: 1, name: "icecek" };
console.log(category.id);
console.log(category.name);

let { id, name } = category;
console.log(id);
console.log(name);