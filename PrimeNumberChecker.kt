fun main(){
    print("User should input the number to be checked: ")
    isPrime()

}

fun isPrime(){
    var number_to_be_check = readln().toInt()
    while (2<number_to_be_check){
        if(number_to_be_check%2==0)
          println( "$number_to_be_check is not a prime number")
        else
           println("$number_to_be_check is a prime number")
        break
    }
}