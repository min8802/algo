// 동호는 내년에 초등학교 입학

// 첫줄에 구간의 시작과 끝을 나타내는 A,B

// 1, 2, 2, 3, 3, 3 ...

// list[A] ~ list[B] 까지 다 더하기

// 수열 리스트를 먼저 만들고 A B 입력 받아서 구간 더하기

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            val value = readLine().split(" ").map {it.toInt()}
            require(value[0] in 1..1000) {"1~1000사이의 숫자를 입력해주세요"}
            require(value[1] in 1..1000) {"1~1000사이의 숫자를 입력해주세요"}
            //수열 생성
            //git test입니다
            //git test수정입니다
            val result = mutableListOf<Int>()
            for(i in 1..value[1]) {
                for(j in 1..i) {
                    result+=i
                }
            }
            // git test입니다 다른곳에 삽입 충돌
            //수열 원하는 구간 더하기
            val sumNum = result.slice(value[0]-1..value[1]-1).sum()//sum 함수가 받을 수 있는 타입 정해져있음
            println(sumNum)
            break
        } catch (ex:Exception) {
                println(ex.message)
        }
    }
}