import kotlin.reflect.typeOf

// 일렬로 세워
// n번째랑 n+1번째 똑같으면 지워 다를때까지
// 출력


fun main() = with(System.`in`.bufferedReader()) {
    val inputList = mutableListOf<Int>()
    while (true) {
        try {
            val row = readLine().toInt()
            for (i in 1..row) {
                inputList += readLine().toInt()
            }

            inputList.sort()

            for (i in 0 until row) {
                println(inputList[i])
            }

            break
        } catch (ex:Exception) {
                println(ex.message)
        }
    }
}