fun main() {
    var school=name("Akirachix")
    intro("Daisi",22)
    d()
    description("Daisi")
    description("christine")

}
fun name(a:String){
    var school="Akirachix"
    print(school[0])
    print(school[2])
    print(school[3])

}
fun intro(name:String,age:Int){
    val sentence="Hi my name is $name and i am $age years old"
    println(sentence)
}
fun d(){
    var me="Daisi"
    println(me.length)

}
fun description(name2:String){
    if (name2=="Daisi"){
        println("That is me !")
    } else {
        println("I dont know who that is")
    }


}