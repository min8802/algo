import kotlin.math.ceil  // 올림(ceil) 함수 사용을 위한 import

fun main() {
    // 1. 입력받은 값(A: 낮에 올라가는 거리, B: 밤에 미끄러지는 거리, V: 막대 길이)을 공백 기준으로 나누고 Long 타입으로 변환
    val (A, B, V) = readln().split(" ").map { it.toLong() }

    // 2. 정상에 도달하는 최소 일수 계산
    // - 하루 동안 실제 이동하는 거리는 (A - B)
    // - 하지만 마지막 날에는 B만큼 미끄러지지 않으므로, 최종적으로 올라가야 할 거리에서 B를 미리 빼줌 (V - B)
    // - 하루 이동 거리(A - B)로 나누어 필요한 일수를 구함
    // - 나누어 떨어지지 않는 경우를 고려하여 `ceil()`을 사용하여 올림 처리
    val days = ceil((V - B).toDouble() / (A - B)).toLong()
    //최종적으로 가야할 거리 / 하루에 갈 수 있는 거리
    // 3. 결과 출력 (걸리는 최소 일수)
    println(days)
}
