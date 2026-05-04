export function getRetakeExams(student){
    const rattrapage = [];
    const notes = student.grades;
    for (let matiere in notes){
        if (notes[matiere] < 10){
            rattrapage.push(matiere)
        }
    }
    return rattrapage;
}

console.log(getRetakeExams({
    std : "STD25099",
    firstName : "Lovanjatovo",
    lastName : "Rakotonirina",
    grades : {
        "PROG1" : 17,
        "WEB1" : 10,
        "PROG2" : 2,
        "WEB2" : 4
    }
    }
));