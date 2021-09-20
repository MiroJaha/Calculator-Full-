fun main (){
    println("Welcome to My Calculator")

    while(true) {
        print("Please Enter First Number: ")
        var num1 = callNumber()
        println(num1)
        print("Please Enter Operator: ")
        var operator = callOperator()
        println("$num1 $operator")
        print("Please Enter Second Number: ")
        var num2 = callNumber()
        var check = true
        if (operator == "/")
            check = checkDev(num2)
        if (!check) {
            println("you can't Divide by 0")
            continue
        }
        calculator(num1,num2,operator)
        var c=0
        while(true){
            print("Would you like to Operate more numbers? (y/n) >> ")
            when (readLine()) {
                "y" -> {
                    c=1
                    break
                }
                "n" ->{
                    c=0
                    break
                }
                else -> println("Wrong Input")
            }
        }
        if (c==0)
            break
    }


    println("Thank You, Hope you had some fun")

}

fun checkDev(num:Int):Boolean{
    return num != 0
}

fun callOperator():String{
    while(true) {
        when (readLine()) {
            "+" -> return "+"
            "-" -> return "-"
            "/" -> return "/"
            "*" -> return "*"
            else -> println("Please Enter Valid Operator")
        }
    }
}

fun callNumber():Int{
    while(true) {
        return try {
            readLine()!!.toInt()
        } catch (e: Exception) {
            0
        }
    }
}

fun calculator(num1:Int,num2:Int,x:String){
    when(x){
        "+" ->println("$num1 + $num2 = "+(num1+num2))
        "-" ->println("$num1 - $num2 = "+(num1-num2))
        "/" ->println("$num1 / $num2 = "+(num1/num2))
        else ->println("$num1 * $num2 = "+(num1*num2))
    }
}
