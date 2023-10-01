class Solution {
    fun myAtoi(s: String): Int {
        var startIndex = -1
        var isNegative = false
        var signDefined = false

        var i = 0
        
        while (i < s.length) {
            when (s[i]) {
                '+' -> {
                    if (startIndex >= 0 || signDefined) { break }
                    signDefined = true
                }
                '-' -> {
                    if (startIndex >= 0 || signDefined) { break }
                    isNegative = true
                    signDefined = true
                }
                ' ' -> {
                    if (startIndex >= 0 || signDefined) { break }
                }
                in '0'..'9' -> {
                    if (startIndex < 0) {
                        startIndex = i
                    }
                }
                else -> {
                    break
                }
            }
            
            i++
        }
        
        if (startIndex < 0) return 0
        
        val numberAsString = s.slice(startIndex..(i-1))
        
        var number = numberAsString.toIntOrNull()
        
        if (number == null) {
            return if (isNegative) Int.MIN_VALUE else Int.MAX_VALUE
        }
        
        return if (isNegative) number * -1 else number
    }
}