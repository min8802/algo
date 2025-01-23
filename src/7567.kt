fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        try {
            // 처음 바닥에 놓였을 때 10cm 는 고정으로 더해줘
            var totHeight = 10
            val bowls = readLine().split("").filter { it.isNotBlank() }
            // 두번째부터는 이전 기호랑 같으면 5cm 다른 10cm를 총 높이에 더해
            for (i in 1.. bowls.size-1) {
                  if(bowls[i] == bowls[i-1]) {
                      totHeight += 5
                  } else {
                      totHeight += 10
                  }
            }
            // 총 높이를 반환
            println(totHeight)
            break
        } catch (ex:Exception) {
                println(ex.message)
        }
    }
}

