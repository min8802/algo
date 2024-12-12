
//N = 입력 받는 N개의 정수, X = 비교에 사용할 정수 1개
fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            //입력 처리
            val (N, X) = readLine().split(" ").map { it.toInt() }
            require(N in 1..10000 && X in 1..10000) {"N과 X 1~10000 숫자로 입력해 주세요"}
            var line: List<Int>
            line = readLine().split(" ").map { it.toInt() }
            require(line.size == N) {"입력 받을 수 있는 숫자의 갯수는 $N 개 입니다"}

            //출력 처리
            val answerList = mutableListOf<Int>()
            for (i in 0..N-1) {
                if(line[i] < X)
                    answerList.add(line[i])
            }
            require(answerList.size != 0) {"X 보다 작은 수가 적어도 하나 있어야 합니다"}
            println(answerList.joinToString(" "))
            //요소를 순회하면서 요소를 문자열로 변환 후 구분자로 연결
            break
        } catch (ex: IllegalArgumentException) {
            println(ex.message)
        }
    }
}