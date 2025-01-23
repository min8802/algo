//fun main() = with(System.`in`.bufferedReader()) {
//    while (true) {
//        try {
//            // 처음 바닥에 놓였을 때 10cm 는 고정으로 더해줘
//            var totHeight = 10
//            val bowls = readLine().split("").filter { it.isNotBlank() }
//            // 두번째부터는 이전 기호랑 같으면 5cm 다른 10cm를 총 높이에 더해
//            for (i in 1.. bowls.size-1) {
//                  if(bowls[i] == bowls[i-1]) {
//                      totHeight += 5
//                  } else {
//                      totHeight += 10
//                  }
//            }
//            // 총 높이를 반환
//            println(totHeight)
//            break
//        } catch (ex:Exception) {
//                println(ex.message)
//        }
//    }
//}

//위에 반복문을 재귀로 바꿔보자
fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            // 처음 바닥에 놓였을 때 10cm 는 고정으로 더해줘
            var totHeight = 10
            val bowls = readLine().split("").filter { it.isNotBlank() }

            //함수는 bowls에 있는 기호들을 계속 받을 거야
            //( ) ( ) 이런 기호를 받았다고 치자
            //이때 가장 앞에 있는 두개 기호 비교해서 + 5인지 +10인지 연산해
            //기호는 가장 처음꺼 빼고 나머지 기호들을 다음 재귀함수에게 넘겨줘
            //그래서 넘어오는 스트링이 빈값이면 ? 재귀함수 종료

            fun addHeight(bowl : MutableList<String>) : Int {
//                println("bowl: $bowl")
                if (bowl.size == 1) return 0
                if(bowl[0] == bowl[1]) {
                    totHeight += 5
                } else {
                    totHeight += 10
                }
                return if(bowl.size == 0) 0 else addHeight(bowl.drop(1).toMutableList())
            }

            addHeight(bowls.toMutableList())
            // 총 높이를 반환
            println(totHeight)
            break
        } catch (ex:Exception) {
            println(ex.message)
        }
    }
}