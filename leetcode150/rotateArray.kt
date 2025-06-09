package leetcode150


fun main() {
    outer@for(i in 1..<10) {
        inner@for(j in 0..7) {
            if (j==6) continue@outer
        }
        print("$i")

    }
}


