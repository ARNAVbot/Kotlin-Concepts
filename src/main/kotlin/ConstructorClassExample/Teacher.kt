package ConstructorClassExample

// primary constructor
class Teacher (name: String) {

    var name : String? = null
    init {
        // init block to initialize fields using params recevied from primary constructor
        this.name = name
    }

    constructor(name: String, id:Int): this(name) {
        // unlike primary constructor , secondary constructor has its own body.
        // BUT , secondary constructor ALWAYS has to call the primary constructor using the this keyword as shown above
        // ALSO, we cannot declare variable inside the secondary constructor like we can do in the primary constructor
        // The body of the secondary constructor is ALWAYS called after the init block
        this.name = name
    }
}