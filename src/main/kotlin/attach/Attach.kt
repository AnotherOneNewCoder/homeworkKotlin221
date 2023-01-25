package attach

interface Attachment {
    val id: Int
    val ownerId: Int
    val date: Int
    val title: String
    val size: Long
}