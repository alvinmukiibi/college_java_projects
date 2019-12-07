function main(input) {
    const printCharacters = new PrintCharacters(input);
    console.log("firstLetter: "+ printCharacters.next());
  	console.log("secondLetter: "+ printCharacters.next());
  	console.log("thirdLetter: "+ printCharacters.next());
}

// Write the PrintCharacters es-6 class or function here
function PrintCharacters(input){
    this.s = -1;
    this.e = input;
    this.next = function(){
        this.s = this.s +1;
        return this.e[this.s];
    }
}