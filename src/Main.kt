//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

//fun main() = with(System.`in`.bufferedReader()) {
//    var index = 0
//    var maxNum = 0
//    for(i in 1..9) {
//        while (true) { //입력이 오류가 나면 catch 예외문을 출력하고 함수 계속 실행, break 전까지
//            try {
//                val input = readLine() // 9번 입력 받을 수 있음
//                require(input.all{ it.isDigit()}) {"숫자를 입력하세요"} //let은 input 라인 전체를 it으로 넘기고 all은 input 라인 각각의 char를 it으로 넘김
//                val element = input.toInt()
//                require(element in 1..99) { "$element 가 1보다 작거나 100보다 큽니다" } //사전 조건이어서 require 사용 (사후 조건 check)
//                if (maxNum < element) {
//                    maxNum = element
//                    index = i
//                }
//                println(i)
//                break
//            }
//            catch (ex: Exception){
//                println(ex.message)
//            }
//        }
//    }
//    println(maxNum)
//    println(index)
//}

fun main() = with(System.`in`.bufferedReader()) {
    var index = 0
    var maxNum = 0
    for(i in 1..9) {
        while (true) {
            try {
                val input = readLine()
                val element = input.toInt()
                require(element in 1..99) {"$element 가 1보다 작고 100보다 큽니다"}
                if(element > maxNum) {
                    maxNum = element
                    index = i
                }
                break
            } catch (ex: NumberFormatException) { // 입력값이 숫자가 아닐 때 예외처리
                println(ex.message)
            } catch (ex: IllegalArgumentException) { //require 가 발생시키는 IllegalArgumentException 에 대한 예외 처리
                println(ex.message)
            } //ex: Exception 에서 Exception 은 모든 예외를 처리하지만 예외 원인 알기 어려워서 위처럼 예외를 케이스에 맞게 구분
        }
    }
    println(maxNum)
    println(index)
}