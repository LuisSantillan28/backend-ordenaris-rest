package server

class Person {

    Integer matricula
    String nombre
    String apellidoP
    String apellidoM    
    String direccion
    Date birthday
    Date dateCreated
    Date lastUpdated
    Boolean status = true

    //Area area

    static hasMany =[areas:Area]
    
    static constraints = {
        matricula(nullable:false, unique:true)
        nombre(blank:false, nullable:false, maxSize:30)
        apellidoP(blank:false, nullable:false, maxSize:20)
        apellidoM(blank:false, nullable:false, maxSize:20)
        direccion(blank:false, maxSize:1000)

        birthday(nullable:false)
    }

    static mapping = { 
        addresses lazy: false 
    } 

}
