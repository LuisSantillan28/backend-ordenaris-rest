package server

class Person {

    Integer matricula
    String nombre
    String direccion
    Date birthday
    Date dateCreated
    Date lastUpdated
    Boolean status = true

    //Area area

    static hasMany =[areas:Area]
    
    static constraints = {
        matricula(nullable:false, unique:true)
        nombre(blank:false, nullable:false, maxSize:140)
        direccion(blank:false, maxSize:1000)

        birthday(nullable:false)
    }

    static mapping = { 
        addresses lazy: false 
    } 

}
