import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

fun main(args: Array<String>) {
    print("Please input any number: ")
    val inputText = readLine()

    val bpe = BCryptPasswordEncoder(11)
    val hashText = bpe.encode(inputText)

    println("Input text: $inputText")
    println("Hash text : $hashText")
    println("isMatch   : ${bpe.matches(inputText, hashText)}")
}