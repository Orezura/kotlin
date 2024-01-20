fun a(nilai1: Int, nilai2: Int) :Int{
    return nilai1 + nilai2 
}
fun b(nilai1: Int, nilai2: Int) :Int{
    return nilai1 - nilai2 
}
fun c(nilai1: Int, nilai2: Int) :Int{
    return nilai1 / nilai2 
}
fun d(nilai1: Int, nilai2: Int) :Int{
    return nilai1 * nilai2 
}
fun e(nilai1: Int, nilai2: Int) :Int{
    return nilai1 * nilai2 * 1/2
}
fun f(nilai1: Int, nilai2: Int) :Int{
    return nilai1 * nilai2 
}

fun main(){
    val a = a(10,23)
    println("Ini adalah hasil penjumlahan $a")
    
    val b = b(10,23)
    println("Ini adalah hasil pengurangan $b")
    
    val c = c(10,23)
    println("Ini adalah hasil pembagian $c")
    
    val d = d(10,23)
    println("Ini adalah hasil perkalian $d")
    
    val e = e(10,20)
    println("Ini adalah hasil luas segitiga $e")
    
    val f = f(10,20)
    println("Ini adalah hasil luas persegi panjang $f")
}
