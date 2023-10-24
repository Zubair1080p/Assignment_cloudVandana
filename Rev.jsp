function reverseWordsWithoutBuiltInMethods(sentence) {
    let reversedSentence = '';
    let word = '';
    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            // When a space or the end of the sentence is encountered, reverse the word
            if (i === sentence.length - 1) {
                word += sentence[i];
            }
            let reversedWord = '';
            for (let j = word.length - 1; j >= 0; j--) {
                reversedWord += word[j];
            }
            reversedSentence += reversedWord;
            if (i !== sentence.length - 1) {
                reversedSentence += ' '; // Add a space after the reversed word
            }
            word = ''; // Reset the word
        } else {
            word += sentence[i]; // Build the word character by character
        }
    }
    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsWithoutBuiltInMethods(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"
