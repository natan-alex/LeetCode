function longestCommonPrefix(strs: string[]): string {
    let smallestStringIndex = 0;

    for (let i = 1; i < strs.length; ++i) {
        if (strs[i].length < strs[smallestStringIndex].length) {
            smallestStringIndex = i;
        }
    }

    let prefix = "";

    for (let i = 0; i < strs[smallestStringIndex].length; ++i) {
        const c = strs[smallestStringIndex][i];
        let addToPrefix = true;

        for (let j = 0; j < strs.length; ++j) {
            if (j === smallestStringIndex) continue;

            if (strs[j][i] !== c) {
                addToPrefix = false;
                break;
            }
        }

        if (addToPrefix) {
            prefix += c;
        } else {
            break;
        }
    }

    return prefix;
};