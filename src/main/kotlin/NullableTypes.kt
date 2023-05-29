/**
 * @author Stanislav Donetc
 * */


fun main() {
    var a: String = "Hello"
    //  a = null; NPE excepted

    var b: String? = "Hello"
    b = null;
    //b.length error only saveCall

    //return length if == null return null
    println(b?.length)
    //bob.?department?.head?.name -> null (NPE excepted)


    //Elvis operator - ?:
    var res = b?.length ?: -1

    //!! - if variable == null -> NullPointerException
    b = if ((0..10).random() > 5) "testString" else null
    var res2 = b!!.length
    println(res2)

}