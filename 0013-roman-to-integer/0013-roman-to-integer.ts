const romanNumerals = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000,
    'IV': 4,
    'IX': 9,
    'XL': 40,
    'XC': 90,
    'CD': 400,
    'CM': 900,
} as const;

function romanToInt(s: string): number {
    let result = 0;
    let currentCharIndex = 0;

    while (currentCharIndex < s.length) {
        const currentChar = s.charAt(currentCharIndex);
        const lookAhead = s.charAt(currentCharIndex + 1);

        if (!lookAhead) {
            result += romanNumerals[currentChar];
            currentCharIndex += 1;
        } else if (currentChar + lookAhead in romanNumerals) {
            result += romanNumerals[currentChar + lookAhead];
            currentCharIndex += 2;
        } else {
            result += romanNumerals[currentChar];
            currentCharIndex += 1;
        }
    }

    return result;
};