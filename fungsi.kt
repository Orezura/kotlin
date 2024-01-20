fun lulus (name : String, n1:Int, n2:Int, n3: Int, n4: Int, g:String): String {
    return ("Siswa bernama $name dengan deskripsi nilai berikut:\nNilai Matematika: $n1\nNilai B.inggris: $n2\nNilai B.Indonesia: $n3\nNilai PKN: $n4\nDinyatakan $g ")
}

fun main() {
   val lulus = lulus("Udin🤫🧏", 80, 90, 100, 75, "Lulus🗣")
   print(lulus)
}
