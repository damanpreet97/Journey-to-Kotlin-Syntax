package high_level_function

/**
 * Created by avcbcoder on 17-06-2018.
 */

// In case of single params , we can use it
fun main(args: Array<String>) {
    revNprint("avcbcoder ", { s -> s.reversed() })
    revNprint("Using it ") { it.reversed() }

}

fun revNprint(s: String, f: (String) -> String) {
    var ans = f(s)
    println(ans)
}