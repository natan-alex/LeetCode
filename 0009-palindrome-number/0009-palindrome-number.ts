function isPalindrome(x: number): boolean {
    const asString = x.toString();
    const stringLength = asString.length;

    for (let i = 0; i <= stringLength / 2; ++i) {
        if (asString[i] !== asString[stringLength - i - 1]) return false;
    }

    return true;
};
