// 동호는 내년에 초등학교 입학

// 첫줄에 구간의 시작과 끝을 나타내는 A,B

// 1, 2, 2, 3, 3, 3 ...

// list[A] ~ list[B] 까지 다 더하기

// 수열 리스트를 먼저 만들고 A B 입력 받아서 구간 더하기

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            val value = readLine().toInt()
            val standardString = StringBuilder(readLine())
            for(i in 1..value-1) {
                val getRead : String = readLine()
                for (j in standardString.indices) {
                    if(standardString[j] != getRead[j]) {
                        standardString[j] = '?'
                    }
                }

                //두번째 받은 readLine() 부터는 list랑 비교해
                //비교해서 같으면 넘어가고 달라? 그럼 해당 인덱스는 ?로 변경해

                //세번째 받은 readLine()도 해당 list랑 비교해
                //비교해서 같으면 넘어가고 다르면 ??로 변경해
            }
            println(standardString)
            break

        } catch (ex:Exception) {
                println(ex.message)
        }
    }
}
