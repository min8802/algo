
//바구니N개 각각의 바구니는 1번~N번
//공이 1개씩 들어있고 처음에는 바구니에 적혀있는 번호랑 같은 공있음
//M번 공을 바꾸려함
//공을 바꿀 바구니 2개 선택 (2번째 줄부터)
//두 바구니의 공을 서로 교환

var endNum : Int = 0
var shuffleNum : Int = 0

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try{
            val input = readLine().split(" ").map { it.toInt() }
            endNum = input[0]
            shuffleNum = input[1]
            if(input[0] in 1..100 && input[1] in 1..100)  {
                break
            } else {
                throw IllegalArgumentException()
            }
        } catch (ex: Exception) {
            println("1~100사이 숫자 입력하세요")
        }
    }

    val basketNumber = (1..endNum).toMutableList()
//    println(basketNumber)
    for(i in 1..shuffleNum) {
        try {
            val line = readLine().split(" ").map { it.toInt() }
            val temp = basketNumber[line[0]-1]
//            println("$temp")

            basketNumber[line[0]-1] = basketNumber[line[1]-1]
            basketNumber[line[1]-1] = temp
//            println(basketNumber)
        } catch (ex:Exception) {
            println(ex.message)
        }
    }
    println(basketNumber.joinToString(" "))
}
