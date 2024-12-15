
// 띄어쓰기로 되어있는 2개의 숫자를 받아서 두 숫자의 합을 반환하는 프로그램
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        try {
            //입력 처리, 검증
            val line = readLine() ?: break // 입력값 null 이면 종료
            if(line.lowercase() == "exit") break
            if(line.split(" ").size != 2) {
                println("입력값은 2개 입력해 주세요")
                continue // while문의 다음 반복으로 넘어감
            }
            val (inputNum1, inputNum2) = line.split(" ").map { it.toInt()}


            //출력 처리
            val sum = inputNum1 + inputNum2
            println(sum)
        } catch(ex: NumberFormatException) { //numberFormatException 먼저 검증
            println("숫자를 입력해 주세요")
        } catch(ex: Exception){
            println(ex.message)
        }
    }
}