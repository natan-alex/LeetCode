class Solution {
    /* private static final Map<Character, Character> chars = Map.of(
        '(', ')',
        '[', ']',
        '{', '}'
    ); */

    private static boolean isOpeningDelimiter(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static char getClosingDelimiterFor(char c) {
        switch (c) {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return '0';
        }
    }

    /* public boolean isValid(String s) {
        var stack = new Stack<Character>();

        for (int i = 0; i < s.length(); ++i) {
            var c = s.charAt(i);

            if (isOpeningDelimiter(c)) {
                stack.push(getClosingDelimiterFor(c));
            } else if (stack.size() == 0 || c != stack.pop()) {
                return false;
            }
        }

        return stack.size() == 0;
    } */
    
    public boolean isValid(String s) {
        var stack = new int[s.length() / 2];
        var index = 0;

        for (int i = 0; i < s.length(); ++i) {
            var c = s.charAt(i);

            if (isOpeningDelimiter(c)) {
                if (index >= stack.length) {
                    return false;
                }

                stack[index++] = getClosingDelimiterFor(c);
            } else if (index == 0 || c != stack[--index]) {
                return false;
            }
        }

        return index == 0;
    }
}
