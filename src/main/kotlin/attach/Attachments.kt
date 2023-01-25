package attach

import files.*


sealed class Attachment(val type: String)

data class VideoAttachment(val video: Video) : Attachment("video")
data class AudioAttachment(val audio: Audio) : Attachment("audio")
data class PhotoAttachment(val photo: Photo) : Attachment("photo")
data class FileAttachment(val file: File) : Attachment("file")
data class PresentAttachment(val present: Present) : Attachment("present")

//fun main() {
//    val attachment: Attachment = VideoAttachment("stuff")
//    println(attachment.type)
//}

//class AudioAttachment(
//    override val id: Int,
//    override val ownerId: Int,
//    override val date: Int,
//    override val title: String,
//    override val size: Long,
//    val type: File
//) : Attachment {
//    override fun toString(): String {
//        return "Id: $id, Title: $title $type"
//    }
//}
//
//class VideoAttachment(
//    override val id: Int,
//    override val ownerId: Int,
//    override val date: Int,
//    override val title: String,
//    override val size: Long,
//    val type: File
//) : Attachment {
//    override fun toString(): String {
//        return "Id: $id, Title: $title $type"
//    }
//}
//class PhotoAttachment(
//    override val id: Int,
//    override val ownerId: Int,
//    override val date: Int,
//    override val title: String,
//    override val size: Long,
//    val type: File
//) : Attachment {
//    override fun toString(): String {
//        return "Id: $id, Title: $title $type"
//    }
//}
//class FileAttachment(
//    override val id: Int,
//    override val ownerId: Int,
//    override val date: Int,
//    override val title: String,
//    override val size: Long,
//    val type: File
//) : Attachment {
//    override fun toString(): String {
//        return "Id: $id, Title: $title $type"
//    }
//}
//class PresentAttachment(
//    override val id: Int,
//    override val ownerId: Int,
//    override val date: Int,
//    override val title: String,
//    override val size: Long,
//    val type: File
//) : Attachment {
//    override fun toString(): String {
//        return "Id: $id, Title: $title $type"
//    }
//}