// 색종이 3 7 오면 3~13 가로 7~17 세로 길이임 그래서 총 넓이 100
// 색종이 5 2 오면 5~15 가로 2~12 세로 길이임 겹치는 구간이 5~13 가로 7~12 세로 8 * 5 = 40임
// 색종이 장수 받으면 우선 장수 * 100 면적 구한 이후에 - 겹치는 구간 하기 in을 써볼까?

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            val totalPaper = readLine().toInt()
            val inputList = readLine().split(" ").map { it.toInt() }
            val maxNum = inputList.max()
            val minNum = inputList.min()
            println(maxNum - minNum)
            break
        } catch (ex:Exception) {
                println(ex.message)
        }
    }
}