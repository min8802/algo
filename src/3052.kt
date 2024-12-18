// 42로 나누었을 때 나머지가 다른 수가 몇개인지?
// 나머지들을 계산하고 리스트에 넣고
// 리스트 수만큼 for문 돌리고 같은 값 있으면 break 없으면 리스트에 추가

fun main() = with(System.`in`.bufferedReader()) {
    val numBasket = mutableListOf<Int>(42)
    val answerBasket = mutableListOf<Int>()
    for(i in 0..9) {
        val num = readLine().toInt()
        val remainder = num % 42

        if(remainder !in numBasket) { //!answerBasket.contains(num)
            numBasket.add(remainder)
        }
    }
//    println(numBasket)
    println(numBasket.size-1) //42는 빼주기
}