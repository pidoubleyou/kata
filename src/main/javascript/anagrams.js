// https://www.codewars.com/kata/523a86aa4230ebb5420001e1

function anagrams(word, words) {
   const size = word.length
  const characters = Array.from(word)
  
  return words.filter(entry => size === entry.length)
    .filter(entry => {
      let current = entry
      characters.forEach(character => {
        current = current.replace(character, "")
      })
      
      return current.length === 0
  })
}


const assert = require("chai").assert;

describe("Anagrams", function() {
  it("should return a list of all anagrams", function() {
    assert.deepEqual(anagrams('abba', ['aabb', 'abcd', 'bbaa', 'dada']), ['aabb', 'bbaa']);
    assert.deepEqual(anagrams('racer', ['crazer', 'carer', 'racar', 'caers', 'racer']), ['carer', 'racer']);
  });
  
  it("should return an empty array for no anagrams", function() {
    assert.deepEqual(anagrams('laser', ['lazing', 'lazy',  'lacer']), []);
  });
});
