import { getRetakeExams } from "./prog2Exo3.mjs";
import { assert } from "./node_modules/chai/index.js";
import { expect } from "./node_modules/chai/index.js";

describe ("test de la fonction pour savoir si un eleve soit faire un rattrapage ou pas :" , ()=>{
    it("title : tester la fonction qui montre si un eleve doit rattraper une matiere ou pas :" , ()=>{
        expect(getRetakeExams({
            std : "STD25099",
            firstName : "Lovanjatovo",
            lastName : "Rakotonirina",
            grades : {
                "PROG1" : 17,
                "WEB1" : 10,
                "PROG2" : 2,
                "WEB2" : 4
                }
            })).to.deep.equal(['PROG2' , 'WEB2']);
        expect(getRetakeExams({
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
        )).to.be.a('array');
    })
})