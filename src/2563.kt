// 색종이 3 7 오면 3~13 가로 7~17 세로 길이임 그래서 총 넓이 100
// 색종이 5 2 오면 5~15 가로 2~12 세로 길이임 겹치는 구간이 5~13 가로 7~12 세로 8 * 5 = 40임
// 색종이 장수 받으면 우선 장수 * 100 면적 구한 이후에 - 겹치는 구간 하기 in을 써볼까?

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            val totalPaper = readLine().toInt()
            val paper : Array<Array<Int>> = Array(100) {Array(100) {0} }
            var res = 0
            for(i in 1..totalPaper) {
                val (x,y) = readLine().split(" ").map { it.toInt() }
                for (dx in 0..9) {
                    for (dy in 0..9) {
                        paper[x+dx][y+dy] = 1
                    }
                }

            }
            for (a in 0..99) {
                for (b in 0..99) {
                    if(paper[a][b] == 1) {
                        res += 1
                    }
                }
            }
            println("$res")
            break
        } catch (ex:Exception) {
                println(ex.message)
        }
    }
}