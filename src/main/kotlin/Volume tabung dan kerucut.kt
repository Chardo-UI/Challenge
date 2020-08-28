import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    println("  ")
    println("----Menghitung Volume Bangun ruang----")
    println("1. hitung Volume Kerucut ")
    println("2. hitung Volume tabung ")
    println("Masukkan pilihan anda : ")
    val pilih = reader.nextInt()
    val  volume = if (pilih == 1) {
        println("==== Menghitung Volume Kerucut ====")
        val phi = 3.14
        print("Masukkan jari-jari kerucut : ")
        val r = reader.nextInt()
        print("Masukkan tinggi kerucut : ")
        val t = reader.nextInt()
        val user = hitungvolumekerucut(phi, r, t)
    } else if (pilih == 2) {
        println("==== Menghitung Volume Tabung ====")
        val phi = 3.14
        print("Masukkan jari-jari tabung : ")
        val r = reader.nextInt()
        print("Masukkan tinggi tabung : ")
        val t = reader.nextInt()
        val user = hitungvolumetabung(phi, r, t)
    }else {
        print("menu yang anda inputkan tidak ada")
    }
}
fun hitungvolumekerucut(phi : Double, r : Int, t : Int ) {
    val volumekerucut =  phi * r * r * t / 3
    val dibulatkan:Double = String.format("%.2f", volumekerucut).toDouble()
    print("Volume kerucut adalah = $dibulatkan")
    do {
        main()
    }while (true)
}
fun hitungvolumetabung(phi : Double, r: Int, t: Int) {
    val volumetabung = phi * r * r * t
    val bulatkan : Double = Math.round(volumetabung * 100.0) / 100.0
    print("Volume tabung adalah = $bulatkan")

    do {
        main()
    }while (true)
}
