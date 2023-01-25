package attach

import files.File


class AudioAttachment(
    override val id: Int,
    override val ownerId: Int,
    override val date: Int,
    override val title: String,
    override val size: Long,
    val type: File
) : Attachment {
    override fun toString(): String {
        return "Id: $id, Title: $title $type"
    }
}

class VideoAttachment(
    override val id: Int,
    override val ownerId: Int,
    override val date: Int,
    override val title: String,
    override val size: Long,
    val type: File
) : Attachment {
    override fun toString(): String {
        return "Id: $id, Title: $title $type"
    }
}
class PhotoAttachment(
    override val id: Int,
    override val ownerId: Int,
    override val date: Int,
    override val title: String,
    override val size: Long,
    val type: File
) : Attachment {
    override fun toString(): String {
        return "Id: $id, Title: $title $type"
    }
}
class FileAttachment(
    override val id: Int,
    override val ownerId: Int,
    override val date: Int,
    override val title: String,
    override val size: Long,
    val type: File
) : Attachment {
    override fun toString(): String {
        return "Id: $id, Title: $title $type"
    }
}
class PresentAttachment(
    override val id: Int,
    override val ownerId: Int,
    override val date: Int,
    override val title: String,
    override val size: Long,
    val type: File
) : Attachment {
    override fun toString(): String {
        return "Id: $id, Title: $title $type"
    }
}