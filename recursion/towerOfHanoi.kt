package recursion

fun main() {

    towerOfHanoi(3, "A", "B", "C")

}

fun towerOfHanoi(n:Int, source: String, aux:String, destination:String) {
    if(n == 1) {
        println("move disk 1 from $source to $destination")
        return
    }

    towerOfHanoi(n-1, source, destination, aux)
    println("move disk $n from $source to $destination")
    towerOfHanoi(n-1, aux, source, destination)
}