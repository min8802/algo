// 숫자 주어지면 300으로 먼저 나누고
// 몫이 0이면 나머지를 60 으로 나누고
// 몫이 0이 되면 나머지를 10으로 나누기
// 이 과정에서 나머지가 0이 아닌경우가 있을 땐 바로 -1 출력하기

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            val value = readLine().toInt()
            require(value in 1..1000) {"1~1000사이의 숫자를 입력해주세요"}
            if (value % 10 != 0) {
                println(-1)
                break
            }


            val count300 = value / 300
            val count60 = (value % 300) / 60
            val count10 = (value % 60) / 10

            println("$count300 $count60 $count10")

            break
        } catch (ex:Exception) {
                println(ex.message)
        }
    }
}