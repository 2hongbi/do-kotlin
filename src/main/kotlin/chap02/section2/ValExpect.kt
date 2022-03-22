package chap02.section2

fun main() { // p.56, ctrl+shift+p 로 추론된 자료형 확인
    val num05 = 127 // int
    val num06 = -32678 // int
    val num07 = 214783647
    val num08 = 9223372036854775807 // Long

    val exp01 = 123
    val exp02 = 123L
    val exp03 = 0x0F // 접두사 0x를 사용해 16진 표기가 사용된 int형으로 추론
    val exp04 = 0b0001011 // 접두사 0b를 사용해 2진 표기가 사용된 int형으로 추론

    // 보통 숫자값은 Int형으로 추론되기 때문에, 좀 더 작은 범위의 정수 자료형인 Byte형이나 Short형을 사용하기 위해서는 다음과 같이 명시
    val exp08: Byte = 127
    val exp09 = 32767
    val exp10: Short = 32767

    // 부호가 없는 정수 자료형을 사용할 때는 다음과 같이 값에 식별자를 사용. 자료형을 명시하지 않으면 값 할당 불가
    val uint: UInt = 153u
    val ushort: UShort = 65353u
    val ulong: ULong = 46322342uL
    val uByte: UByte = 255u

    // 언더스코어로 자릿값 구분 가능
    val number = 1_000_000
    val cardNum = 1234_1234_1234L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010
}
