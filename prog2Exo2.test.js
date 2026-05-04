import { getIvandryCount } from "./prog2Exo2.mjs";
import { assert } from "./node_modules/chai/index.js";
import { expect } from "./node_modules/chai/index.js";

describe(" Test de comptage des addresses Ivandry dans un tableau de string : " , ()=>{
    it (" title : compter les addresses similaires a la lettre ivandry : " , ()=>{
        expect( getIvandryCount(['ivandry lot 98',
                                'IVANdry fj89',
                                'Ambanidia lot VS 66 dda',
                                "IVanDry dis65"])).to.equal(3);
        expect( getIvandryCount(['ivandry lot 98',
                                'IVANdry fj89',
                                'Ambanidia lot VS 66 dda',
                                "IVanDry dis65"])).to.be.a('number');

});
});