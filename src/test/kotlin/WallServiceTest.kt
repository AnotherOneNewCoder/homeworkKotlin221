
import org.junit.jupiter.api.Test

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WallServiceTest {

    private var posts = emptyArray<Post>()
    private var id = 0



    @Test
    fun add() {
        id++
        val post = Post(0, 1,1,170123,1,"test", "testing", false, comment(1), likes(3))
        val postId = post.copy(id = id)
        posts += postId
        val result = postId.id
        assertEquals(1, result)
    }

    @Test
    fun updateExisting() {
        val service = WallService
        service.add(Post(0,1,1,10123,0,"test1", "test1",true,comment(0),likes(-3)))
        service.add(Post(0,1,1,10123,0,"test2", "test2",true,comment(0),likes(-3)))
        service.add(Post(0,1,1,10123,0,"test31", "test3",true,comment(0),likes(-3)))
        val update = Post(2,1,1,170123,0,"test4", "test4",true,comment(0),likes(-3))
        val result = service.update(update)
        assertTrue(result)
    }
    @Test
    fun updateNotExisting() {
        val service = WallService
        service.add(Post(0,1,1,10123,0,"test1", "test1",true,comment(0),likes(-3)))
        service.add(Post(0,1,1,10123,0,"test2", "test2",true,comment(0),likes(-3)))
        service.add(Post(0,1,1,10123,0,"test3", "test3",true,comment(0),likes(-3)))
        val update = Post(57,1,1,170123,0,"test4", "test4",true,comment(0),likes(-3))
        val result = service.update(update)
        assertFalse(result)
    }
}