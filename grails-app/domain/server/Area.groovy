package server

class Area {

    String clave
    String nombre

    Boolean status=true

    Date dateCreated
    Date lastUpdated

    //Person person


    static constraints = {
        clave(blank:false, nullable:false, unique:true)
        nombre(blank:false, nullable:false, maxSize:140)
    }


    static belongsTo = Person
    static hasMany = [persons:Person]

    static mapping = { 
    addresses lazy: false 
    } 

}
