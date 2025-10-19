function runOddEven() {
    const maxInput = prompt("Enter the max number:"); // replace readline with prompt
    const max = parseInt(maxInput);

    console.log(`Odd/Even numbers from 1 to ${max}:`);

    for (let i = 1; i <= max; i++) {
        if (i % 2 === 0) {
            console.log(`${i} is even`);
        } else if (i % 5 === 0) {
            console.log(`${i} is multiple of 5`);
        } else {
            console.log(`${i} is odd`);
        }
    }
}
