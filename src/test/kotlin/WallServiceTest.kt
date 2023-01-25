
import attach.*
import files.*
import org.junit.jupiter.api.Test

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WallServiceTest {

    private var posts = emptyArray<Post>()
    private var id = 0
    val audioAttach = AudioAttachment(16, 16, 250123, "Audio",300,
        Audio("Nirvana", "www.nirvana.org", "Smells like teen spirit")
    )
    val videoAttach = VideoAttachment(17, 16, 250123, "Video",900,
        Video("Simpsons", "www.ourweekend.org", "Family in the forest")
    )
    val photoAttach = PhotoAttachment(18, 16, 250123, "Photo",100, Photo("Simpsons", "www.ourweekend.org", "We met bear"))
    val fileAttach = FileAttachment(19, 16, 250123, "File",100, File("Simpsons", "www.ourweekend.org", "Our family notes"))
    val presentAttach = PresentAttachment(20, 16, 250123, "Present",100, Present("Simpsons", "www.ourweekend.org", "Present from forest"))
    val arrayAttach = arrayOf(audioAttach,videoAttach,photoAttach,fileAttach,presentAttach)


    @Test
    fun add() {
        id++
        val post = Post(0, 1,1,170123,1,"test", "testing", false, comment(1), likes(3), arrayAttach)
        val postId = post.copy(id = id)
        posts += postId
        val result = postId.id
        assertEquals(1, result)
    }

    @Test
    fun updateExisting() {
        val service = WallService
        service.add(Post(0,1,1,10123,0,"test1", "test1",true,comment(0),likes(-3),arrayAttach))
        service.add(Post(0,1,1,10123,0,"test2", "test2",true,comment(0),likes(-3),arrayAttach))
        service.add(Post(0,1,1,10123,0,"test31", "test3",true,comment(0),likes(-3),arrayAttach))
        val update = Post(2,1,1,170123,null,"test4", "test4",true,comment(0),likes(-3),arrayAttach)
        val result = service.update(update)
        assertTrue(result)
    }
    @Test
    fun updateNotExisting() {
        val service = WallService
        service.add(Post(0,1,1,10123,0,"test1", "test1",true,comment(0),likes(-3),arrayAttach))
        service.add(Post(0,1,1,10123,0,"test2", "test2",true,comment(0),likes(-3),arrayAttach))
        service.add(Post(0,1,1,10123,0,"test3", "test3",true,comment(0),likes(-3),arrayAttach))
        val update = Post(57,1,1,170123,null,"test4", "test4",true,comment(0),likes(-3),arrayAttach)
        val result = service.update(update)
        assertFalse(result)
    }
}