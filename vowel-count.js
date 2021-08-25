/* Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces. */

function getCount(str) {
    var vowelsCount = 0;
    
    strArray = Array.from(str);
    
    for (let i = 0; i < strArray.length; i++) {
      if (strArray[i] == 'a' || strArray[i] == 'e' || strArray[i] == 'i' || strArray[i] == 'o' || strArray[i] == 'u'){
        vowelsCount += 1;
      }
    }
    
    return vowelsCount;
 }

console.log(getCount("abracadabra")); //expected result, 5
console.log(getCount("pear tree")); //expected result, 4
console.log(getCount("o a kak ushakov lil vo kashu kakao")); //expected result, 13
console.log(getCount("my pyx")); //expected result, 0 