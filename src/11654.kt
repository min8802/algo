fun charToAscii(c:Char): Int {
    val ascii = c.code
    return ascii
}

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            val input = readLine() ?: break
            if(input.length != 1) { //여기서 input은 문자열이고 문자열의 길이는 length로 확인12
                println("한 글자만 입력해 주세요")
            } else {
                val result = charToAscii(input[0])// input만 넣으면 Char를 받아야 한다고 함
                println(result)
                break
            }
        } catch (ex: Exception) {
            println(ex.message)
        }
    }
}