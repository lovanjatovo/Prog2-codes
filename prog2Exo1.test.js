import { countAdults } from "./prog2Exo1.mjs";
import { assert } from "./node_modules/chai/index.js";
import { expect } from "./node_modules/chai/index.js";


describe("Test de comptage des adultes !" , ()=>{
    it("title : comptage de nombre de majeur dans un tableau d'age : " , ()=>{
        expect(countAdults([18,19,4,13])).to.equal(2);
        expect(countAdults([18,19,4,13])).to.be.a('number');
    });
});